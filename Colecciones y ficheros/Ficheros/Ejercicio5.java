package Ficheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio5 {
    public static void main(String[] args) {
        
        if (args.length < 2) {
            System.out.println("Uso: java Ejercicio5.java <nombreArchivoLeer> <palabraBuscar>");
        } else {

            String archivo = args[0];
            String palabra = args[1];
            String linea;
            int contador = 0;

            try(
                BufferedReader lector = new BufferedReader(new FileReader(archivo));

            ) {

                while ((linea = lector.readLine()) != null) {
                    if (linea.equals(palabra)) {
                        contador++;
                    }
                }

                System.out.println("la palabra" + palabra + " se encuentra " + contador + " veces");
                
            } catch (IOException e) {
                System.out.println("Ha ocurrido un error analizando los ficheros");
            }
        }
    }
}
