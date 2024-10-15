Algoritmo imc
	Definir altura, peso, resultado Como Real
	Escribir "Introduce tu altura en centimetros"
	Leer altura
	Escribir "Introduce tu peso"
	Leer peso
	altura <- altura / 100
	resultado<-peso / (altura * altura)
	
	Escribir "Su imc es: " resultado
 	
	Si resultado < 18.5 Entonces
		Escribir "Usted está en un peso inferior al normal"
	FinSi
	Si (resultado < 24.9) y (resultado >= 18.5) Entonces
		Escribir "Usted está en un peso normal"
	FinSi
	Si resultado > 24.9 Entonces
		Escribir "Usted está en un peso superior al normal"
	FinSi
	Si resultado >= 30 Entonces
		Escribir "Usted está obeso"
	FinSi
	
	
FinAlgoritmo
