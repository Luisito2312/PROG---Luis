package java.T3;

public class Ejercicio7 {
    public static void main(String[] args) {

        System.out.println("Introduzca la base imponible (precio del articulo sin IVA)");
        double precioSinIva = Double.parseDouble(System.console().readLine());

        double iva = (precioSinIva * 21) / 100;
        double total = precioSinIva + iva;

        System.out.printf("Base imponible \t" + precioSinIva + " euros\n");
        System.out.println("IVA (21%) \t " + iva + " euros" );
        System.out.println("---------------------------");
        System.out.printf("TOTAL \t        %.2f euros", total);
    }
}
