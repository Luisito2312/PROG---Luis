package Tema5;

public class Ejercicio2 {
    public static void main(String[] args) {
        int num;
        System.out.println("Introduce tu edad");
        num = Integer.parseInt(System.console().readLine());

        for (int i = 1; i <= num; i++) {
            System.out.println(i);
        }
    }
}
