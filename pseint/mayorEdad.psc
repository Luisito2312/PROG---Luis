Algoritmo mayorEdad
	Definir edad como Entero
	Escribir "Introduce tu edad";
	Leer edad;
	
	Si (edad >= 18) y (edad < 67) Entonces
		Escribir "Eres mayor de edad";
	SiNo
		Si edad < 18 Entonces
			Escribir "Eres menor de edad";
		SiNo
			Escribir "Estas jubilado";
		Fin Si;
	Fin Si;
FinAlgoritmo
