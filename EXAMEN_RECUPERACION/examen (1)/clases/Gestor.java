package clases;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Gestor implements GestorTareasInterface {
    
    //Atributos
    ArrayList<Tarea> tareas;

    //Constructores
    public Gestor() {
        tareas = new ArrayList<Tarea>();
    }

    public Gestor(String nomArchivo) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader(nomArchivo));

        if (!br.equals(null)) {
            tareas.add(new Tarea(br.readLine()));
        }
        
        br.close();
    }

    //Metodos
    public boolean esVacia() {
        boolean condicion = false;
       
        if (tareas.isEmpty()) {
            condicion = true;
        }
        
        return condicion;
        
    }

    public void meter(Tarea tarea) {

        tareas.add(tarea);
    }

    public void eliminar(int indice) throws NullPointerException {

        tareas.remove(tareas.get(indice));
    }

    public void completar(int indice) throws NullPointerException {

        Tarea.completada(tareas.get(indice));
        
    }

    public void aniadirTodas(Gestor destino) {

        for (Tarea tarea : tareas) {
            destino.meter(tarea);
        }
    }

    public void vaciar() {

        tareas.clear();
    }

    public void listar() {

        for (Tarea tarea : tareas) {
            System.out.println(tarea.isCompletada() + " : " + tarea.getDescripcion());
        }
    }

    public void cargar(String nombreArchivo) {

    }

    public void guardar(ArrayList<Tarea> tarea, String nombreArchivo) throws IOException {

        BufferedWriter bw = new BufferedWriter(new FileWriter(nombreArchivo));

        for (Tarea tarea2 : tarea) {
            bw.write(tarea2.isCompletada() + " : " + tarea2.getDescripcion());
        }

        bw.close();
    }

    public ArrayList<Tarea> getTareas() {
        return tareas;
    }

    @Override
    public void meter(ArrayList<Tarea> item) {
        tareas.add(item);
        throw new UnsupportedOperationException("Unimplemented method 'meter'");
    }


    
}
