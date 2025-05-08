<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html lang="es">
    <head>
        <meta charset="utf-8" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"/>
    </head>
    <body>
        <h2>Gestion de libros</h2>

        <%
        // recuperamos la información del formulario
        String isbn = request.getParameter("isbn");
        String titulo = request.getParameter("titulo");
        String autor = request.getParameter("autor");
        String paginas = request.getParameter("paginas");
        String argumento = request.getParameter("argumento");



        try {

            String url = "jdbc:mysql://localhost:3306/libreria";
            Connection con = DriverManager.getConnection(url, "root", "password");

            // insertamos la información
            String sql = "INSERT INTO libro(isbn, titulo, autor, paginas, argumento) VALUES (?, ?, ?, ?, ?);";


        } catch(SQLException sqle) {
            out.print(sqle.getMessage());
        }
        %>

    </body>
</html>