public class Ejercicio19 {
    public static void main(String[] args) {

        int aux = 0;
        
        System.out.println("Numeros primos entre 2 y 100");

        for (int i = 2; i < 100; i++) {
            aux = 0;
            for (int j = 1; j <= i; j++) {
                
                if (i % j == 0) {
                    aux++;
                }
            }

            if (aux == 2) {
                System.out.print(i + " ");
            }
        }
    }
}
