package clases;

public abstract class Mascota {

    //Atributos
    protected String chip;
    protected String nombre;
    protected int edad;
    protected boolean vacunada;
    public static int totalMascotas = 0;

    //Construtor
    public  Mascota(String chip, String nombre, int edad) {
        this.chip = chip;
        this.nombre = nombre;
        this.edad = edad;
        this.vacunada = false;
    }

    //metodos abstractos de pasear y jugar
    public abstract void pasear(); 
    public abstract void jugar();


    //Metodo para cambiar el estado de vacunacion de una mascota 
    public void vacunar() {
        this.vacunada = true;
    }

    //Metodo de estado para comprobar si una mascota ha sido vacunada o no
    public boolean estado() {

        boolean estado = false;

        if (this.vacunada) {
            
            return !estado;
        }

        return estado;
    }

    //Getters y setters
    public String getChip() {
        return chip;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public static int getTotalMascotas() {
        return totalMascotas;
    }

    //toString
    @Override
    public String toString() {
        return "[" + chip + "]: " + nombre + ", " + edad + " años." ;
    }
    
}