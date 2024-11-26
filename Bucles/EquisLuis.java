public class EquisLuis {
    public static void main(String[] args) {
        
        int altura;

        System.out.print("Introduce la altura de la X: ");
        altura = Integer.parseInt(System.console().readLine());

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
    }
}
