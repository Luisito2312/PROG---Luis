<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html lang="es">
    <head>
        <meta charset="utf-8" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"/>
    </head>
    <body>
        <h2>Prestacion de libros</h2>
        <%
            try {

                String url = "jdbc:mysql://localhost:3306/libreria";
                Connection con = DriverManager.getConnection(url, "root", "password");

                int codUsu = Integer.parseInt(request.getParameter("nomUsu"));
                int codlib = Integer.parseInt(request.getParameter("codlib"));
                int nota = Integer.parseInt(request.getParameter("nota"));

                String sql = "INSERT INTO usuario_libro (codusu, codlib, nota, fecha_inicio) VALUES (?, ?, ?, CURDATE())";

                try {

                    PreparedStatement pstmt = con.prepareStatement(sql);
                    pstmt.setInt(1, codUsu);
                    pstmt.setInt(2, codlib);
                    pstmt.setInt(3, nota);

                    int rows = pstmt.executeUpdate();

                    if(rows > 0) {
                        out.print("Libro prestado satisfactoriamente");
                    } else {
                        out.print("ha ocurrido un error a la hora de prestar el libro");
                    }

                } catch(Exception e) {

                    out.print(e.getMessage());
                }
            } catch(SQLException e) {
                out.print(e.getMessage());
            }
        %>
        <a href="index.jsp">
            <button class="btn btn-info" >Inicio</button>
        </a>
    </body>
</html>