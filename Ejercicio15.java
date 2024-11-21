public class Ejercicio15 {
    public static void main(String[] args) {
        
        int num;
        int num2;

        System.out.print("Introduce un numero: ");
        num = Integer.parseInt(System.console().readLine());

        System.out.print("Introduce un numero distinto al anterior: ");
        num2 = Integer.parseInt(System.console().readLine());

        while (num == num2) {
            System.out.println("Numeros no validos, deben ser distintos");
            System.out.println();
            System.out.println("Introduce un numero");
            num = Integer.parseInt(System.console().readLine());

            System.out.println("Introduce un numero distinto al anterior");
            num2 = Integer.parseInt(System.console().readLine());
        }

        if (num < num2) {
            for (; num < num2; num+= 7) {
                System.out.print(num + " ");

            } 
        } else {
            for (; num2 < num; num2+= 7) {
                System.out.print(num2 + " ");
            }
        }
        System.out.println();
    }
}
