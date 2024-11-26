public class ParDivisible {
    
    public static void main(String[] args) {
        System.out.println("Introduce un numero para comprobar que es par y que es divisible entre 5");
        int num = Integer.parseInt(System.console().readLine());

        if (num%2==0){System.out.println("El numero es par");}
         else if(num%5==0) {
            System.out.println("El numero es divisible entre 5");
        } else {
            System.out.println("El numero introducido no es par ni divisible por 5");
        }
    }
}
