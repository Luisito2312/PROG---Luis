package Funciones;

public class ProbarFunciones {
    public static void main(String[] args) {
        
        int numero;
        int siguientePrimo;

        System.out.println("Introduce un numero");
        numero = Integer.parseInt(System.console().readLine());

        if (Matematicas.esCapicua(numero)) {
            System.out.println("El numero es capicua");
        } else {
            System.out.println("El numero no es capicua");
        }

        if (Matematicas.esPrimo(numero)) {
            System.out.println("El numero es primo");
        } else {
            System.out.println("El numero no es primo");
        }

        siguientePrimo = Matematicas.siguientePrimo(numero);

        System.out.println("El siguiente numero primo despues de " + numero + " es " + siguientePrimo);
    }
}
