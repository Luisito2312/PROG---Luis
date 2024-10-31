package Tema4;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        Double nota;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Que nota has sacado?");
            nota = sc.nextDouble();
        } while ((nota < 0) || (nota > 10));

        System.out.println((nota >= 5)? "Enhorabuena! Has aprobado":"Que mal! Has suspendido");

        sc.close();
    }
}
