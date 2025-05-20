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
        <h2>Devolucion de libro</h2>
        <%
        try {

            String url = "jdbc:mysql://localhost:3306/libreria";
            Connection con = DriverManager.getConnection(url, "root", "password");

            int codlib = Integer.parseInt(request.getParameter("codlib"));
            String sql = "UPDATE usuario_libro SET fecha_fin = CURDATE() WHERE codlib = ?";

            try {
                PreparedStatement pstmt = con.prepareStatement(sql);
                pstmt.setInt(1, codlib);
                
                int rows = pstmt.executeUpdate();

                if(rows > 0) {
                    out.print("El libro ha sido devuelto satisfactoriamente");
                } else {
                    out.print("Ha ocurrido un error a la hora de devolver el libro");
                }

            } catch(SQLException e) {
                out.print("El libro no ha podido devolverse");
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