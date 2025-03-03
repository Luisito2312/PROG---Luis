package clases;

import java.util.Objects;

public class Pelicula {
    
    //Atributos
    private String codigo;
    private String titulo;
    private int estreno;
    private boolean vista;

    //Constructor
    public Pelicula(String codigo, String titulo, int estreno) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.estreno = estreno;
        this.vista = false;

        try {
            
        } catch (IllegalArgumentException e) {
            System.out.println("Ninguno de los valores puede ser nulo");
        }
    }

    //Metodos
    public static boolean equals(Pelicula pelicula1, Pelicula pelicula2) {

        boolean comp = true;

        if (pelicula1.getCodigo().equals(pelicula2.getCodigo())) {
            comp = false;
        }

        return comp;
    }

    public static int hashCode(Pelicula pelicula) {

        return Objects.hash(pelicula.codigo);
    }

    public String getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public Object getEstreno() {
        return estreno;
    }


    public boolean getVista() {
        return vista;
    }

    @Override
    public String toString() {
        return "Pelicula [codigo=" + codigo + ", titulo=" + titulo + ", estreno=" + estreno + ", vista=" + vista + "]";
    }

    
    

    
}
