public class Estudiante {
    private String nombre;
    private double[] notas;

    public Estudiante(String nombre, double nota1, double nota2, double nota3) {
        this.nombre = nombre;
        this.notas = new double[3];
        this.notas[0] = nota1;
        this.notas[1] = nota2;
        this.notas[2] = nota3;
    }

    public static double calcularMedia(double[] notas) {
        double nota = 0;

        for (double d : notas) {
            nota += d;
        }

        return nota / notas.length; 
    }

    @Override
    public String toString() {
        return "La media del estudiante '" + nombre + "' es: " + calcularMedia(notas);
    }
}