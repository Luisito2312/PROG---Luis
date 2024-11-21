public class Ejercicio4 {
    public static void main(String[] args) {

        int contraseña = 1234;
        int contraseñaIntento;
        int control = 0;

        for (int i = 0; i < 4; i++) {

            System.out.println("Introduce el codigo de la caja fuerte");
            contraseñaIntento = Integer.parseInt(System.console().readLine());

            if (contraseñaIntento == contraseña) {

                System.out.println("\033[35mLa caja fuerte se ha abierto satisfactoriamente\033[0m");
                i = 4;
            } else {

                System.out.println("Lo siento, esa no es la combinacion");
                control = 4;
            }
        }

        if (control == 4) {
            System.out.println("Lo siento, ha gastado las 4 oportunidades");
            System.out.println("Se esta avisando a la policia");
        }
    }
}
