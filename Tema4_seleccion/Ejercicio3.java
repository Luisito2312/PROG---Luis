public class Ejercicio3 {
    public static void main(String[] args) {
        
        int numHoras;
        int salario;
        int horasExtra;

        System.out.print("Introduce el numero de horas que trabajas a la semana: ");
        numHoras = Integer.parseInt(System.console().readLine());

        if (numHoras <= 40) {
            salario = numHoras * 12;
            System.out.println("Tu salario semanal es de " + salario + " euros.");
        } else {
            horasExtra = numHoras - 40;
            salario = 40 * 12;
            horasExtra = horasExtra * 16;
            salario = salario + horasExtra;
            System.out.println("Tu salario semanal es de " + salario + " euros.");
        } {
            
        }
    }
}
