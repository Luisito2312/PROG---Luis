package EjercicioClase;

public class Agenda implements Tarea {

    final static int NUMALUMNOSMAX = 100;

    //Atributos
    private static Alumno[] listado = new Alumno[NUMALUMNOSMAX];
    private static  contadorAlumnos;

    public static void añadir(Alumno alumno) {
        for (int i = 0; i < NUMALUMNOSMAX; i++) {
            if (listado[i] == null ) {

                listado[i] = alumno;
                
            }
        }
    }



}
