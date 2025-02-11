package clases;

public class Gato extends Mascota {
    
    //atributos
    private String pelaje;
    public static int totalGatos = 0;

    //Constructores
    public Gato(String chip) {
        super(chip, chip, 0);
        totalGatos++;
        totalMascotas++;
        
    }

    public Gato(String chip, String nombre) {
        super(chip, nombre, 0);
    }

    //Comportamientos del gato
    public void maullar() {
        System.out.println("¡Miauuuuuu! Brrrrr...");
    }

    public void bufar() {
        System.out.println("Fuuuuuu");
    }

    //Metodo que saca al gato a pasear pero si no esta vacunado salta el mensaje de que tiene que vacunarse
    public void pasear() {
        if (estado()) {
            maullar();
            jugar();
        } else {
            System.out.println(this.nombre + " no puede pasear hasta no ser vacunado/a. ");
        }
    }

    //metodo para cambiar el estado de la vacunacion del gato a true o salta el mensaje de que ya esta vacunado
    public void vacunar() {
        if (estado()) {
            System.out.println(this.nombre + " ya ha sido vacunado.");
        } else {
            this.vacunada = true;
            bufar();
        }
    }

    //Metodo para jugar
    public void jugar() {
        System.out.println(this.nombre + " se tumba en un ovillo de lana y lo araña.");
    }

    //Getters y Setters
    public String getPelaje() {
        return pelaje;
    }

    public void setPelaje(String pelaje) {
        this.pelaje = pelaje;
    }

    public static int getTotalGatos() {
        return totalGatos;
    }

    //toString
    @Override
    public String toString() {
        return "[" + chip + "]: " + nombre + ", " + edad + " años." ;
    }

    

}
