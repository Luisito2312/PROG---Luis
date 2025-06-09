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
        <h2>Informacion del libro</h2>
        
        <%
            int codlib = Integer.parseInt(request.getParameter("codlib"));

            try {
                String url = "jdbc:mysql://localhost:3306/libreria";
                Connection con = DriverManager.getConnection(url, "root", "password");

                String sql = "SELECT titulo, autor, argumento, portada FROM LIBRO WHERE codlib = ?";

                PreparedStatement pstmt = con.prepareStatement(sql);
                pstmt.setInt(1, codlib);

                ResultSet resultado = pstmt.executeQuery();

                if(resultado.next()) {

                    %>
                    <div class="row mb-3">
                    <div class="col-2"><%= resultado.getString("titulo")%></div>
                    <div class="col-2"><%= resultado.getString("autor")%></div>
                    </div>

                    <div class="row mb-3">
                    <div class="col-2"><%= resultado.getString("argumento")%></div>
                    <div class="col-2"><img src="<%= resultado.getString("portada")%>"></div>
                    </div>
                    <%

                } 

            } catch(SQLException e){
                out.print("ERROR: " + e.getMessage());
            }
        %>

        <a href="index.jsp">
            <button class="btn btn-info" >Inicio</button>
        </a>

    </body>
</html>