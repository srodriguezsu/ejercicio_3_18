/* 18. Se tiene la siguiente información de un empleado:
        · código del empleado,
        · nombres,
        · número de horas trabajadas al mes,
        · valor hora trabajada,
        · porcentaje de retención en la fuente.
        Haga un algoritmo que muestre: código, nombres, salario bruto y salario neto */
public class Empleado {
    private final int codigo;
    private final String nombre;
    private float salarioBruto, salarioNeto;

    public Empleado(int codigo, String nombre) {
        this.nombre = nombre;
        this.codigo = codigo;
    }


    public void setSalario(float horasTrabajadas, float valorHora, float retencion){ /* retencion en % */
        this.salarioBruto = horasTrabajadas * valorHora;
        this.salarioNeto = salarioBruto - (salarioBruto*(retencion/100));
    }
    public int getCodigo() {
        return codigo;
    }

    public float getSalarioBruto() {
        return salarioBruto;
    }

    public float getSalarioNeto() {
        return salarioNeto;
    }

    public String getNombre() {
        return nombre;
    }

}
