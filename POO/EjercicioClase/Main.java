package EjercicioClase;

public class Main {
    
    public static void main(String[] args) {

        int opcion;
        Alumno[] listado = new Alumno[100];
       
        do {

            System.out.println("1. Añadir alumno");
            System.out.println("2. Listar alumnos");
            System.out.println("3. Editar alumno");
            System.out.println("4. Eliminar alumno");
            System.out.println("0. Salir");
            opcion = Integer.parseInt(System.console().readLine());

            switch (opcion) {

                case 0: 
                    System.out.println("Hasta luego!!");
                    break;

                case 1:

                    System.out.println("Introduce el dni del alumno");
                    String dni = System.console().readLine();
                    System.out.println("Introduce le nombre del alumno");
                    String nombre = System.console().readLine();
                    System.out.println("Introduce la edad del alumno");
                    int edad = Integer.parseInt(System.console().readLine());
                    System.out.println("Introduce el ciclo del alumno");
                    String ciclo = System.console().readLine();
                    System.out.println("Introduce el curso del alumno");
                    String curso = System.console().readLine();
                    System.out.println("Introduce la unidad del alumno");
                    String unidad = System.console().readLine();

                    Alumno alumno = new Alumno(dni, nombre, edad, ciclo, curso, unidad);
                    Agenda.añadir(alumno, listado);

                    break;
                case 2:
                    Agenda.listar(listado);
                    break;
                case 3:
                    System.out.println("Introduce el dni del alumno a editar");
                    String dni1 = System.console().readLine();
                    for (int i = 0; i < listado.length; i++) {
                        if (dni1.equals(listado[i].getDni())) {
                            Agenda.editar(listado[i], dni1, listado);
                        } else {
                            System.out.println("No existe ningun alumno con ese dni.");
                        }
                    }
                    
                    break;

                case 4: 

                    break;
                    
                default:
                System.out.println("No has introducido un valor válido, se procederá a salir del programa");
                    break;
            }

        } while (opcion != 0);
        

    }
}
