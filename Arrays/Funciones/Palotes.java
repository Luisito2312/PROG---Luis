package Funciones;

public class Palotes {

    public static void main(String[] args) {
        int numero = 470213;
        String resultado = convierteEnPalotes(numero);
        System.out.println(resultado);
    }

    public static String convierteEnPalotes(int n) {
        String resultado = "";
        int divisor = 1;

        // Calcula la posición del divisor más grande
        while (n / divisor >= 10) {
            divisor *= 10;
        }

        while (divisor > 0) {
            int digito = n / divisor; // Extrae el dígito más significativo

            // Construye las barras de palotes para el dígito actual
            for (int i = 0; i < digito; i++) {
                resultado += "|";
            }

            n %= divisor; // Elimina el dígito más significativo
            divisor /= 10; // Reduce el divisor para procesar el siguiente dígito

            // Agrega el separador '-' si quedan más dígitos
            if (divisor > 0) {
                resultado += "-";
            }
        }

        return resultado;
    }
}
