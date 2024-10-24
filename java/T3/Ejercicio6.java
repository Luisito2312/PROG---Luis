package java.T3;

public class Ejercicio6 {
    public static void main(String[] args) {
        
        System.out.println("Area de un triángulo");
        System.out.println("-----------------------");
        System.out.println("Introduzca la longitud de la base (cm)");
        double base = Double.parseDouble(System.console().readLine());
    
        System.out.println("Introduzca la altura (cm) ");
        double altura = Double.parseDouble(System.console().readLine());
    
        System.out.println("El área del triangulo es: " + ((base * altura ) / 2) + "cm");
    }
}
