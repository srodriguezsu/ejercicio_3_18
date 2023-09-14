import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        datosEmpleado ventana = new datosEmpleado();
        ventana.setContentPane(ventana.ConsultaEmpleado);
        ventana.setTitle("Calcular salario");
        ventana.setSize(600,600);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}