import java.util.Scanner;

public class Equis {
    public static void main(String[] args) {
        int altura;
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca la altura de la X:  ");
        altura = sc.nextInt();

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura; j++) {
                if (j == i || j == altura - i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
    
}
