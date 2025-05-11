package Tema5;

public class Vecfy {
    public static void main(String[] args) {
        
        int opcion = 0;

        do {

            System.out.println("1. Suma acumulativa");
            System.out.println("2. Sumar vectores");
            System.out.println("3. Restar vectores");
            System.out.println("4. Producto escalar");
            System.out.println("5. Calcular frecuencia de un elemento");
            System.out.println("6. Buscar elemento");
            System.out.println("7. Encontrar máximo");
            System.out.println("8. Encontrar mínimo");  
            System.out.println("9. Calcular media aritmética");
            System.out.println("10. Invertir vector");
            System.out.println("11. Comparar vectores");
            System.out.println("12. Eliminar duplicados");
            System.out.println("13. Ordenación metodo de la burbuja");
            System.out.println("14. Ordenación por selección");
            System.out.println("15. Concatenar vectores");
            System.out.println("0. Salir");

            opcion = Integer.parseInt(System.console().readLine());

            switch (opcion) {
                case 1:
                    
                    break;
                    case 2:
                    
                    break;
                    case 3:
                    
                    break;
                    case 4:
                    
                    break;
                    case 5:
                    
                    break;
                    case 6:
                    
                    break;
                    case 7:
                    
                    break;
                    case 8:
                    
                    break;
                    case 9:
                    
                    break;
                    case 10:
                    
                    break;
                    case 11:
                    
                    break;
                    case 12:
                    
                    break;
                    case 13:
                    
                    break;
                    case 14:
                    
                    break;
                    case 15:
                    
                    break;
            
                default:
                    System.out.println("¡Gracias por utilizar la aplicacion! ¡Hasta pronto!");
                    break;
            }

        } while (opcion != 0);
        
    }
}
