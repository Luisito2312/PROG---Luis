package java.T3;

public class Ejercicio12 {
    public static void main(String[] args) {
        
        System.out.print("Introduce la nota del primer examen ");
        double nota1 = Double.parseDouble(System.console().readLine());

        System.out.print("Que nota quiere sacar en el trimestre? ");
        double notaDeseada = Double.parseDouble(System.console().readLine());

        double notaFinal = (notaDeseada - (nota1 * 0.6)) / 0.4;

        if (notaFinal > 10) {
            System.out.println("No hay manera de que saques un "+ notaDeseada + " en el trimestre, lo siento");
        } else {
            System.out.print("Para tener un " + notaDeseada + " en el trimestre, tendrias que sacar un " + notaFinal +" en el segundo examen");
        }
    }
}
