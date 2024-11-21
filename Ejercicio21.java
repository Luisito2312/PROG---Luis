import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer los datos desde el teclado
        Scanner scanner = new Scanner(System.in);

        // Solicitar la altura de la pirámide
        System.out.print("Introduce la altura de la pirámide: ");
        int altura = scanner.nextInt();

        // Imprimir la pirámide numérica
        System.out.println("PIRÁMIDE NUMÉRICA");

        // Bucle para cada fila
        for (int i = 1; i <= altura; i++) {
            // Imprimir los espacios antes de los números (centrado)
            for (int j = i; j < altura; j++) {
                System.out.print(" ");
            }

            // Imprimir la parte ascendente de la pirámide (de 1 hasta i)
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // Imprimir la parte descendente de la pirámide (de i-1 hasta 1)
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }

            // Salto de línea después de cada fila
            System.out.println();
        }

        // Cerrar el scanner
        scanner.close();
    }
}
