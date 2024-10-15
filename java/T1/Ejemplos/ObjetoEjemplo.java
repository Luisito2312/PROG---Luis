public class ObjetoEjemplo {
    public static void main(String[] args) {
        Gato gato1 = new Gato();
        Gato gato2 = new Gato();

        gato1.nombre = "Paco";
        gato1.edad = 12;
        gato1.chip = "123423DAJ";

        gato2.nombre = "Luis";
        gato2.edad = 12;
        gato2.chip = "123423DAJ";
        
        System.out.println("El primer gato se llama " + gato1.nombre);
        System.out.println("El segundo gato se llama " + gato2.nombre);

        gato1.maulla();
    }
}
