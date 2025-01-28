package EjercicioClase;

public abstract class Persona {
    
    //Atributos
    private String dni;
    private String nombre;
    private int edad;

    public Persona (String dni, String nombre, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
    }
    
}
