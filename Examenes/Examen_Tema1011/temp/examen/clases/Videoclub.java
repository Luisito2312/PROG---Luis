package clases;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import excepciones.DuplicateFilmException;

public class Videoclub implements VideoclubInterface {
    
    //Atributos
    Catalogo<Pelicula> catalogo;

    //constructor

    public Videoclub() {
        this.catalogo = new Catalogo<Pelicula>();
    }

    //Metodos
    public void nuevaPelicula(Pelicula pelicula) throws DuplicateFilmException {

        catalogo.aniadir(pelicula);
        
    }

    public void eliminarPelicula(Pelicula pelicula) {

    }

    public ArrayList<Pelicula> buscarPorEstreno(int anio) {

        ArrayList<Pelicula> peliculas = new ArrayList<Pelicula>();


        peliculas = catalogo.recuperarElementos();

        return peliculas;

        
    }

    public ArrayList<Pelicula> listarNoVistas() {

        ArrayList<Pelicula> peliculas = new ArrayList<Pelicula>();

        
    }

    public void guardar(String nombreArchivo) throws IOException {

        BufferedWriter bw = new BufferedWriter(new FileWriter(nombreArchivo));
    }

    public ArrayList<Pelicula> listarOrdenado() {

        ArrayList<Pelicula> peliculas = new ArrayList<Pelicula>();


        
        

    }



}
