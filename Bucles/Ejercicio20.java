public class Ejercicio20 {
    static final int LIMITE = 10000;
    public static void main(String[] args) {
        
        int num;
        int sum = 0;
        int cont = 0;
        float media;

        System.out.println("Por favor, vaya introduciendo numeros.");
        System.out.println("El programa termina cuando la suma de los numeros sea 10000");

        do {
            num = Integer.parseInt(System.console().readLine());
            sum += num;
            cont++;
        } while (sum < LIMITE);

        media = sum / cont;

        System.out.println("Ha introducido un total de " + cont + " numeros");
        System.out.println("La suma total es: " + sum);
        System.out.println("La media es: " + media);
        
    }
}
