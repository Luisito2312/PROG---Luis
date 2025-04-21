/**
 * Programación
 * Gestor Multitareas
 * Antonio J.Sánchez Bujaldón
 */

package clases;

public interface ListaGestoresInterface {

    /**
     * Marca como activo el gestor de tareas indicado por su
     * posición dentro del array. Devuelve false si no existe
     * el gestor indicado; true en otro caso.
     * @param index
     * @return
     */
    public boolean usar(int index) ;

    /**
     * Crea un gestor y carga las tareas desde el archivo indicado.
     * Se devuelve false si no hay espacio para más gestores; true
     * en otro caso.
     * @param archivo
     * @return
     */
    public boolean agregar(String archivo)  ;

    /**
     * Añade las tareas del gestor origen al gestor destino. Devuelve
     * false si son el mismo gestor o alguno no existe; true en otro
     * caso.
     * @param origen
     * @param destino
     * @return
     */
    public boolean fusionar(int origen, int destino);

    /**
     * Muestra un listado de gestores.
     */
    public void listar() ;

    /**
     * Guarda las listas de tareas de cada gestor en sus archivos
     * correspondientes.
     */
    public void guardar() ;
    

}
