public class SaludoSegunHora {
    public static void main(String[] args) {
        
        int hora;

        System.out.println("Introduce una hora (0 - 23)");
        hora = Integer.parseInt(System.console().readLine());

        if ((hora >= 6) && (hora < 12)) {
            System.out.println("Buenos días");
        } else if ((hora > 12 && (hora < 20))) {
            System.out.println("Buenas tardes");
        } else if ((hora > 20) && (hora < 5)) {
            System.out.println("Buenas noches");
        } else {
            System.out.println("ERROR: No ha introducido un valor valido");
        }
    }
}
