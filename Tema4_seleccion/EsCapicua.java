public class EsCapicua {
    public static void main(String[] args) {
        
        boolean capicua = false;
        Integer numero;

        System.out.print("introduce un numero entero (2 cifras como maximo): ");
        numero = Integer.parseInt(System.console().readLine());

        if (numero < 0) {
            System.out.println("Se permiten solo numeros enteros positivos");
        } else if (numero < 10) {
            capicua = true;
        } else if (numero < 100) {
            numero.toString();
        }

        if (capicua) {
            System.out.print("El numero es capicua \n");
        } else {
            System.out.println("El numero no es capicua\n");
        }
    }
}
