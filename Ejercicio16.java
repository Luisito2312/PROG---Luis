import java.util.Scanner;

public class Ejercicio16 {
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
            // Imprimir los espacios antes del caracter
            for (int j = i; j < altura; j++) {
                System.out.print(" ");
            }

            // Imprimir los caracteres en cada fila
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print(caracter);
            }

            // Salto de línea después de cada fila
            System.out.println();
        }

        // Cerrar el scanner
        scanner.close();
    }
}

