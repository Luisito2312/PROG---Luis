package EjercicioClaseResuelto;

public interface TareasInterface {
    
    //añadir un nuevo alumno
    public void aniadir(Alumno alumno);

    //listado de los alumnos
    public void listar();

    //Editar la imformacion de un alumno
    public void editar();

    //Borrar alumno en concreto por dni
    public boolean borrar(String dni);
}
