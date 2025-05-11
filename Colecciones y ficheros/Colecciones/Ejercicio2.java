import java.util.ArrayList;

public class Ejercicio2 {
    public static void main(String[] args) {
        
        ArrayList<Integer> numeros = new ArrayList<Integer>();

        //Variable que almacena el tamaño del array que tiene que estar entre 10 y 20
        int tamaño = (int)(Math.random() + 10 * 11);


        for (int i = 0; i < tamaño; i++) {
            numeros.add((int)(Math.random() * 101));
        }

        suma(numeros);


    }

    public static  void suma(ArrayList<Integer> numeros) {
        int numAux = 0;
        for (Integer integer : numeros) {
            numAux += integer;
        }

        System.out.println(numAux);
    }

    public static void media(ArrayList<Integer> numeros) {
        double media = 0;

        for (Integer integer : numeros) {
            media += (double)integer;
        }
        
        media = media / numeros.size();

        System.out.println(media);
    }

    
}