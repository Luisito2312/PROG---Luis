
import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce tu edad");
        int edad = sc.nextInt();

        System.out.printf("Tienes %d años", edad);
        sc.close();
    }
}
