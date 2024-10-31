public class Ejercicio1 {
    public static void main(String[] args) {
        
        Double radOrbital;
        Double resultado;
        Double radAnos;

        System.out.println("\033[1mPERIODO ORBITAL DEL PLANETA \033[0m");
        System.out.println("============================");
        System.out.print("Ingrese el radio orbital del planeta en millones de kilometros: ");
        radOrbital = Double.parseDouble(System.console().readLine());

        radAnos = radOrbital / 149.6;
        resultado = Math.sqrt((radAnos * radAnos * radAnos));

        System.out.printf("El período orbital del planeta es aproximadamente \033[1m %.3f años" , resultado );
    }
}