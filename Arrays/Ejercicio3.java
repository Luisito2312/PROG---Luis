package Arrays;

public class Ejercicio3 {
    public static void main(String[] args) {
        
        int[] numeros = new int[10];
        System.out.println("Por favor introduce 10 numeros enteros");

        for (int i = 9; i >= 0; i--) {
            numeros[i] = Integer.parseInt(System.console().readLine());
        }

        for (int i : numeros) {
            System.out.print(i + " ");
        }
    }
}
