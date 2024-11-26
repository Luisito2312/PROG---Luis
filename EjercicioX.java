public class EjercicioX {
    public static void main(String[] args) {
        
        int altura;

        System.out.println("Introduce la altura de la X (Tiene que ser impar)");
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
