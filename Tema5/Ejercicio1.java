package Tema5;

public class Ejercicio1 {
    public static void main(String[] args) {
        
        int num;
        int cont = 0;
        int num2 = 0;

        System.out.println("Introduce numeros y pulse ENTER, para acabar introduce un numero negativo");
        System.out.print("? ");
        num = Integer.parseInt(System.console().readLine());

        while (num >= 0) {
            cont++;
            num2 = num2 + num;

            System.out.print("? ");
            num = Integer.parseInt(System.console().readLine());
        }

        System.out.println("Hay en total " + cont + " numeros, que suman: " + num2);
    }
}
