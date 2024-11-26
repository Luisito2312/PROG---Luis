public class Funciones {

    public static long invertir(long numero) {

        long invertido = 0 ;

        while (numero != 0) {
            invertido = invertido * 10 + (numero%10) ;
            numero = numero / 10 ;
        } 

        return invertido ;
    }

    public static long dislocar(long numero) {
 
        long digito ;
        long invertido ;
        long resultado = 0 ;

         // invertimos el número
         invertido = Funciones.invertir(numero) ;

         // dislocamos
         for ( ; invertido > 0; invertido /= 10) {
 
             // obtenemos el resto
             digito = invertido%10 ;  
 
             // comprobamos si el número es par o impar
             digito += (digito%2==0)?1:-1 ;
             
             //if (digito%2==0) { digito++ ; }
             //else                     { digito-- ;   }
 
             // construimos el número resultado
             resultado = (resultado * 10) + digito ;
         }
 
         return resultado ;
    }
    
}