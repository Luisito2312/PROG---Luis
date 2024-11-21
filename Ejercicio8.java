import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer datos desde el teclado
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario que ingrese un número
        System.out.print("Introduzca un número: ");
        int numero = scanner.nextInt();
        
        // Imprimir el encabezado de la tabla
        System.out.println("n  |  n2  |  n3");
        System.out.println("----------------------");
        
        // Iterar sobre los 5 primeros números a partir del número ingresado
        for (int i = numero; i < numero + 5; i++) {
            int cuadrado = i * i;  // Calcular el cuadrado del número
            int cubo = i * i * i;  // Calcular el cubo del número
            
            // Imprimir cada fila de la tabla
            System.out.printf("%2d  |  %4d  |  %5d%n", i, cuadrado, cubo);
        }
        
        // Cerrar el Scanner
        scanner.close();
    }
}
