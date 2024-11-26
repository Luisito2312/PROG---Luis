import java.util.Scanner;

public class Piramide {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario la altura de la pirámide
        System.out.print("Introduce la altura de la pirámide: ");
        int altura = scanner.nextInt();

        // Dibujar la pirámide
        for (int i = 1; i <= altura; i++) {
            // Espacios en blanco antes de los asteriscos
            for (int j = 0; j < altura - i; j++) {
                System.out.print(" ");
            }

            // Asteriscos
            for (int k = 0; k < (2 * i - 1); k++) {
                System.out.print("*");
            }

            // Salto de línea al final de cada nivel
            System.out.println();
        }

        scanner.close();
    }
}
