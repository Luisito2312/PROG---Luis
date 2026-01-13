/**
 * Programación
 * Gestor Multitareas
 * Antonio J.Sánchez Bujaldón
 */

import clases.Almacen;
import clases.Gestor;
import clases.Tarea;

public class Todolist {

    private static final String BORRAR = "\033[H\033[2J" ; 
    
    public static void main(String[] args) {

        int opcion ;
        int activo ;
        int indice = 0 ;
        int origen ;
        int destino ;

        Gestor gestor = null ;
        String descripcion ;

        boolean terminar = false ;
        Almacen almacen = new Almacen() ;

        
        while(!terminar) {

            menu() ;
            opcion = Integer.parseInt(System.console().readLine()) ;
            
            switch(opcion) {

                // ABRIR GESTOR
                case 1 :
                    System.out.print("Nombre del archivo: ") ;
                    String archivo = System.console().readLine() ;
                
                    if (almacen.agregar(archivo)) { 
                        System.out.println("El archivo se ha cargado o creado correctamente."); }
                    else { 
                        System.out.println("No se pueden cargar más gestores de tareas."); }
                    break ;

                // SELECCIONAR ACTIVO
                case 2 :
                    System.out.println("Introduce el indice del Gestor a utilizar");
                    indice = Integer.parseInt(System.console().readLine());
                    almacen.usar(indice);
                    break ;

                // AÑADIR TAREA
                case 3 :
                    System.out.print("Descripción de la tarea: ");
                    descripcion = System.console().readLine() ;
                    
                    // recuperamos el gestor activo
                    gestor = almacen.getActivo() ;

                    // si hay un gestor activo guardamos la tarea
                    if (gestor==null) { System.out.println("No existe ningún gestor activo.") ; }
                    else { gestor.meter(new Tarea(descripcion));  }
                
                    break ;

                // COMPLETAR TAREA
                case 4:
                    gestor.completar(indice);
                    break ;

                // ELIMINAR TAREA
                case 5 :
                    gestor.eliminar(indice);
                    break ;

                // LISTAR TAREAS
                case 6 :
                    gestor.listar();
                    break ;

                // LISTAR GESTORES
                case 7 :
                    System.out.println("LISTADO DE GESTORES DE TAREAS\n========================================") ;
                    almacen.listar() ;
                    break ;

                // FUSIONAR GESTORES
                case 8 :
                    System.out.print("Seleccione el índice del gestor de origen: ");
                    origen = Integer.parseInt(System.console().readLine()) ;
                    System.out.print("Seleccione el índice del gestor de destino: ");
                    destino = Integer.parseInt(System.console().readLine()) ;

                    // fusiona los gestores indicados
                    if (almacen.fusionar(origen, destino)) { System.out.println("Se han fusionado correctamente."); }
                    else { System.out.println("Ha sido imposible fusionar los gestores indicados."); }
                    break ;

                // GUARDAR Y SALIR
                case 0 :
                    // TO-DO
                    break ;

                default:
                    System.out.println("ERROR: la opción elegida no es correcta");
            }

            // hacemos una pausa tras cada opción, excepto al terminar
            if (!terminar) { pausa() ; }
        }
    }

    /**
     * Espera a que el usuario pulse ENTER
     */
    private static void pausa() {
        System.out.println("\nPULSA ENTER PARA CONTINUAR...");
        System.console().readLine() ;
        System.out.println(BORRAR) ;
    }

    /**
     * Muestra el menú de opciones en pantalla
     */
    private static void menu() {

        System.out.println("\nGESTIÓN DE TAREAS\n=================");
        
        System.out.println("1. Abrir archivo");
        System.out.println("2. Cambiar activo") ;
        System.out.println("3. Añadir Tarea");
        System.out.println("4. Completar Tarea") ;
        System.out.println("5. Eliminar Tarea");
        System.out.println("6. Listar Tareas");
        System.out.println("7. Listar Gestores");
        System.out.println("8. Fusionar Gestores");
        System.out.println("0. Guardar y Salir");
        System.out.print("\nSeleccione una opción: ");

    }

}
