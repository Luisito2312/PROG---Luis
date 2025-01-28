package EjercicioClase;

public class Alumno extends Persona {
    
    //Atributos
    private String ciclo;
    private String curso;
    private String unidad;

    //Constructor
    public Alumno(String dni, String nombre, int edad, String ciclo, String curso, String unidad) {
        super(dni, nombre, edad);
        this.ciclo = ciclo;
        this.curso = curso;
        this.unidad = unidad;
    }

    //Getters y Setters
    public String getCiclo() {
        return ciclo;
    }

    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    @Override
    public String toString() {
        return "Nombre: " + getNombre() + ", DNI: " + getDni() + ", edad: " + getEdad() + ", Ciclo" + ciclo
                + ",  Curso" + curso + ",  unidad" + unidad + ".";
    }   
    
    
    
}
