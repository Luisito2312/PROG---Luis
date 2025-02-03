package EjercicioClaseResuelto;

public class Main {
    private static final int N = 100;

    public static void main(String[] args) {
        
        int op = 0;
        Agenda agenda = new Agenda();

        do {
            menu();
            
            System.out.println("Elige opcion");
            op = Integer.parseInt(System.console().readLine());

            switch (op) {
                case 0:
                    break;
                case 1:
                    break;
                case 2:
                    nuevoAlumno(agenda);
                    agenda.aniadir(a);

                    break;
                case 3:
                    break;
                case 4:
                    break;
   
                default:
                System.out.println("Opcion incorrecta, introduce de nuevo");
                    
            }
        } while (op!=0);

    }

    private static void menu() {
        System.out.println("GESTION DE ALUMANDO");
        System.out.println("0. Salir");
        System.out.println("1. Listar alumnado");
        System.out.println("2. Añadir nuevo alumno");
        System.out.println("3. Modificar alumno");
        System.out.println("4. Borrar alumno");
        
    }

    private static void nuevoAlumno(Agenda agenda) {

        String dni;
        String nombre;
        String ciclo;
        int curso;
        String unidad;
        int edad;

        System.out.println("Dni: ");
        dni = System.console().readLine();

        System.out.println("Nombre: ");
        nombre = System.console().readLine();

        System.out.println("ciclo: ");
        ciclo = System.console().readLine();

        System.out.println("unidad: ");
        unidad = System.console().readLine();

        System.out.println("edad: ");
        edad = Integer.parseInt(System.console().readLine());

        System.out.println("curso: ");
        curso = Integer.parseInt(System.console().readLine());

        if (agenda.esLlena()) {
            System.out.println("La agenda esta completa");
        } else {
            agenda.aniadir(new Alumno(dni, nombre, edad, ciclo, unidad, curso));
        }

    }
}
