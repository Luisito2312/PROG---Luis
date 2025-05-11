import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio4 {

    static final int TAMANO = 10;
    public static void main(String[] args) {
        
        ArrayList<String> palabras = new ArrayList<String>();

        System.out.println("Introduce un valor y pulsa enter para seguir introduciendo");

        
        for (int i = 0; i < TAMANO; i++) {
           palabras.add(System.console().readLine());
        }

        Collections.sort(palabras);

        System.out.println("Palabras ordenadas: "+ palabras);
        // for (String palabra : palabras) {
        //     System.out.print(palabra + " ");
        // }
    }
}
