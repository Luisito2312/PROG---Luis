package clases;

public class Almacen implements ListaGestoresInterface {
    private final int MAX = 5;

    //Atributos
    Gestor[] gestores = new Gestor[MAX];
    Gestor activo;

    

    public Almacen(Gestor[] gestores) {
        this.gestores = gestores;
    }

    public Almacen() {
        
    }

    @Override
    public boolean usar(int index) {
        boolean exito = false;

        for (Gestor gestor : gestores) {
            if (gestor.hashCode() == index) {
                this.activo = gestor;
                exito = true;
            }
        }

        return exito;
    }

    @Override
    public boolean agregar(String archivo) {
        boolean exito = false;


        for (int i = 0; i < gestores.length; i++) {
            if (gestores[i].equals(null) ) {
                gestores[i] = new Gestor();
                exito = true;
            }
        }

        return exito;
    }

    @Override
    public boolean fusionar(int origen, int destino) {
        boolean exito = false;
        
        Gestor gestor1 = new Gestor();
        Gestor gestor2 = new Gestor();

        if (origen!=destino && origen<MAX && destino<MAX) {

            for (int i = 0; i < gestores.length; i++) {
                if (i == origen) {
                    gestor1 = gestores[i];
                }
    
                if (i == destino) {
                    gestor2 = gestores[i];
                }
            }
            gestor1.getTareas();
            gestor2.meter(gestor1.getTareas());
            exito = true;
        }
        
        return exito;
    }

    @Override
    public void listar() {
        
    }

    @Override
    public void guardar() {
        
    }

    public Gestor getActivo() {
        
        return activo;
    }
    


}
