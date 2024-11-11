public class Ejercicio13 {
    public static void main(String[] args) {
        int num;
        int primo = 0;
        System.out.print("Introduzca un numero entero: ");
        num = Integer.parseInt(System.console().readLine());

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                primo++;
            }
        }

        if (primo != 2) {
            System.out.println("El numero no es primo");
        } else {
            System.out.println("El numero es primo");
        }
    }
}
