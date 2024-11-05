public class Ejercicio10 {
    public static void main(String[] args) {
        
        int positivos = 0;
        int negativos = 0;
        int num;

        System.out.println("Introduce 10 numeros enteros");
        for (int i = 0; i < 10; i++) {
            num = Integer.parseInt(System.console().readLine());

            if (num > 0) {
                positivos++;
            } else {
                negativos++;
            }
        }

        System.out.println("Has introducido " + positivos + " positivos y " + negativos + " negativos." );
    }
}
