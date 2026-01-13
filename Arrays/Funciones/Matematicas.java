package Funciones;

public class Matematicas {
    
    //Funcion que comprueba que un numero sea capicua
    
    public static boolean esCapicua(int numero) {

        int invertido= 0;
        int inicial=numero;
    
        while (numero != 0) {
            invertido = invertido * 10 + (numero % 10);
            numero = numero / 10;
        }
    
        return inicial == invertido;
        
    }

    //Funcion que comprueba que un numero sea primo
    public static boolean esPrimo(int numero) {

        boolean condicion = false;

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero%i == 0) {
            }
        }
        return condicion;
    }

    //Funcion que comprueba cual es el siguiente numero capicuo a partir de un numero dado
    public static int siguientePrimo(int numero) {
        numero = numero +1;
        
        while (!esPrimo(numero)) {
            numero++;
        }

        return numero;
    }

    public static int quitaPorDelante(int numero, int n) {
        String numStr = String.valueOf(numero);
        return Integer.parseInt(numStr.substring(n));
    }

    public static int digitoN(int numero, int posicion) {
        String numStr = String.valueOf(Math.abs(numero));
        return Character.getNumericValue(numStr.charAt(posicion));
    }

    public static int digitos(int numero) {
        return String.valueOf(Math.abs(numero)).length();
    }

    public static int posicionDeDigito(int numero, int digito) {
        String numStr = String.valueOf(numero);
        return numStr.indexOf(String.valueOf(digito));
    }

    

    
}