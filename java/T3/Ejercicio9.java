package java.T3;

public class Ejercicio9 {
    public static void main(String[] args) {
        System.out.println("Volumen de un cono");
        System.out.println("-------------------");
        System.out.print("Introduce la altura: ");
        double altura = Double.parseDouble(System.console().readLine());
        System.out.print("Introduce el radio de la base: ");
        double radio = Double.parseDouble(System.console().readLine());

        double volumen = (Math.PI * (radio * radio) * altura) / 3;

        System.out.print("El volumen del cono es: " );
        System.out.println(volumen);
    }
}
