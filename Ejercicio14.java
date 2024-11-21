public class Ejercicio14 {
    public static void main(String[] args) {
        
        int num;
        int suma;

        do {
            System.out.print("Introduce un numero entero positivo: ");
            num = Integer.parseInt(System.console().readLine());
            suma = num;

            if (num <0 ) {
                System.out.println("Numero introducido incorrecto, tiene que ser un numero positivo");
            }
        } while (num < 0);
    

        for (int i = num + 1; i < num + 100; i++) {
            suma += i;
        }

        System.out.println("La suma de los 100 numeros siguientes de " + num + " es: " + suma);
        
    }
}
