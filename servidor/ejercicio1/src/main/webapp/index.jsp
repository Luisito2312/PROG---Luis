<!DOCTYPE html>
<html lang="es">
    <head>
        <meta charset="utf-8" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    </head>
    <body>
        <h1>Texto a mostrar:</h1>
        <form action="salida.jsp" method="get">
            <label for="texto">Texto:</label><br>
            <input type="text" id="texto" name="texto" required/><br><br>
            <label for="tamano">Tamano de la letra:</label><br>
            <input type="text" id="tamano" name="tamano" value="12" required/><br><br>
            <label for="colorF">Color de fuente:</label><br>
            <input type="color" id="colorF" name="colorF" value="black" required><br><br>
            <label for="colorB">Color de fondo:</label><br>
            <input type="color" id="colorB" name="colorB" value="#ffecb8" required><br><br>
            <label for="opciones">Elige el tipo de letra:</label>
            <select id="opciones" name="opciones">
                <option value="Arial">Arial</option>
                <option value="Times new Roman">TImes new Roman</option>
                <option value="Calibri">Calibri</option>
                <option value="Courier">Courier</option>
                
            </select><br>
            <label for="repe">Numero de repeticiones: </label><br>
            <input type="text" id="repe" name="repe" value="1" maxlength="20" required/><br><br>

            <input type="submit" value="Enviar">
            <input type="reset" value="Borrar">
           
        </form>
    </body>
</html>