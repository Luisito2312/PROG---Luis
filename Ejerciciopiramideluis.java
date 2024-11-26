public class Ejerciciopiramideluis {
    public static void main(String[] args) {
        
        int altura;

        System.out.println("Introduce la altura de la piramide");
        altura = Integer.parseInt(System.console().readLine());

        for (int i = 1; i <= altura; i++) {
            for (int j = 0; j < (altura - i); j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < (2 * i - 1); j++) {
                System.out.print("*");
            }

            System.out.println("");
        }
    }
}
