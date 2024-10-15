Algoritmo saludar
	Definir nombre Como Caracter
	definir opcionn Como Entero
	Repetir
		Escribir "**MENU**"
		Escribir "0. Despedir"
		Escribir "1. Saludar"
		Escribir "2. Introducir nombre"
		Leer opcionn
		
		Segun opcionn Hacer
			0:
				Si nombre <> null Entonces
					Escribir "Hasta luego " nombre
					opcionn <-4
				SiNo
					Escribir "No conozco tu nombre, introducelo" 
					leer nombre
					
				Fin Si
			1:	
				Si nombre <> null Entonces
					Escribir "Hola, " nombre
				SiNo
					Escribir "No conozco tu nombre, Introduce tu nombre"
					leer nombre
				Fin Si
			2:
				Escribir "Introduce tu nombre"
				Leer nombre
			De Otro Modo:
				Escribir "Introduce una opcion valida"
		Fin Segun
	Hasta Que opcionn == 4
FinAlgoritmo
