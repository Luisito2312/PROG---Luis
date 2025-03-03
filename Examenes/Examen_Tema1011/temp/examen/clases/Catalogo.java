package clases;

import java.util.ArrayList;

public class Catalogo<Pelicula> implements CatalogoInterface<Pelicula>{
    
    //Atributos
    ArrayList<Pelicula> coleccion = new ArrayList<Pelicula>();

    //Metodos
    public boolean aniadir(Pelicula item) {

        boolean comp = false;

        if (!coleccion.contains(item)) {
            comp = true;
            coleccion.add(item);
        } 
        
        return comp;
    }

    public void eliminar(Pelicula item) {

        coleccion.remove(item);
    }

    public ArrayList<Pelicula> recuperarElementos() {

        return coleccion;
    }

}
