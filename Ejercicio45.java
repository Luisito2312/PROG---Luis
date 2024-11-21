public class Ejercicio45 {
    public static void main(String[] args) {
        
        int digito;
        long numero;
        long temporal;

        System.out.println("introduce un numero entero");
        numero = Long.parseLong(System.console().readLine());


        //Mostrar los digitos que aparecen en el numero
        System.out.println("Digitos que aparecen en el numero");
        for (digito = 0; digito <= 9; digito++) {

            temporal = numero;
            if (comprobarDigito(temporal, digito)) {
                System.out.printf("%d ", digito);
            }
        }

        //Mostrar los digitos que no aparecen en el numero
        System.out.println("Digitos que no aparecen en el numero");
        for (digito = 0; digito <= 9; digito++) {

            temporal = numero;
            if (!comprobarDigito(temporal, digito)) {
                System.out.printf("%d ", digito);
            }
        }
    }

    //Comprueba que el digito está dentro del numero
    public static boolean comprobarDigito(long numero, int digito) {
        while ((numero > 0) && (digito!=numero%10)) {numero = numero / 10;}
        return (numero > 0);
    }
}
