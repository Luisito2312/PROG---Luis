import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.annotation.processing.FilerException;

public class main2 {
    public static void main(String[] args) {
        
        if (args.length < 2) {
            System.out.println("Uso java main2.java <archivo> (L, P, C)");
            return;
        }

        String archivo = args[0];
        String opcion = args[1].toUpperCase();

        try {
            switch (opcion) {
                case "L":
                    System.out.println("El archivo contiene " + contarLineas(archivo) + " lineas.");
                    break;
                case "P":
                    System.out.println("El archivo contiene " + contarPalabras(archivo) + " palabras.");
                    break;
                case "C":
                    System.out.println("El archivo contiene " + contarLetras(archivo) + " letras.");
                    break;
            
                default:
                    System.out.println("No ha introducido una opcion correcta.");
                    break;
            }
        } catch (IOException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

    public static int contarLineas( String archivo) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader(archivo));
        int lineas = 0;

        while (br.readLine() != null) {
            lineas++;
        }
        br.close();
        return lineas;
    }

    public static int contarPalabras(String archivo) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader(archivo));
        int palabras = 0;
        String linea;

        while ((linea = br.readLine()) != null) {
            palabras += linea.split("\\s+").length;
        }

        br.close();
        return palabras;
    }

    public static int contarLetras(String archivo) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader(archivo));
        int letras = 0;
        int c;

        while ((c = br.read()) != -1) {
            letras++;
        }

        br.close();
        return letras;
    }
}
