public class Ejercicio5 {
    public static void main(String[] args) {
        
        int num;

        System.out.print("Introduce un numero y te dire la tabla de multiplicar: ");
        num = Integer.parseInt(System.console().readLine());

        for (int i = 0; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + num*i);
        }
    }
}
