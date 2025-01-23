public class Tesoro {
    //Funcion para rellenar un array bidimensional
    public static void rellenarArray(int[][] a, int min, int max) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = (int) (Math.random() * (max - min + 1) + min);
            }
        }
    }
     //Programa de budsqueda del tesoro con arrays, que tiene 3 filas y 3 columnas, que dibuja despues de cada coordenada el mapa con una x en la casilla que se ha introducido  
    public static void main(String[] args) {
        int[][] mapa = new int[5][5];
        int x;
        int y;
        int tesoros = 3;
        int tesorosEncontrados = 0;
        boolean encontrado = false;
        
        rellenarArray(mapa, 0, 1);
        // Colocar tesoros en el mapa
        while (tesoros > 0) {
            x = (int) (Math.random() * mapa.length);
            y = (int) (Math.random() * mapa[0].length);
            if (mapa[x][y] == 0) {
            mapa[x][y] = 1;
            tesoros--;
            }
        }

        // Juego de búsqueda del tesoro
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        while (tesorosEncontrados < 3) {
            System.out.println("Introduce la coordenada X (0-4): ");
            x = scanner.nextInt();
            System.out.println("Introduce la coordenada Y (0-4): ");
            y = scanner.nextInt();

            if (mapa[x][y] == 1) {
            System.out.println("¡Tesoro encontrado!");
            tesorosEncontrados++;
            mapa[x][y] = 2; // Marcar tesoro encontrado
            } else {
            System.out.println("No hay tesoro en esta coordenada.");
            mapa[x][y] = -1; // Marcar casilla vacía
            }

            // Mostrar mapa
            for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[i].length; j++) {
                if (mapa[i][j] == 2) {
                System.out.print("T ");
                } else if (mapa[i][j] == -1) {
                System.out.print("X ");
                } else {
                System.out.print(". ");
                }
            }
            System.out.println();
            }
        }
        scanner.close();
        System.out.println("¡Has encontrado todos los tesoros!");
    }
}
