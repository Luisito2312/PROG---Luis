
public class Ejemplo1 {
    public static void main(String[] args) {
        System.out.println("Cual es tu nombre");
        String nombre = System.console().readLine();

        System.out.println("y tu edad?");
        int edad = Integer.parseInt(System.console().readLine());

        System.out.println("Te llamas " + nombre + " y tienes " + edad + " años");
    }
}