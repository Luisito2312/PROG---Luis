<!DOCTYPE html>
<html lang="es">
    <head>
        <meta charset="utf-8" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>

        <style>
            body {
                background-image: url('$RES40CY.webp');
                background-repeat: no-repeat;
                background-attachment: fixed;
                background-size: cover;
            }

        </style>
    </head>
    <body>
        
        <h1>Dibujo de una piramide</h1><br>

        <%
            
            int altura = Integer.parseInt(request.getParameter("altura"));
            String color = request.getParameter("color");
            char caracter = ' ';

            if (!(request.getParameter("caracter").equals("null"))) {
                caracter = request.getParameter("caracter").charAt(0);
            }

            out.print("<pre style=\"color:" + color + ";\">" );

            for (int i = 1; i <= altura; i++) {
                
                for (int j = 1; j <= altura - i; j++) {
                    out.print(" ");
                }
                
                for (int k = 1; k <= (2 * i - 1); k++) {
                    out.print(caracter);
                }

                out.println("");
            }

        out.print("</pre>");
        %>
    </body>
</html>