public class Ejercicio5 {

    final static double GRAVEDAD = 9.81; 
    public static void main(String[] args) {

        int altura;

        System.out.println("Calculo del tiempo que tarda un objeto al caer al suelo");
        System.out.print("Introduce la altura en metros desde la que cae el objeto ");
        altura = Integer.parseInt(System.console().readLine());

        double formula = Math.sqrt((2 * altura) / GRAVEDAD);

        System.out.printf("El objeto tarda %.2f segundos" , formula);
    }
}
