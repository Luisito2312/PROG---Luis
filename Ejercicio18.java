public class Ejercicio18 {
    public static void main(String[] args) {
        
        int num;
        int suma = 0;
        int i = 0;
        int aux = 0;
        int j = 0;

        System.out.println("Por favor vaya itnroduciendo numeros enteros");
        System.out.println("Puede parar introduciendo un numero negativo");
        
        do {
            num = Integer.parseInt(System.console().readLine());
            if (num % 2 != 0) {
                suma += num;
                j++;

            } else {
                if (num > aux) {
                    aux = num;
                }
            }
            i++;
        } while (num >= 0);

        System.out.println("Ha introducido " + (i - 1)+ " numeros positivos");
        System.out.println("La media de los impares es: " + (suma / j));
        System.out.println("El maximo de los pares es: " + aux);




    }
}
