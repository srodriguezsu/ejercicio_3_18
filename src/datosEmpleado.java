import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;

public class datosEmpleado extends JFrame {
    protected JPanel ConsultaEmpleado;
    private JTextField inCodigo;
    private JLabel tagCodigo;
    private JLabel tagNombre;
    private JLabel tagHoras;
    private JLabel tagPagoHora;
    private JLabel tagRetencion;
    private JSlider inRetefuente;
    private JTextField inNombre;
    private JButton btnConfirmar;
    private JTextField inHoras;
    private JTextField inValorHora;
    private JPanel panTitulo;
    private JPanel panBoton;
    private JLabel tagTitulo;
    private JLabel porcentaje;

    public datosEmpleado() {
    btnConfirmar.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            NumberFormat pesos = NumberFormat.getCurrencyInstance();

            Empleado trabajador = new Empleado(Integer.parseInt(inCodigo.getText()), inNombre.getText());
            trabajador.setSalario(Float.parseFloat(inHoras.getText()),Float.parseFloat(inValorHora.getText()),(inRetefuente.getValue()) );

            JOptionPane.showMessageDialog(btnConfirmar,"Hola " + inNombre.getText() +
                    "\nTu salario bruto es: " + pesos.format(trabajador.getSalarioBruto())  +
                    "\nTu salario neto es: " + pesos.format(trabajador.getSalarioNeto())  );
        }
    });
    inRetefuente.addChangeListener(new ChangeListener() {
        @Override
        public void stateChanged(ChangeEvent e) {
            porcentaje.setText(Integer.toString(inRetefuente.getValue()) + "%");
        }
    });
}



}
