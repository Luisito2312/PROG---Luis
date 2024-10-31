package Tema4;

import java.util.Scanner;

public class Seleccion {
    public static void main(String[] args) {
        
        int edad;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce tu edad");
        edad = sc.nextInt();

        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menor de edad");
        }

        sc.close();
    }
}
