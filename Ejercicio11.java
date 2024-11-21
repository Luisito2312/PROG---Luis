import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer datos desde el teclado
        Scanner scanner = new Scanner(System.in);
        
        // Mensaje de inicio
        System.out.println("Cálculo de una potencia");
        
        // Solicitar al usuario que ingrese la base
        System.out.print("Introduzca la base: ");
        int base = scanner.nextInt();
        
        // Solicitar al usuario que ingrese el exponente
        System.out.print("Introduzca el exponente: ");
        int exponente = scanner.nextInt();
        
        // Calcular la potencia usando Math.pow() para valores decimales o bucles para enteros
        int resultado = 1;
        for (int i = 0; i < exponente; i++) {
            resultado *= base;
        }
        
        // Mostrar el resultado
        System.out.println(base + "^" + exponente + " = " + resultado);
        
        // Cerrar el scanner
        scanner.close();
    }
}
