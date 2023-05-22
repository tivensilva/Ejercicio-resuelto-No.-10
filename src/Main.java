import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Solicitar los datos del estudiante
        int inscripcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de inscripción"));
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del estudiante");
        double patrimonio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el patrimonio del estudiante"));
        int estrato = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el estrato del estudiante"));

        // Crear el objeto estudiante con los datos recogidos
        Estudiante estudiante = new Estudiante(inscripcion, nombre, patrimonio, estrato);

        // Calcular el pago de la matrícula y mostrar el resultado
        double pago = estudiante.calcularPagoMatricula();
        JOptionPane.showMessageDialog(null, "El estudiante " + estudiante.getNombre() +
                " con número de inscripción " + estudiante.getInscripcion() +
                " debe pagar por la matrícula: " + pago);
    }
}
