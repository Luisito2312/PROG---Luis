public class PiramideVaciaLuis {
    public static void main(String[] args) {
        
        int altura;

        System.out.print("Introduce la altura de la piramide: ");
        altura = Integer.parseInt(System.console().readLine());

        for (int i = 1; i <= altura; i++) {
            for (int j = 0; j < altura - i; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < (2 * i - 1); k++) {
                if (k == 0 || k == (2 * i - 2) || i == altura) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}
