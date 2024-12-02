package Arrays;

public class EjemploArray {
    
    public static final int MAXIMO = 100;
    public static void main(String[] args) {
        
        // int[] arrayNumeros; //definir array de enteros
        // arrayNumeros = new int[3];

        // System.out.println("Introduce 3 valores, pulsa enter depues de introducir cada uno");
        // arrayNumeros[0] = Integer.parseInt(System.console().readLine());
        // arrayNumeros[1] = Integer.parseInt(System.console().readLine());
        // arrayNumeros[2] = Integer.parseInt(System.console().readLine());

        // int[] datos = {1,2,3,4,5,6,7,8,9};

        // for (int i : arrayNumeros) {
        //     System.out.println(i);
        // }

        // int [][] numeros2 = new int[3][5];

        // for (int i = 0; i < 3; i++) {
        //     for (int j = 0; j < 5; j++) {
        //         numeros2[i][j] = j;
        //         System.out.println(numeros2[i][j]);
        //     }
        // }

        int[] numeros;
        numeros = new int[MAXIMO];

        for(int i = 0; i < MAXIMO; i++ ) {
            numeros[i] = (int)(Math.random() * MAXIMO);
        }

        for (int i : numeros) {
            System.out.print(i + " ");
        }

        System.out.print("\neste es el ultimo numero: " + numeros[MAXIMO - 1]);
    }
}
