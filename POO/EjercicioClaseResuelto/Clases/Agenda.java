package EjercicioClaseResuelto;

public class Agenda implements TareasInterface {

    private final int MAXIMO = 100;

    
    private Alumno[] listado; //implementamos el listado de alumnos como un array
    private int ultimo; //Posicion vacia donde insertar alumno
    private int total;  //Total de registros en el listado

    Agenda() {

        this.ultimo = 0;  
        this.total = 0; 
        this.listado = Alumno[MAXIMO];

        //Vaciamos la agenda
        this.vaciar();
        
    }
    
    //inicializar vacio el array
    private void vaciar() {
        for (int i = 0; i < MAXIMO; i++) {
            this.listado[i] = null;
        }
    }

    //Devuelve true si la agenda esta vacia
    public boolean esVacia() {
        return this.total == 0;
    }

    //Devuelve true si la agenda esta llena
    public boolean esLlena() {
        return this.total == MAXIMO;
    }

    //Añadir un alumno nuevo al listado
    @Override
    public void aniadir(Alumno alumno) throws FullListException {

        if (!this.esLlena()) {
            this.listado[this.ultimo++] = alumno;
        } else {
            throw new FullListException("La agenda esta completa");
        }


    }

    @Override
    public void listar() {
        
    }

    @Override
    public void editar() {
        
    }

    @Override
    public boolean borrar(String dni) {

        return false;
    }
}
