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
        <h2>Editar libros</h2>
        <%
            try {
                //COnectar a la base de datos
                String url = "jdbc:mysql://localhost:3306/libreria";
                Connection con = DriverManager.getConnection(url, "root" , "password");

                String nombre = request.getParameter("nombre");
                String apellido = request.getParameter("apellido");
                String edad = request.getParameter("edad");
                String telefono = request.getParameter("telefono");
                int codlec = Integer.parseInt(request.getParameter("codlec"));

                String sql = "UPDATE LECTOR SET nombre = ?, apellido = ?, edad = ?, telefono = ? WHERE codlec = ?";
                try {
                    PreparedStatement pstmt = con.prepareStatement(sql);
                    pstmt.setString(1, nombre);
                    pstmt.setString(2, apellido);
                    pstmt.setString(3, edad);
                    pstmt.setString(4, telefono);
                    pstmt.setInt(5, codlec);

                    int rows = pstmt.executeUpdate();
                    if(rows > 0) {
                        out.print("<p>Lector actualizado correctamente</p>");
                    }
                } catch(Exception e) {
                    out.print(e.getMessage());
                }
                

            } catch(Exception sqle) {
                out.print(sqle.getMessage());
            }
        %>
        <a href="lectores.jsp">
            <button class="btn btn-info" >Inicio</button>
        </a>
    </body>
</html>