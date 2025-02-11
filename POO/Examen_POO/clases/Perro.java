package clases;

public class Perro extends Mascota {
    
    //atributos
    private String raza;
    public static int totalPerros = 0;

    //Constructores
    public Perro(String chip) {
        super(chip, chip, 0);
        totalPerros++;
        totalMascotas++;
        
    }

    public Perro(String chip, String nombre) {
        super(chip, nombre, 0);
    }

    //Comportamientos del perro
    public void ladrar() {
        System.out.println("¡Guau! ¡Guau!");
    }

    public void grunir() {
        System.out.println("Grrrrrr");
    }

  
    //Metodo para sacar al perro a pasear, si no esta vacunado salta el mensaje de que tiene que estar vacunado
    public void pasear() {
        if (estado()) {
            ladrar();
            jugar();
        } else {
            System.out.println(this.nombre + " no puede pasear hasta no ser vacunado/a. ");
        }
    }

    //Metodo para cambiar el estado de la vacunacion a true
    public void vacunar() {
        if (estado()) {
            System.out.println(this.nombre + " ya ha sido vacunado.");
        } else {
            this.vacunada = true;
            grunir();
        }
    }

 
    //Metodo con todas las posibilidades que tiene un perro para jugar, sale una aleatoriamente
    public void jugar() {
        int numAleatorio = (int)(Math.random() * 7);

        switch (numAleatorio) {
            case 1:
                System.out.println(this.nombre + " corre tras la pelota y la trae de vuelta");
                break;
            case 2:
                System.out.println(this.nombre + " juega con su mordedor");
                break;
            case 3:
                System.out.println(this.nombre + " muerde un juguete de goma y lo sacude con fuerza");
                break;
            case 4:
                System.out.println(this.nombre + " escarba en la tierra buscando al interesante");
                break;
            case 5:
                System.out.println(this.nombre + " encuentra un palo y lo mastica felizmente");
                break;
            case 6:
                System.out.println(this.nombre + " salta sobre el sofa y espera que le lancen su juguete favorito");
                break;
            case 7:
                System.out.println(this.nombre + " juega con otros perros en el parque y mueve la cola emocionado");
                break;
            case 8:
                System.out.println(this.nombre + " rueda por el suelo pidiendo mas juego");
                break;
            default:
                break;
        }
        
    }

    //Getters y Setters
    public int getNumTotalPerros() {
        return totalPerros;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    //toString
    @Override
    public String toString() {
        return "[" + chip + "]: " + nombre + ", " + edad + " años." ;
    }

    
   
}
