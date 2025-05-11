package Ficheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class Ejercicio7 {
    
    public static void main(String[] args) {
        
        if (args.length < 1) {
            System.out.println("Uso: java Ejercicio7.java <nombreArchivo>");
        } else {

            String archivo = args[0];
            String linea;
            String linea2;
            
            HashMap<String, String> diccionario = new HashMap<String, String>();

            try(
                BufferedReader lector = new BufferedReader(new FileReader(archivo));
            ) {

                while ((linea = lector.readLine()) != null) {
                    diccionario.put(archivo, linea);
                }
                
            } catch (IOException e) {
                System.out.println("ha ocurrido un error procesando el archivo");
            }
        }
    }
}
