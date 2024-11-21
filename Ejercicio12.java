import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer datos desde el teclado
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese la base
        System.out.print("Introduzca la base: ");
        int base = scanner.nextInt();

        // Solicitar al usuario que ingrese el exponente máximo
        System.out.print("Introduzca el exponente máximo: ");
        int exponenteMaximo = scanner.nextInt();

        // Imprimir las potencias de la base con exponentes entre 1 y el exponente máximo
        for (int i = 1; i <= exponenteMaximo; i++) {
            int resultado = 1; // Inicializamos el resultado en 1 para multiplicar

            // Calcular la potencia manualmente
            for (int j = 1; j <= i; j++) {
                resultado *= base; // Multiplicamos la base por sí misma
            }

            // Mostrar el resultado
            System.out.println(base + "^" + i + " = " + resultado);
        }

        // Cerrar el scanner
        scanner.close();
    }
}

