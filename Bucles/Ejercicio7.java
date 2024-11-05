public class Ejercicio7 {
    public static void main(String[] args) {
        
        int num;
        int i = 0;
        int suma = 0;

        System.out.println("Este programa calcula la media de numeros positivos, cuando quieras para, mete uno negativo.");
        
        do {
            System.out.print("Introduce un numero: ");
            num = Integer.parseInt(System.console().readLine());

            if (num > 0) {
                
                suma += num;
                i++;
            }

        } while (num > 0);

        System.out.println("la media de los numeros es " + suma / i );
    }
}
