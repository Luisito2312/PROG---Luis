package java.T3;

public class Ejercicio10 {
    public static void main(String[] args) {
        
        System.out.print("Introduce el número de Mb: ");
        double mb = Integer.parseInt(System.console().readLine());

        double kb = mb * 1000;

        System.out.println(mb + "Mb son " + kb + "kb");
    }
}
