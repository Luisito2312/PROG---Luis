public class AsignaturaPorDia {
    public static void main(String[] args) {
        
        String diaSemana;

        System.out.print("Introduce un dia de la semana para ver que hay a primera: ");
        diaSemana = System.console().readLine();

        switch (diaSemana) {
            case "lunes":
                System.out.println("Los lunes tenemos Entornos a primera");
                break;
            case "martes":
                System.out.println("Los martes tenemos Bases de datos a primera");
                break;
            case "miercoles":
                System.out.println("Los miercoles tenemos Bases de datos a primera");
                break;
            case "jueves":
                System.out.println("Los jueves tenemos programacion a primera");
                break;
            case "viernes":
                System.out.println("Los viernes tenemos Sistemas informaticos a primera");
                break;
            default:
            System.out.println("!!ERROR!!: No ha introducido un dia válido");
                break;
        }
    }
}
