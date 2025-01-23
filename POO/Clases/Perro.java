package Clases;

public class Perro extends Animal {

    //Atributos
    private String nombre;
    private int edad;
    private String color;
    

    //Constructor
    public Perro(String nombre, int edad, String color) {
        nombre = this.nombre;
        edad = this.edad;
        color = this.color;
    }

    //Getters y setters
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


    public String getColor() {
        return color;
    }


    public void setColor(String color) {
        this.color = color;
    }

    //Metodos
    public void ladra() {
        System.out.println("Guauuuu");
    }

    public void sePelea(Perro contrincante ) {
        System.out.println(this.nombre + " se ha peleado con " + contrincante.nombre);
    }
}