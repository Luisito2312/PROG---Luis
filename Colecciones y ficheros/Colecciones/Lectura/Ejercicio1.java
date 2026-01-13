import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio1 {
    public static void main(String[] args) throws IOException {
        String fileName = "primos.dat";
        FileWriter writer = new FileWriter(fileName);

        for (int i = 2; i <= 500; i++) {
            if (esPrimo(i)) {
                writer.write(i + "\n");
            }
        }
        writer.close();
        System.out.println("Números primos guardados en " + fileName);
    }

    public static boolean esPrimo(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
