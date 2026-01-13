import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio2 {
    public static void main(String[] args) throws IOException {
        String fileName = "Lectura/primos.dat";
        BufferedReader reader = new BufferedReader(new FileReader(fileName));

        String linea;
        while ((linea = reader.readLine()) != null) {
            System.out.println(linea);
        }
        reader.close();
    }
}
