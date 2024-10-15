Proceso Piramide
	Definir altura, i, j, k Como Entero;
	Escribir 'Introduce la altura de la pirámide: ';
	Leer altura;
	Para i<-1 Hasta altura Con Paso 1 Hacer
		Para j<-1 Hasta (altura-i) Con Paso 1 Hacer
			Escribir ' 'Sin Saltar; // espacios
		FinPara
		Para k<-1 Hasta i Con Paso 1 Hacer
			Escribir '* 'Sin Saltar; // asteriscos
		FinPara
		Escribir ' ';
	FinPara // salto de linea
FinProceso
