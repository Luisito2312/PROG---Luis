public class Ejercicio9 {
    public static void main(String[] args) {
        
        int num;
        int aux = 0;
        int aux2 = 1;

        System.out.println("N PRIMEROS NUMEROS DE LA SUCESION DE FIBONACCI");
        System.out.print("Introduce un numero: ");
        num = Integer.parseInt(System.console().readLine());

        for (int i = 0; i < num; i++) {
            if (i < num - 1) {
                System.out.print(", ");
            }

            int siguiente = aux + aux2;
            aux = aux2;
            aux2 = siguiente;
        }

        System.out.println();
    }
}
