public class Ejercicio32 {
    public static void main(String[] args) {

        int fila;
        int altura;
        int espacios;
        int mitad;


        System.out.println("Introduce la altura de la X");
        altura = Integer.parseInt(System.console().readLine());

        //Dibujamos solo si la altura es impar y mayor o igual que 3
        if ((altura >= 3) && (altura %2!=0)) {

            espacios = altura - 2;
            //Guardamos el 
            mitad = (altura - 1) / 2;

            for(fila = 1; fila <=mitad; fila++) {
                dibujarEspacios(fila -1);

                System.out.print("*");

                System.out.println("*");
            }
        }

       
    }

    public static void dibujarEspacios(int espacios){
        for(int i = 1;i <= espacios;i++){System.out.println(" ");}
    }
}


