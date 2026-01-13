<!DOCTYPE html>
<html lang="es">
    <head>
        <meta charset="utf-8" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    </head>
    <body>
        <h2>Dibujar una piramide</h2>
        <h5>Introduce la altura</h5>

        <form action="piramide2.jsp" method="get">
            <label for="altura">Altura:</label><br>
            <input type="text" id="altura" name="altura" /><br>
            <label for="caracter">Caracter:</label><br>
            <input type="text" id="caracter" name="caracter" maxlength="1" size="1"/><br>
    
            <div>
                <input type="color" id="color" name="color">
            </div>

            <input type="submit" value="Submit">
            <input type="reset" value="Borrar">
           
        </form>

        
    </body>
</html>