Proceso EsPrimo
	Definir num, i , contador Como Entero;
	contador <- 0;
	Escribir "Introduce un n�mero para comprobar que es primo o no";
	Leer num;
	
	Para i<-1 Hasta num Con Paso 1 Hacer
		Si (num % i) = 0 Entonces
			contador <- contador + 1;
		FinSi
	FinPara
	
	Si cont = 2 Entonces
		Escribir "El n�mero: ", num, " es primo.";
	SiNo
		Escribir "El n�mero: ", num, " no es primo";
	FinSi
FinProceso
