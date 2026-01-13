import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.annotation.processing.FilerException;

public class Ejermplo1 {
    public static void main(String[] args) {
        
        if (args.length < 2) {
            System.out.println("Uso: java Ejemplo1.java <archivoLeer> <archivoEscribir>");
        }

        String archivo1 = args[0];
        String archivo2 = args[1];

        try (
            BufferedReader br = new BufferedReader(new FileReader(archivo1));
            BufferedWriter bw = new BufferedWriter(new FileWriter(archivo2));
            ) {
            
        } catch (IOException e) {
           System.out.println("ha habido un error al procesar los archivos");
        }
    }
}
