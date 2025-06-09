<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html lang="es">
    <head>
        <meta charset="utf-8" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    </head>
    <body>
        <h2>Bloquear lector</h2>
        
        <%

        try{

            String url = "jdbc:mysql://localhost:3306/libreria";
            Connection con = DriverManager.getConnection(url, "root", "password");

            int codlec = Integer.parseInt(request.getParameter("codlec"));
            int bloqueado = Integer.parseInt(request.getParameter("bloqueado"));
            String sql = "UPDATE LECTOR SET bloqueado = ? WHERE codlec = ?";

            if(bloqueado == 1) {
                    bloqueado = 0;
                } else {
                    bloqueado = 1;
                }

            try {

                PreparedStatement pstmt = con.prepareStatement(sql);
                pstmt.setInt(1, bloqueado);
                pstmt.setInt(2, codlec);

            } catch(SQLException e) {
                out.print("ERROR: " + e.getMessage());
            }

        }catch(SQLException e) {
            out.print("ERROR: " + e.getMessage());
        }
        %>

        
    </body>
</html>