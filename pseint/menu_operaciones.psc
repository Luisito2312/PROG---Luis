Algoritmo menu_operaciones
	Definir opcion1, resultado Como Real
	Escribir "Introduce un numero: "
	Leer num
	EScribir "Introduce otro numero: "
	Leer num2
	Repetir
		Escribir "1.Suma"
		Escribir "2.Resta"
		Escribir "3.Producto"
		Escribir "4.Division"
		Escribir "5. Cambiar de valores"
		Escribir "6. Salir"
		Escribir "Que operacion quieres realizar"
		Leer opcion1
		
		Segun opcion1 Hacer
			1:
				resultado<-num + num2
				Escribir "Resultado: " resultado;
			2:
				resultado<-num - num2
				Escribir "Resultado: " resultado;
			3:
				resultado<-num * num2
				Escribir "Resultado: " resultado;
			4:
				resultado<-num / num2
				Escribir "Resultado: " resultado;
			5:
				Escribir "Introduce un numero: "
				Leer num
				EScribir "Introduce otro numero: "
				Leer num2
			6:
				Escribir "Hasta Luego"
			De Otro Modo:
				Escribir "Introduce una opción válida"
		Fin Segun
	Hasta Que opcion1 = 6

FinAlgoritmo
