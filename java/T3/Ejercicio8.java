package java.T3;

public class Ejercicio8 {
    public static void main(String[] args) {
        System.out.println("Introduzca el numero de horas trabajadas en la semana");
        int numHoras = Integer.parseInt(System.console().readLine());

        System.out.println("Su salario semanal es de " + (numHoras * 12) + " euros");
    }
}
