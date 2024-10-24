package java.T3;

public class Ejercicio2 {
    public static void main(String[] args) {
        
        System.out.println("Introduzca la cantidad de euros que quiere pasar a pesetas");
        double euros = Integer.parseInt(System.console().readLine());

        double  pesetas = euros * 166;

        System.out.printf(euros + " euros son %.0f", pesetas);
    }
}
