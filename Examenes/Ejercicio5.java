public class Ejercicio5 {
    public static void main(String[] args) {

        int codLibro;
        Double precioUnitario;
        int cantidad;
        int descuento;
        String porc = "%";

        System.out.println("\033[1mLECTURA ILUSTRADA \033[0m");
        System.out.println("=================================");
        System.out.print("Introduce codigo de libro: ");
        codLibro = Integer.parseInt(System.console().readLine());

        System.out.print("Introduce precio unitario: ");
        precioUnitario = Double.parseDouble(System.console().readLine());

        System.out.print("Introduce cantidad: ");
        cantidad = Integer.parseInt(System.console().readLine());

        System.out.print("Introduce descuento (%): ");
        descuento = Integer.parseInt(System.console().readLine());

        Double descuentoFinal = ((descuento * precioUnitario) / 100) * cantidad;
        Double iva = ((21 * precioUnitario) / 100) * cantidad;
        Double precioParcial = precioUnitario * cantidad;
        Double precioTotal = precioParcial - descuentoFinal + iva;
        Double descuentoo = descuentoFinal * 2;
        Double descuentoString = descuentoFinal - descuentoo;

        System.out.println("\nSu ticket: ");
        System.out.println("\n\033[1mLECTURA ILUSTRADA \033[0m");
        System.out.println("=======================================");
        System.out.printf("%d %30.2f euros" , codLibro, precioUnitario);
        System.out.printf("\n%d uds.%27.2f euros" , cantidad, precioParcial);
        System.out.printf("\n-%d%s %29.2f euros" , descuento,porc ,descuentoString);
        System.out.printf("\n21%s IVA %25.2f euros" ,porc ,iva);
        System.out.printf("\n\033[100m\033[1mTOTAL%28.2f euros\033[0m", precioTotal);

    }
}
