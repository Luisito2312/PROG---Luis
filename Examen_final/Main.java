/**
 * EXAMEN PROGRAMACIÓN RECUPERACIÓN JUNIO
 * curso 2024|25
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) 
    {

        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        // Comprobación de argumentos por línea de comandos
        //
        //
        //

        // programa principal

        do {
            System.out.println("===============================");
            System.out.println(" Biblioteca – Menú principal");
            System.out.println("===============================");
            System.out.println("0. Salir");
            System.out.println("1. Añadir libro");
            System.out.println("2. Mostrar todos los libros");
            System.out.println("3. Buscar libro por título");
            System.out.println("4. Buscar libro por autor");
            System.out.println("5. Prestar libro");
            System.out.println("6. Devolver libro");
            System.out.println("7. Importar libros desde archivo");
            System.out.println("8. Guardar libros en archivo");
            System.out.println("9. Mostrar estadísticas");
            System.out.println("10. Listar libros por año");
            System.out.print("Seleccione una opción: ");
            opcion = Integer.parseInt(scanner.nextLine());

            switch (opcion) {
                case 0:
                    System.out.println("¡Hasta pronto!");
                    break;

                case 1:
                    System.out.print("Título: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Año de publicación: ");
                    int anio = Integer.parseInt(scanner.nextLine());
                    System.out.print("ISBN: ");
                    String isbn = scanner.nextLine();
                    System.out.print("¿Está prestado? (true/false): ");
                    boolean prestado = Boolean.parseBoolean(scanner.nextLine());
                    System.out.print("Autores (separados por coma): ");
                    String[] autores = scanner.nextLine().split(",");
                    Libro nuevoLibro = new Libro(titulo, anio, isbn, prestado);
                    biblioteca.agregarLibro(nuevoLibro);
                    break;

                case 2:
                    biblioteca.mostrarTodos();
                    break;

                case 3:
                    System.out.print("Introduce el título a buscar: ");
                    String tituloBuscar = scanner.nextLine();
                    biblioteca.buscarPorTitulo(tituloBuscar);
                    break;

                case 4:
                    System.out.print("Introduce el nombre del autor a buscar: ");
                    String autorBuscar = scanner.nextLine();
                    var librosPorAutor = biblioteca.buscarPorAutor(autorBuscar);
                    if (librosPorAutor.isEmpty()) {
                        System.out.println("No se encontraron libros para el autor: " + autorBuscar);
                    } else {
                        System.out.println("Libros encontrados:");
                        for (Libro libro : librosPorAutor) {
                            System.out.println(libro);
                        }
                    }
                    break;

                case 5:
                    System.out.print("Introduce el ISBN del libro a prestar: ");
                    String isbnPrestar = scanner.nextLine();
                    boolean exitoPrestar = biblioteca.prestarLibro(isbnPrestar);
                    if (exitoPrestar) {
                        System.out.println("El libro ha sido prestado correctamente.");
                    } else {
                        System.out.println("No se encontró el libro o no se pudo prestar.");
                    }
                    break;

                case 6:
                    System.out.print("Introduce el ISBN del libro a devolver: ");
                    String isbnDevolver = scanner.nextLine();
                    boolean exitoDevolver = biblioteca.devolverLibro(isbnDevolver);
                    if (exitoDevolver) {
                        System.out.println("El libro ha sido devuelto correctamente.");
                    } else {
                        System.out.println("No se encontró el libro o no se pudo devolver.");
                    }
                    break;

                case 7:
                    biblioteca.importarDesdeArchivo("libros.txt");
                    break;

                case 8:
                    biblioteca.guardarEnArchivo("libros.txt");
                    break;

                case 9:
                    biblioteca.mostrarEstadisticas();
                    break;

                case 10:
                    System.out.print("Introduce el año para listar libros: ");
                    int anioListar = Integer.parseInt(scanner.nextLine());
                    biblioteca.listarPorAnio(anioListar);
                    break;

                default:
                    System.out.println("Introduce una opción válida.");
            }
        } while (opcion != 0);

        scanner.close();
    }
}