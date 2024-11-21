import java.util.Scanner;

public class Ejercicio60 {
    public static void main(String[] args) {

        long num;
        long aux;
        String numero;
        Scanner sc = new Scanner(System.in);
        

        System.out.print("Introduce un número: ");
        num = sc.nextLong();
        aux = num;

        aux = Funciones.invertir(num);
        

        System.out.println("Dislocando el %d obtenemos el %d", num, dislocado);
    }
}
