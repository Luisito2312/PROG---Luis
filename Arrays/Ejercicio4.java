public class Ejercicio4 {
    public static void main(String[] args) {
        
        int[] numeros = new int[20];
        int[] cuadrado = new int[20];
        int[] cubo = new int[20];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] =(int)(Math.random() * 100);
        }

        for (int i = 0; i < cuadrado.length; i++) {
            cuadrado[i] = numeros[i] * numeros[i];
        }

        for (int i = 0; i < cubo.length; i++) {
            cubo[i] = numeros[i] * numeros[i] * numeros[i];
        }
        System.out.println("   n   |   n2   |   n3   ");
        System.out.println("---------------------------");

        for (int i = 0; i < cubo.length; i++) {
            System.out.printf("%7d|%7d|%7d\n", numeros[i], cuadrado[i], cubo[i]);
        }
    }
}
