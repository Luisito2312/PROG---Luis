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

                String isbn = request.getParameter("isbn");
                String titulo = request.getParameter("titulo");
                String autor = request.getParameter("autor");
                String numPag = request.getParameter("numPag");
                int codlib = Integer.parseInt(request.getParameter("codlib"));

                String sql = "UPDATE libro SET isbn = ?, titulo = ?, autor = ?, paginas = ? WHERE codlib = ?";
                try {
                    PreparedStatement pstmt = con.prepareStatement(sql);
                    pstmt.setString(1, isbn);
                    pstmt.setString(2, titulo);
                    pstmt.setString(3, autor);
                    pstmt.setString(4, numPag);
                    pstmt.setInt(5, codlib);

                    int rows = pstmt.executeUpdate();
                    if(rows > 0) {
                        out.print("<p>Libro actualizado correctamente</p>");
                    }
                } catch(Exception e) {
                    out.print(e.getMessage());
                }
                

            } catch(Exception sqle) {
                out.print(sqle.getMessage());
            }
        %>
        <a href="index.jsp">
            <button class="btn btn-info" >Inicio</button>
        </a>
    </body>
</html>