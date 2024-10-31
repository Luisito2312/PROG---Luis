public class Ejercicio2 {
    public static void main(String[] args) {
        Double PI = 3.1415;
        Double base;
        Double altura;
        Double resultado;

        System.out.println("\033[1mVOLUMEN DE UN CONO \033[0m");
        System.out.println("==================");
        System.out.print("Ingrese el radio de la base del cono (cm) ");
        base = Double.parseDouble(System.console().readLine());

        System.out.print("Ingrese la altura del cono (cm) ");
        altura = Double.parseDouble(System.console().readLine());

        resultado = (PI * (base * base) * altura) / 3;

        System.out.printf("El volumen del cono es: \033[1m\033[31m%.2f \033[0mcm\u00B3" , resultado);
    }
}
