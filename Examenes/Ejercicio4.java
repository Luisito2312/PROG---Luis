public class Ejercicio4 {
    public static void main(String[] args) {
        
        int litros;

        System.out.println("\033[1mCALCULADORA DE MEDIDAS IMPERIALES \033[0m");
        System.out.println("=================================");
        System.out.print("Introduce una cantidad de litros: ");
        litros = Integer.parseInt(System.console().readLine());

        System.out.printf("\033[4m%d litros\033[0m son: " , litros);

        Double galon = litros * 0.264172;
        Double cuartoGalon = galon * 4;
        Double pinta = litros * 2.1133;
        Double onza = litros / 0.0295735;

        System.out.printf("\n\033[1m\033[43m%.2f\033[0m galones (gal)" , galon);
        System.out.printf("\n\033[1m\033[42m%.2f\033[0m cuartos de galon (qt)" , cuartoGalon);
        System.out.printf("\n\033[1m\033[41m%.2f\033[0m pintas (pt)" , pinta);
        System.out.printf("\n\033[1m\033[46m%.2f\033[0m onzas liquidas (fl oz)" , onza);

    }
}
