Algoritmo calificacion
	Definir nota como Entero;
	Escribir "Introduce tu nota entre 0 y 10";
	Leer nota;
	
	Segun nota Hacer
		0,1,2,3,4: Escribir "Insuficiente"
		5: Escribir "Suficiente";
		6: Escribir "Bien";
		7,8: Escribir "Notable";
		9,10: Escribir "Sobresaliente";
		De Otro Modo:
			Escribir "Introduce una nota valida";
	Fin Segun
	
FinAlgoritmo
