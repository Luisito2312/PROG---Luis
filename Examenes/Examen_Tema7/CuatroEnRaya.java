public class CuatroEnRaya {
    
    private static final int FILA = 4;
    private static final int COLUMNA = 4;
    public static void main(String[] args) {
        
        String[][] tablero = new String[FILA][COLUMNA];
        // String[][] tableroAux = new String[FILA][COLUMNA];   
        int FilaOrdenador;
        int ColumnaOrdenador;
        String FilaJugador;
        int ColumnaJugador;

        //Variable que determina cuando acaba la partida
        boolean Final = false;

        //Inicializacion del tablero
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                tablero[i][j] = ".";
            }
        }

        do {
            //La maquina elige la casilla
            FilaOrdenador = (int) (Math.random() * FILA);
            ColumnaOrdenador = (int) (Math.random() * COLUMNA);

            //La maquina pone la primera posicion
            DibujarTableroOrdenador(tablero, FilaOrdenador, ColumnaOrdenador);

            System.out.println("Turno del jugador: ");
            System.out.print("Introduce la fila (a-d): ");
            FilaJugador = System.console().readLine();
            System.out.print("Introduce la columna (0-3): ");
            ColumnaJugador = Integer.parseInt(System.console().readLine());

            DibujarTableroJugador(tablero, FilaJugador, ColumnaJugador);

            // if (Victoria(tablero) == 1) {
            //     System.out.println("¡HA GANADO EL ORDENADOR!");
            //     Final = true;

            // } else if (Victoria(tablero) == 2) {
            //     System.out.println("¡ENHORABUENA ME HAS GANADO!");
            //     Final = true;
            // } else {
            //     System.out.println("El juego ha terminado en TABLAS");
            //     Final = true;
            // }
        } while (!Final);
        


    }
    //Funcion para dibujar el tablero cuando es el turno del ordenador
    public static void DibujarTableroOrdenador(String tablero[][], int Fila, int Columna) {

        int contador = 1;

        System.out.println("LAS CUATRO EN RAYA");
        System.out.println("==================");

        for (int i = 0; i < FILA; i++) {
            switch (contador) {
                case 1:
                    System.out.print("a |  ");
                    break;
                case 2:
                    System.out.print("b |  ");
                    break;
                case 3:
                    System.out.print("c |  ");
                    break;
                case 4: 
                    System.out.print("d |  ");
                    break;
                default:
                    break;
            }
            for (int j = 0; j < 4; j++) {
                if (((i == Fila) && (j == Columna) && (tablero[i][j] == "."))) {
                    tablero[i][j] = "X";
                } else if ((tablero[i][j] == "X") || (tablero[i][j] == "O")) {
                    Fila = (int) (Math.random() * FILA);
                    Columna = (int) (Math.random() * COLUMNA);
                }
                System.out.print(tablero[i][j] + "  ");
            }
            contador++;
            System.out.println();
            
        }
        System.out.println("   -------------");
        System.out.println("     0  1  2  3");

        
    }
    //Funcion para dibujar el tablero cuando es el turno del jugador
    public static void DibujarTableroJugador(String[][] tablero, String Fila, int Columna) {
        
        int FilaDJugador = 0;
        int contador = 1;

        System.out.println("LAS CUATRO EN RAYA");
        System.out.println("==================");

        for (int i = 0; i < FILA; i++) {
            switch (Fila) {
                case "a":
                    FilaDJugador = 0;
                    break;
                case "b":
                    FilaDJugador = 1;
                    break;
                case "c":
                    FilaDJugador = 2;
                    break;
                case "d": 
                    FilaDJugador = 3;
                    break;
                default:
                    break;
            }
            switch (contador) {
                case 1:
                    System.out.print("a |  ");
                    break;
                case 2:
                    System.out.print("b |  ");
                    break;
                case 3:
                    System.out.print("c |  ");
                    break;
                case 4: 
                    System.out.print("d |  ");
                    break;
                default:
                    break;
            }

            for (int j = 0; j < 4; j++) {
                if (((i == FilaDJugador) && (j == Columna))) {
                    tablero[i][j] = "O";
                }
                System.out.print(tablero[i][j] + "  ");
            }
            System.out.println();
            contador++;
        }
        System.out.println("   -------------");
        System.out.println("     0  1  2  3");
    }

    // public static int Victoria(String[][] tabla) {
    //     //Cuatro en raya por filas
    //     for (int i = 0; i < FILA; i++) {
    //         if (!tabla[i][0].equals(".") && tabla[i][0].equals(tabla[i][1]) && tabla[i][1].equals(tabla[i][2]) && tabla[i][2].equals(tabla[i][3])) {
                
    //         } else if (tabla[i][0].equals("X")&& tabla[i][1].equals("X") && tabla[i][2].equals("X") && tabla[i][3].equals("X")) {
                
    //             return 1;
    //         } else if (tabla[i][0].equals("O")&& tabla[i][1].equals("O") && tabla[i][2].equals("O") && tabla[i][3].equals("O")) {
                
    //             return 2;
    //         }
    //     }
    
    //     //Cuatro en raya por columnnas
    //     for (int j = 0; j < COLUMNA ; j++) {
    //         if (!tabla[0][j].equals(".") && tabla[0][j].equals(tabla[1][j]) && tabla[1][j].equals(tabla[2][j]) && tabla[2][j].equals(tabla[3][j])) {
                
    //         }else if (tabla[0][j].equals("X")&& tabla[1][j].equals("X")&& tabla[2][j].equals("X") && tabla[3][j].equals("X")) {
                
    //             return 1;
    //         } else if (tabla[0][j].equals("O")&& tabla[1][j].equals("O")&& tabla[2][j].equals("O") && tabla[3][j].equals("O")) {
                
    //             return 2;
    //         }
    //     }
    
    //     //Cuatro en traya por diagonales
    //     if (!tabla[0][0].equals(".") && tabla[0][0].equals(tabla[1][1]) && tabla[1][1].equals(tabla[2][2]) && tabla[2][2].equals(tabla[3][3])) {
            
    //     } else if (tabla[0][0].equals("X")&& tabla[1][1].equals("X")&& tabla[2][2].equals("X")&& tabla[3][3].equals("X")) {
            
    //         return 1;
    //     } else if (tabla[0][0].equals("O")&& tabla[1][1].equals("O")&& tabla[2][2].equals("O")&& tabla[3][3].equals("O")) {
            
    //         return 2;
    //     }
    //     if (!tabla[0][3].equals(".") && tabla[0][3].equals(tabla[1][2]) && tabla[1][2].equals(tabla[2][1]) && tabla[2][1].equals(tabla[3][0])) {
            
    //     } else if (tabla[0][3].equals("X")&& tabla[1][2].equals("X")&& tabla[2][1].equals("X")&& tabla[3][0].equals("X")) {
            
    //         return 1;
    //     } else if (tabla[0][0].equals("O")&& tabla[1][2].equals("O")&& tabla[2][1].equals("O")&& tabla[3][0].equals("O")) {
            
    //         return 2;
    //     }

    //     return 0;
    // }
}