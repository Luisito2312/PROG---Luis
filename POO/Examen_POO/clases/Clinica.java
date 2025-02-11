package clases;

import interfaces.ClinicaInterfaz;

public class Clinica implements ClinicaInterfaz {

    private final int MAXIMO = 100;
    private int total;
    private int ultimo;

    //Listado donde se iran almacenando todas las mascotas, tanto perros como gatos
    Mascota[] listado;

    public Clinica() {
        this.total = 0;
        this.ultimo = 0;
        this.listado = new Mascota[MAXIMO];
    }

    //Metodos
    //Metodo para verificar que el listado de mascotas esta vacio
    public boolean esVacia() {
        return this.total == 0;
    }

    //Metodo para comprobar que el listado esta lleno
    public boolean esLlena() {
        return this.ultimo == MAXIMO;
    }

    //Metodo que devuelve la cantidad de perros que hay en la clinica
    public int totalPerros() {
        return Perro.totalPerros;
    }

    //Metodo que devuelve la cantidad de gatos que hay en la clinica
    public int totalGatos() {
        return Gato.totalGatos;
    }

    //Metodo que devuelve la cantidad de mascotas que hay en la clinica
    public int totalMascotas() {
        return Mascota.totalMascotas;
    }

    //Metodo para agregar una mascota nueva a la clinica
    public void agregar(Mascota mascota) {
        int cont = 0;
        for (int i = 0; i < listado.length; i++) {
            if ((listado[i] == null) && (cont == 0)) {
                listado[i] = mascota;
                cont++;
                total++;

            }
        }
        cont = 0;
    }

    //Metodo que segun el chip que se le pase por parametro devuelve la mascota correspondiente no consigo que funcione, no puedo mas
    @Override
    public Mascota buscarChip(String chip) {

        Mascota animal = null;

        for (int i = 0; i < MAXIMO; i++) {
            if (listado[i]!= null && listado[i].getChip()==chip) {
                animal = listado[i];
            }
        }
    
        return animal;

    }

    //Metodo que sirve para mostrar en forma de lista todos los animales de la clinica
    public void listar() {

        for(int i=0; i < MAXIMO; i++) {
            if (this.listado[i]!=null) {

                System.out.println(this.listado[i]);
                
            }
        }  
    }
}