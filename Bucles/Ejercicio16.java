public class Ejercicio16 {
    public static void main(String[] args) {
        int altura;
        String caracter;

        System.out.print("Introduce la altura de la piramide: ");
        altura = Integer.parseInt(System.console().readLine());

        System.out.print("Introduce el caracter con el que dibujar la piramide: ");
        caracter = System.console().readLine();

        for (int i = altura; i > 0; i--) {
            for (int j = altura; j > i - 1; j--) {
                System.out.print(" ");
            }
            System.out.println(caracter);
        }
   } 
}
