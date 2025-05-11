package Ficheros;
import java.io.*;

public class Ejercicio3 {

    public static void main(String[] args) {
        // Verificar si se han pasado los argumentos necesarios
        if (args.length != 3) {
            System.out.println("Uso: java MezclarArchivos <archivo1> <archivo2> <archivoDestino>");
            return;
        }

        String archivo1 = args[0];
        String archivo2 = args[1];
        String archivoDestino = args[2];

        try (
            BufferedReader reader1 = new BufferedReader(new FileReader(archivo1));
            BufferedReader reader2 = new BufferedReader(new FileReader(archivo2));
            BufferedWriter writer = new BufferedWriter(new FileWriter(archivoDestino))
        ) {
            String linea1;
            String linea2;

            // Leer líneas de ambos archivos alternadamente
            while ((linea1 = reader1.readLine()) != null | (linea2 = reader2.readLine()) != null) {
                if (linea1 != null) {
                    writer.write(linea1);
                    writer.newLine();
                }
                if (linea2 != null) {
                    writer.write(linea2);
                    writer.newLine();
                }
            }

            System.out.println("Archivo combinado creado: " + archivoDestino);
        } catch (IOException e) {
            System.err.println("Error al procesar los archivos: " + e.getMessage());
        }
    }
}
