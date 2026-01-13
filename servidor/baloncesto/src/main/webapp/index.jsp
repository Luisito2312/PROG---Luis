<!DOCTYPE html>
<html lang="es">
    <head>
        <meta charset="utf-8" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>

        <style>
            table, th, td {
            border:2px solid black;
            }
        </style>
    </head>
    <body>
        <h1>Practicas con JSP</h1>
        <h5>Luis Godino Wallace</h5>
        
        
            
                
                Hola, me llamo <b>Luis</b> y estoy intentando aprobar el curso <br><br>
                Fila<table><tr>
                <%
                for (int i = 1; i < 6; i++) {
                    out.print("<td>" + i + "</td>");
                };
                %>
                </tr></table><br>
                
                Columna<br><table>
                <%
                for (int i = 1; i < 6; i++) {
                    out.print("<tr><td>" + i + "</td></tr>");
                };
                %>
                </table><br>

                Cuadricula 5x5<table><tr>
                <%
                int cont = 1;
                for(int j = 0; j < 5; j++) {
                    out.println("<tr>");
                    
                    for (int i = 1; i < 6; i++) {
                        out.print("<td>" + cont + "</td>");
                        cont++;
                    };
                    
                    out.println("</tr>");
                }
                %>
                </table><br>
                <form action="ejemplo.jsp">
                    <input 
                    type="submit" value="Siguiente pagina">
                </form>
                
        
    </body>

</html>