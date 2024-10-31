public class Ejercicio3 {
    public static void main(String[] args) {
        
        int totalSegundos;

        System.out.println("\033[1mCALCULADORA DE TIEMPO \033[0m");
        System.out.println("=====================");
        System.out.print("Introduce una cantidad de segundos: ");
        totalSegundos = Integer.parseInt(System.console().readLine());

        int dias = totalSegundos / 86400;
        int horas = (totalSegundos % 86400) / 3600;
        int minutos = (totalSegundos % 3600) / 60;
        int segundos = totalSegundos % 60;

        System.out.printf(totalSegundos + " segundos son \033[1m\033[46m%d dias\033[0m \033[1m\033[43m%d horas\033[0m \033[1m\033[41m\033[37m%d minutos\033[0m y \033[1m\033[42m%d segundos\033[0m" , dias, horas, minutos, segundos);
    }
}

    

