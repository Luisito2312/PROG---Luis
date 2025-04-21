package clases;

public class Tarea {
    
    //Atributos
    private String descripcion;
    private boolean completada;


    //Constructor
    public Tarea(String descripcion) {
        this.descripcion = descripcion;
        this.completada = false;
    }

    //Metodos
    public static void completada(Tarea tarea) {
        tarea.completada = true;
    }

    public static void toFileString(Tarea tarea) {
        System.out.println(tarea.completada + " : " + tarea.descripcion);
    }

    public String getDescripcion() {
        return descripcion;
    }

    public boolean isCompletada() {
        return completada;
    }

    

    
}