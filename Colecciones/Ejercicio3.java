import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio3 {

    static final int TAMANO = 10;
    public static void main(String[] args) {
        
        ArrayList<Integer> numeros = new ArrayList<Integer>(TAMANO);

        System.out.println("Introduce un valor y pulsa enter para seguir introduciendo");

        
        for (int i = 0; i < TAMANO; i++) {
           numeros.add(Integer.parseInt(System.console().readLine()));
        }

        Collections.sort(numeros);

        System.out.println("Numeros ordenados: ");
        for (Integer integer : numeros) {
            System.out.print(integer + " ");
        }

    }
}
