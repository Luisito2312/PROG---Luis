import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Biblioteca {
    
    //Atributos
    ArrayList<Libro> libros;

    //Constructor
    public Biblioteca() {
        libros = new ArrayList<>();
    }

    //Metodos
    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public void mostrarTodos() {
        for (Libro libro : libros) {
            Libro.mostrarInformacion(libro);
        }
    }

    public ArrayList<Libro> buscarPorAutor(String autor) {
        ArrayList<Libro> librosAutor = new ArrayList<>();

        for (Libro libro : librosAutor) {
            for (int i = 0; i < libro.getAutor().length - 1; i++) {
                if (libro.getAutor()[i].equals(autor)) {
                    librosAutor.add(libro);
                }
            }
            
        }

        return librosAutor;
    }

    public boolean prestarLibro(String isbn) {

        boolean devolver = false;

        for (Libro libro : libros) {
            if (libro.getIsbn().equals(isbn)) {
                libro.prestar();
                devolver = true;
            } 
        }

        return devolver;
    }

    public boolean devolverLibro(String isbn) {

        boolean devolver = false;

        for (Libro libro : libros) {
            if (libro.getIsbn().equals(isbn)) {
                libro.devolver();
                devolver = true;
            } 
        }

        return devolver;
    }

    public void mostrarEstadisticas() {
        int numLibros = 0;
        int prestados = 0;
        int sinPrestar = 0;
        ArrayList<Libro> librosMasAutor = new ArrayList<>();

        for (Libro libro : libros) {
            numLibros++;
            if (libro.isPrestado()) {
                prestados++;
            } else {
                sinPrestar++;
            }

        }

        System.out.println("Hay un total de: "+numLibros+" libros en la coleccion");
        System.out.println("Hay un total de: "+prestados+" libros prestados");
        System.out.println("Hay un total de: "+sinPrestar+" libros sin prestar");

        for (Libro libro : librosMasAutor) {
            Libro.mostrarInformacion(libro);
        }
    }

    public void listarPorAnio(int anio) {
        for (Libro libro : libros) {
            if (libro.getAnio() == anio) {
                Libro.mostrarInformacion(libro);
            }
        }
    }

    public void importarDesdeArchivo(String archivo) {

        try {

            BufferedReader br = new BufferedReader(new FileReader(archivo));

            while (br.readLine() != null) {
                
            }
            
        } catch (IOException e) {
            System.out.println("ERROR:" + e.getMessage()) ;
        }

    }

    public void guardarEnArchivo(String archivo) {

        String linea;

        try {

            BufferedWriter bw = new BufferedWriter(new FileWriter(archivo));
            

        } catch (IOException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

    }

    public void buscarPorTitulo(String titulo) {

    }
}
