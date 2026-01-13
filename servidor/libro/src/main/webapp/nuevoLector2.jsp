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
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        int edad = Integer.parseInt(request.getParameter("edad"));
        int telefono = Integer.parseInt(request.getParameter("telefono"));

        try {

            String url = "jdbc:mysql://localhost:3306/libreria";
            Connection con = DriverManager.getConnection(url, "root", "password");

            // insertamos la información
            String sql = "INSERT INTO LECTOR( nombre, apellido, edad, telefono) VALUES (?, ?, ?, ?);";
            
            try {
                    PreparedStatement pstmt = con.prepareStatement(sql);
                    pstmt.setString(1, nombre);
                    pstmt.setString(2, apellido);
                    pstmt.setInt(3, edad);
                    pstmt.setInt(4, telefono);
                    

                    int rows = pstmt.executeUpdate();
                    if(rows > 0) {
                        out.print("<p>Lector añadido correctamente</p>");
                    }
                } catch(Exception e) {
                    out.print(e.getMessage());
                }


        } catch(SQLException sqle) {
            out.print(sqle.getMessage());
        }
        %>
        <a href="index.jsp">
            <button class="btn btn-info" >Inicio</button>
        </a>
    </body>
</html>