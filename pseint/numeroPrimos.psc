Algoritmo numeroPrimos
    definir num, cont, veces, primos, i Como Entero;
    
    Escribir "Introduce cuantos primos quieres";
    leer num;
    
    cont <- 2;
    primos <- 0;
    
    Mientras primos < num Hacer
        veces <- 0;
        
        Para i <- 1 Hasta cont Con Paso 1 Hacer
            Si cont % i = 0 Entonces
                veces <- veces + 1;
            Fin Si
        Fin Para
        
        Si veces = 2 Entonces
            Escribir Sin Saltar cont ;
			Escribir Sin Saltar " ";
            primos <- primos + 1;
        Fin Si
        
        cont <- cont + 1;
    Fin Mientras
FinAlgoritmo
