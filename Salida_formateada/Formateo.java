package Salida_formateada;

public class Formateo {
    public static void main(String[] args) {
        int num1 = 12;
        Double num2 = 12.5;


        System.out.printf("El numero %d no tiene decimales \n", num1);
        System.out.printf("El numero %f si tiene decimales \n", num2);
        System.out.printf("El numero %.3f tiene 3 decimales", num2);
    }
}
