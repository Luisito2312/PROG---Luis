package java.T3;

public class Ejercicio3 {
    public static void main(String[] args) {
        
        System.out.println("Introduzca la cantidad de pesetas que quiere pasar a euros");
        int pesetas = Integer.parseInt(System.console().readLine());

        double euros = pesetas / 166.6;

        System.out.printf(pesetas + " pesetas son %.2f" , euros);

    }
}
