<!DOCTYPE html>
<html lang="es">
    <head>
        <meta charset="utf-8" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    </head>
    <body>
        <h1>Prueba de formulario y envio de datos</h1>
        <form>
                <label for="nombre">Nombre:</label><br>
                <input type="text" id="nombre" name="nombre" /><br>
                <label for="edad">Edad:</label><br>
                <input type="text" id="edad" name="edad" /><br><br>
                <input type="submit" value="Submit">
                <input type="reset" value="Borrar">
            </form> 
            

            <h1>Informacion personal</h1>
            
            <% 
                String nombre = request.getParameter("nombre");
                String edad = request.getParameter("edad");

                if((edad !=null ) && (nombre !=null)) {
                    out.println("<p>Tu informacion personal: <p>");
                    out.println("Su nombre es " + nombre + " y su edad es: " + edad);
                } else {
                    out.println("Introduce tus datos");
                }
                
            %>
    </body>
</html>