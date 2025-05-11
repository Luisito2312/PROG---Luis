package Ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio4 {
    public static void main(String[] args) {
        
        while (args.length < 2) {
            System.out.println("Uso: java Ejercicio4.java <nombreArchivoLeer> <nombreArchivoEscribir>");
            return;
        }

        ArrayList<String> palabrasOrdenar = new ArrayList<String>();
        String archivoLeer = args[0];
        String archivoEscribir = args[1];

        try (
            BufferedReader bufferLectura = new BufferedReader(new FileReader(archivoLeer));
            BufferedWriter bufferEscritura = new BufferedWriter(new FileWriter(archivoEscribir));)
        {
            
            String linea;
            int cont = 0;

            while ((linea = bufferLectura.readLine())!= null) {
                palabrasOrdenar.add(linea);
            }

            Collections.sort(palabrasOrdenar);

            for (String string : palabrasOrdenar) {
                bufferEscritura.write(string);
                bufferEscritura.newLine();
            }


            System.out.println("Archivo ordenador alfabeticamente");
        } catch (IOException e) {
            System.out.println("Se ha producido un error a la hora de procesar los archivos");
        }


    }
}
