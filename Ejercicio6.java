public class Ejercicio6 {
    public static void main(String[] args) {
        
        long num;
        long i = 0;

        System.out.print("Introduce un numero por pantalla y te dire el numero de digitos que tiene: ");
        num = Long.parseLong(System.console().readLine());

        long aux = num;

        do {
            num = num / 10;
            i++;
        } while (num > 0);

        System.out.println("El numero " + aux + " tiene " + i + " digito/s");
    }
}
