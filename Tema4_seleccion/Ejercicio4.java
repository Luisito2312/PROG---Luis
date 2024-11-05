public class Ejercicio4 {
    public static void main(String[] args) {
        
        System.out.println("El problema resuelve ecuaciones de primer grado del tipo ax + b = 0");
        System.out.print("Introduzca el valor de a: ");
        double a = Double.parseDouble(System.console().readLine());

        System.out.print("Introduce el valor de b: ");
        Double b = Double.parseDouble(System.console().readLine());

        double solucionEcuacion = -b / a;

        if ((solucionEcuacion >= 0 ) || (solucionEcuacion < 0)) {
            System.out.println("x = " + solucionEcuacion);
        } else {
            System.out.println("La ecuacion no tiene solucion real");
        }

    }
}
