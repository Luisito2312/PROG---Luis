Proceso MenuRectangulo
	Definir base, altura, opcion, i, j, k como entero;
	
	Repetir
		
		Escribir "1. Introduzca la dimensión de la base del rectángulo.";
		Escribir "2. Introduzca la dimensión de la altura del rectángulo";
		Escribir "3. Pinta el rectángulo";
		Escribir "4. Intercambia base por altura";
		Escribir "5. Salir";
		Leer opcion;
		
		Segun opcion Hacer
			1:
				Escribir "Introduce la base";
				Leer base;
				
			2:
				Escribir "Introduce la altura";
				Leer altura;
				
			3:
				Para i <- 1 Hasta base Con Paso 1 Hacer
					Escribir Sin Saltar "* ";
				FinPara
				Escribir "";
					
				Para j <- 2 Hasta altura-1 Con Paso 1 Hacer
					Escribir Sin Saltar "* " ;
					Para k <- 2 Hasta base Con Paso 1 Hacer
						Si k = base Entonces
							Escribir Sin Saltar "* "  ;
						SiNo
							Escribir Sin Saltar "  ";
						FinSi
					FinPara
					Escribir ""; 
				FinPara
					
				Si altura > 1 Entonces
					Para i <- 1 Hasta base Con Paso 1 Hacer
						Escribir Sin Saltar "* ";
					FinPara
					Escribir "";
				FinSi
				
			4:
				Para i <- 1 Hasta altura Con Paso 1 Hacer
					Escribir Sin Saltar "* ";
				FinPara
				Escribir "";
					
				Para j <- 2 Hasta base-1 Con Paso 1 Hacer
					Escribir Sin Saltar "* " ;
					Para k <- 2 Hasta altura Con Paso 1 Hacer
						Si k = altura Entonces
							Escribir Sin Saltar "* "  ;
						SiNo
							Escribir Sin Saltar "  ";
						FinSi
					FinPara
					Escribir ""; 
				FinPara
					
				Si base > 1 Entonces
					Para i <- 1 Hasta altura Con Paso 1 Hacer
						Escribir Sin Saltar "* ";
					FinPara
					Escribir "";
				FinSi
				
			5:
				Escribir "Hasta luego!";
				
			De Otro Modo:
				Escribir "Introduce un valor válido";
				
		FinSegun
		
	Hasta Que opcion = 5
	
FinProceso
