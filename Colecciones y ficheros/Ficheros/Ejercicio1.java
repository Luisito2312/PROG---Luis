package Ficheros;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio1 {
    
    // Método para verificar si un número es primo
    public static boolean esPrimo(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String nombreArchivo = "Ficheros/primos.dat";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo))) {
            for (int i = 1; i <= 500; i++) {
                if (esPrimo(i)) {
                    writer.write(i + "\n");
                }
            }
            System.out.println("Archivo " + nombreArchivo + " creado correctamente.");
        } catch (IOException e) {
            System.err.println("Error al escribir el archivo: " + e.getMessage());
        }
    }
}

