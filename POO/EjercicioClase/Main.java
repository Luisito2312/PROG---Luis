package EjercicioClase;

import javax.sql.rowset.spi.SyncResolver;

public class Main {
    
    public static void main(String[] args) {

        int opcion;
        
        System.out.println("1. Añadir alumno");
        System.out.println("2. Listar alumnos");
        System.out.println("3. Editar alumno");
        System.out.println("4. Eliminar alumno");
        System.out.println("0. Salir");
        opcion = Integer.parseInt(System.console().readLine());

        switch (opcion) {
            case 0: 
                System.out.println("Hasta luego!!");
                break;
            case 1:
                
                break;
            case 2:

                break;
            case 3:

                break;

            case 4: 

                break;
                
            default:
            System.out.println("No has introducido un valor válido, se procederá a salir del programa");
                break;
        }

    }
}
