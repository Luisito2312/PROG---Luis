<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <%
        String texto = request.getParameter("texto");
        String colorLetra = request.getParameter("colorF");
        String colorFondo = request.getParameter("colorB");
        String tipoLetra = request.getParameter("opciones");
        int tamanoLetra = Integer.parseInt(request.getParameter("tamano"));
        int repeticiones = Integer.parseInt(request.getParameter("repe"));
    %>
</head>
<body style="background-color:<%= colorFondo %>;">
    <p style="color:<%= colorLetra %>; font-size:<%= tamanoLetra %>px; font-family:<%= tipoLetra %>;">

        <%  
            for (int i = 1; i <= repeticiones; i++) {
                out.println(texto);%><br><%
            }
        %>
    </p>
</body>
</html>
