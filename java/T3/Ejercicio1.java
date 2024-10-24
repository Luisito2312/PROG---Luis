package java.T3;

public class Ejercicio1 {
    public static void main(String[] args) {
        System.out.println("Este programa multiplica dos numeros enteros");

        System.out.println("Introduce el primer numero");
        int num1 = Integer.parseInt(System.console().readLine());

        System.out.println("Inroduzca el segundo numero");
        int num2 = Integer.parseInt(System.console().readLine());

        System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));

    }
}
