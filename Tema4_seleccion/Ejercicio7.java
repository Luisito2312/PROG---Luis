public class Ejercicio7 {
    public static void main(String[] args) {
        double nota1, nota2, nota3;

        System.out.println("Introduce la primera nota");
        nota1 = Double.parseDouble(System.console().readLine());
        do {
            if ((nota1 < 0) || (nota1 > 10)) {
                System.out.println("No has introducido una nota correcta, introducela");
                nota1 = Double.parseDouble(System.console().readLine());
            }
        } while ((nota1 < 0) || (nota1 > 10));

        System.out.println("Introduce la srgunda nota");
        nota2 = Double.parseDouble(System.console().readLine());
        do {
            if ((nota2 < 0) || (nota2 > 10)) {
                System.out.println("No has introducido una nota correcta, introducela");
                nota2 = Double.parseDouble(System.console().readLine());
            }
        } while ((nota2 < 0) || (nota2 > 10));

        System.out.println("Introduce la tercera nota");
        nota3 = Double.parseDouble(System.console().readLine());
        do {
            if ((nota3 < 0) || (nota3 > 10)) {
                System.out.println("No has introducido una nota correcta, introducela");
                nota3 = Double.parseDouble(System.console().readLine());
            }
        } while ((nota3 < 0) || (nota3 > 10));
        
        double resultado = (nota1 + nota2 + nota3) / 3;

        System.out.printf("Tu nota es: %.2f \n", resultado);

        if (resultado < 5) {
            System.out.println("Insuficiente");
        } else if (resultado >= 5 && resultado < 6) {
            System.out.println("Suficiente");
        } else if (resultado >= 6 && resultado < 7) {
            System.out.println("Bien");
        } else if (resultado >= 7 && resultado < 9) {
            System.out.println("Notable");
        } else if (resultado >= 9) {
            System.out.println("Sobresaliente");
        }
    }
}
