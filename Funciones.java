/**
 * PROGRAMACIÓN
* Tema 5 - Bucles
 * Antonio J. Sánchez
 * curso 2024|25
 */


public class Funciones {
    
     /**
     * Invierte el valor numérico dado
     * @param numero
     * @return     
     */
    public static long invertir(long numero) {

        long invertido = 0 ;

        while (numero != 0) {
            invertido = invertido * 10 + (numero%10) ;
            numero = numero / 10 ;
        } 

        return invertido ;
    }
    
}
