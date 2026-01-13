public class Libro {
    
    //Atributos
    private String titulo;
    private int anio;
    private String isbn;
    private boolean prestado;
    private String[] autores;
    private final int NUMAUTORES = 5;

    //Constructor
    public Libro() {

    }

    public Libro(String titulo, int anio, String isbn, boolean prestado) {
        this.titulo = titulo;
        this.anio = anio;
        this.isbn = isbn;
        this.prestado = false;
        this.autores = new String[NUMAUTORES];
    }

    //Metodos
    public void mostrarInformacion(Libro libro) {
        System.out.println(libro.getTitulo() + ", "+ libro.getAnio()+", "+libro.getIsbn()+", ");
        for (int i = 0; i < libro.getAutor().length; i++) {
            if (libro.getAutor()[i] != null) {
                System.out.print(libro.getAutor()[i] + " ");
            } 
        }
    }

    public boolean prestar() {
        this.prestado = true;

        return prestado;
    }

    public boolean devolver() {
        this.prestado = false;

        return prestado;
    }

    //Getters
    public String getTitulo() {
        return titulo;
    }

    public int getAnio() {
        return anio;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public String[] getAutor() {
        return autores;
    }
}
