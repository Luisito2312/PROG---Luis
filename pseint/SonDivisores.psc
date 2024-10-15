Proceso SonDivisores
	Definir num, i como Entero;
	
	Escribir "Introduzca un número para saber sus divisores";
	Leer num;
	
	Escribir sin saltar "Los divisores de ", num, " son: ";
	Para i<-1 Hasta num Con Paso 1 Hacer
		Si num % i = 0 Entonces
			Escribir Sin Saltar i, " ,";
		FinSi
	FinPara
	
FinProceso
