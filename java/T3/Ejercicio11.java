package java.T3;

public class Ejercicio11 {
    public static void main(String[] args) {
        System.out.print("Introduce el número de Kb: ");
        double kb = Integer.parseInt(System.console().readLine());

        double mb = kb / 1000;

        System.out.println(kb + "Kb son " + mb + "Mb");
    }
}
