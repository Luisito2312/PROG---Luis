import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada desde el teclado
        Scanner scanner = new Scanner(System.in);

        // Solicitar la altura de la pirámide
        System.out.print("Introduce la altura de la pirámide: ");
        int altura = scanner.nextInt();

        // Solicitar el carácter para dibujar la pirámide
        System.out.print("Introduce el caracter con el que dibujar la pirámide: ");
        String caracter = scanner.next();

        // Bucle para cada fila de la pirámide
        for (int i = 1; i <= altura; i++) {
            // Imprimir los espacios antes del carácter (centrado)
            for (int j = i; j < altura; j++) {
                System.out.print(" ");
            }

            // Imprimir los caracteres
            for (int k = 1; k <= (2 * i - 1); k++) {
                // Solo imprimir el carácter en los bordes (primero y último)
                if (k == 1 || k == (2 * i - 1) || i == altura) {
                    System.out.print(caracter);
                } else {
                    System.out.print(" ");  // Vacío en el interior
                }
            }

            // Salto de línea después de cada fila
            System.out.println();
        }

        // Cerrar el scanner
        scanner.close();
    }
}
