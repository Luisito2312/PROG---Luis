package EjercicioClase;

import java.util.Scanner;

public class Agenda implements Tarea {

    final static int NUMALUMNOSMAX = 100;

    // Atributos
    private static Alumno[] listado;
    private static int contadorAlumnos;

    // Constructor
    public Agenda() {
        listado = new Alumno[NUMALUMNOSMAX];
        contadorAlumnos = 0;
    }

    // Métodos
    public static void añadir(Alumno alumno, Alumno[] listado) {
        for (int i = 0; i < NUMALUMNOSMAX; i++) {
            if (listado[i] == null) {
                listado[i] = alumno;
                contadorAlumnos++;
                System.out.println("Alumno añadido correctamente");
                return;
            }
        }
        System.out.println("No hay espacio disponible para añadir alumnos");
    }

    public static void editar(Alumno alumno, String dniAlumno, Alumno[] listado) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < listado.length; i++) {
            if (listado[i] != null && listado[i].getDni().equals(dniAlumno)) {
                System.out.println("¿Qué desea editar del alumno?");
                System.out.println("1. Nombre");
                System.out.println("2. DNI");
                System.out.println("3. Edad");
                System.out.println("4. Curso");
                System.out.println("5. Ciclo");
                System.out.println("6. Unidad");

                int opcion = scanner.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.print("Introduce el nuevo nombre: ");
                        listado[i].setNombre(scanner.nextLine());
                        break;
                    case 2:
                        System.out.print("Introduce el nuevo DNI: ");
                        listado[i].setDni(scanner.nextLine());
                        break;
                    case 3:
                        System.out.print("Introduce la nueva edad: ");
                        listado[i].setEdad(scanner.nextInt());
                        break;
                    case 4:
                        System.out.print("Introduce el curso: ");
                        listado[i].setCurso(scanner.nextLine());
                        break;
                    case 5:
                        System.out.print("Introduce el ciclo: ");
                        listado[i].setCiclo(scanner.nextLine());
                        break;
                    case 6:
                        System.out.print("Introduce la unidad: ");
                        listado[i].setUnidad(scanner.nextLine());
                        break;
                    default:
                        System.out.println("Opción no válida");
                        break;
                }
                return;
            }
        }
        System.out.println("Alumno con DNI " + dniAlumno + " no encontrado");
    } 

    public static void listar(Alumno[] listado) {
        for (int i = 0; i < listado.length; i++) {
            if (listado[i] != null) {
                System.out.println(listado[i].toString());
            }
        }
    }
}
