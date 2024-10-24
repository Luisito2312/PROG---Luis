package java.T3;

public class Ejercicio4 {
    public static void main(String[] args) {
        
        System.out.println("Introduzca el primer numero ");
        double num1 = Integer.parseInt(System.console().readLine());

        System.out.println("Introduce el segundo numero");
        double num2 = Integer.parseInt(System.console().readLine());

        System.out.println("x = " + num1);
        System.out.println("y = " + num2); 
        System.out.println("x + y = " + (num1+num2) );
        System.out.println("x - y = " + (num1 - num2) );
        System.out.println("x / y = " + (num1 / num2) );
        System.out.println("x * y = " + (num1 * num2) );
    }
}
