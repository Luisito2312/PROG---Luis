/**
 * Programación
 * Gestor Multitareas
 * Antonio J.Sánchez Bujaldón
 */

package clases;

import java.util.ArrayList;

public interface GestorTareasInterface {

    /**
     * Devuelve verdadero o falso dependiendo de si la lista de tareas
     * está vacía o no.
     * @return
     */
    public boolean esVacia() ;

    /**
     * Inserta la tarea en lista.
     * @param item
     */
    public void meter(ArrayList<Tarea> item) ;

    /**
     * Elimina la tarea según su posición en la lista.
     * @param index
     * @throws NullPointerException
     */
    public void eliminar(int index) throws NullPointerException ;

    /**
     * Marca como completada la tarea indicada por su posición en la lista.
     * @param index
     * @throws NullPointerException
     */
    public void completar(int index) throws NullPointerException ;

    /**
     * Añade a la lista todas las tareas del gestor proporcionado.
     * @param destino
     */
    public void aniadirTodas(Gestor destino) ;

    /**
     * Elimina todas las tareas.
     */
    public void vaciar() ;

    /**
     * Muestra un listado de todas las tareas
     */
    public void listar() ;
    
}
