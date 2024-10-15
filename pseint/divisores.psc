Algoritmo divisores
	Definir num, num2 como entero
	
	Escribir "Introduce un numero"
	leer num
	Escribir sin saltar "Los divisores de " num " son : "
	Para i<-1 Hasta num Con Paso 1 Hacer
		Si num % i = 0 Entonces
			Escribir sin saltar i " ,";
		Fin Si
	Fin Para
FinAlgoritmo
