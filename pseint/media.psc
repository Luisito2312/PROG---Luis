Algoritmo media
	Definir num, resultado, cont Como Entero
	Definir med como real
	cont<- -1
	Repetir
		Escribir "Introduce un número"
		leer num
		Si num >= 0 Entonces
			resultado<-resultado + num
			cont<- cont +1
		SiNo
			Escribir "El valor introducido no es valido"
		Fin Si
		
	Hasta Que num = 0
	
	med<-resultado / cont
	
	Escribir "La media es: " med
	
FinAlgoritmo
