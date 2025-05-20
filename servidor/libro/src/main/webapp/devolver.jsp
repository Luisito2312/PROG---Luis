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
        <h2>Hello World!!</h2>
        <h5>Luis Godino Wallace</h5>

        <%
        try {

            String url = "jdbc:mysql://localhost:3306/libreria";
            Connection con = DriverManager.getConnection(url, "root", "password");

            int codlib = Integer.parseInt(request.getParameter("codlib"));
            String sql = "";
            


        } catch(SQLException e) {
            out.print(e.getMessage());
        }
        

        %>
    </body>
</html>