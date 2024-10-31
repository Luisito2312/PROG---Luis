package Tema4;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        
        int numDia;
        Scanner sc = new Scanner(System.in);

        System.out.println("\033[4mIntroduce un dia de la semana\033[0m \033[33mPor ejemplo: \033[0m\033[1m\033[32m1. Lunes 2. Martes...");
        numDia = sc.nextInt();

        switch (numDia) {
            case 1:
                System.out.println("Es dia de diario");
                break;
            case 2:
                System.out.println("Es dia de diario");
                break;
            case 3:
                System.out.println("Es dia de diario");
                break;
            case 4:
                System.out.println("Es dia de diario");
                break;
            case 5:
                System.out.println("Es dia de diario");
                break;
            case 6:
                System.out.println("Es finde");
                break;
            case 7:
                System.out.println("Es finde");
                break;
            default:
                System.out.println(" **¡¡ERROR!!** Introduce un valor valido");
                break;
        }
        sc.close();
    }
}
