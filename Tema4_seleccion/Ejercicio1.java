public class Ejercicio1 {
    public static void main(String[] args) {

        String diaDeLaSemana;

        System.out.println("Introduce un dia de la semana y te digo que asignatura hay a primera: ");
        diaDeLaSemana = System.console().readLine();

        switch (diaDeLaSemana) {
            case "lunes":
                System.out.println("Tenemos programacion");
                break;
            case "martes":
                System.out.println("Tenemos Bases de datos");
                break;
            case "miercoles":
                System.out.println("Toca Sostenibilidad");
                break;
            case "jueves":
                System.out.println("Toca programacion");
                break;
            case "viernes":
                System.out.println("Toca IPE");
                break;
        
            default:
                System.out.println("Introduce un dia de la semana valido");
                break;
        }
    }
}