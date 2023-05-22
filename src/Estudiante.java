public class Estudiante {
    private int inscripcion;
    private String nombre;
    private double patrimonio;
    private int estrato;

    public Estudiante(int inscripcion, String nombre, double patrimonio, int estrato) {
        this.inscripcion = inscripcion;
        this.nombre = nombre;
        this.patrimonio = patrimonio;
        this.estrato = estrato;
    }

    public double calcularPagoMatricula() {
        double pago = 50000;
        if (this.patrimonio > 2000000 && this.estrato > 3) {
            pago += this.patrimonio * 0.03;
        }
        return pago;
    }

    public int getInscripcion() {
        return inscripcion;
    }

    public String getNombre() {
        return nombre;
    }
}
