package Arrays;

public class Temperaturas {
    
    private static final int DIAS = 365;
    public static void main(String[] args) {
        
        double[] numeros;
        numeros = new double[DIAS];

        for(int i = 0; i < DIAS; i++ ) {
            numeros[i] = (double)(Math.random() * 45);
        }

        for (double i : numeros) {
            System.out.print(i + " ");
        }

        System.out.print("\neste es el ultimo numero: " + numeros[DIAS - 1]);
    }

    //la funcion muestra las temperaturas de un mes dado
    public static void mostrarMes(double[] datos, int mes) {

    }
}
