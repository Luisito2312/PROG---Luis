import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class main_ejercicioProfe {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Utilización: main_ejercicioProfe.java <archivo> <L|P|C> o 'ayuda'");
            return;
        }

        if (args[0].equalsIgnoreCase("ayuda")) {
            mostrarAyuda();
            return;
        }

        if (args.length < 2) {
            System.out.println("Error: Falta el parámetro de operación (L, P o C)");
            return;
        }

        String archivo = args[0];
        String operacion = args[1].toUpperCase();

        try {
            switch (operacion) {
                case "L":
                    System.out.println("Total de líneas: " + contarLineas(archivo));
                    break;
                case "P":
                    System.out.println("Total de palabras: " + contarPalabras(archivo));
                    break;
                case "C":
                    System.out.println("Total de caracteres: " + contarCaracteres(archivo));
                    break;
                default:
                    System.out.println("Operación erronea. Pulse P, C, L.");
            }

        } catch (FileNotFoundException e) {
            System.out.println("El archivo: <" + archivo + "> no se encuentra en la ruta especificada.");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo.");
        }
    }

    public static void mostrarAyuda() {

        System.out.println("Utilizacion: java main_ejercicioProfe.java <archivo> <L|P|C>");
        System.out.println("L: Te dice el numero de líneas del archivo");
        System.out.println("P: Te dice el numero de palabras del archivo");
        System.out.println("C: Te dice el total de caracteres del archivo");
    }

    public static int contarLineas(String nombre) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader(nombre));
        int lineas = 0;

        while (br.readLine() != null) {
            lineas++;
        }

        br.close();

        return lineas;
    }

    public static int contarPalabras(String nombre) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader(nombre));
        int palabras = 0;
        String linea;

        while ((linea = br.readLine()) != null) {

            palabras += linea.split("\\s+").length;
        }
        br.close();

        return palabras;
    }

    public static int contarCaracteres(String nombre) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader(nombre));
        int caracteres = 0;
        int c;

        while ((c = br.read()) != -1) {
            caracteres++;
        }
       
        br.close();
        
        return caracteres;
    }
}