public class PiramideLuis {
    public static void main(String[] args) {
        
        System.out.println("Introduce la altura de la piramide");
        int altura = Integer.parseInt(System.console().readLine());

        for (int i = 1; i <= altura; i++) {
            
            for (int j = 0; j < altura - i; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < (2 * i - 1); k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
