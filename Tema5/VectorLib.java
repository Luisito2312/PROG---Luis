package Tema5;

public class VectorLib {
    
    //Funciones

    public static void rellenar(int[] vector, int min, int max) {
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (Integer)(Math.random() + max);
        }
    }
}
