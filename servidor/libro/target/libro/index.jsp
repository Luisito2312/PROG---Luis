<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.SQLException" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8" />
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <title>Test de Conexion</title>
</head>
<body>
    <%
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Requiere el .jar del conector
            conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/libreria",
                "usuario",
                "password"
            );
            out.println("<p>Conexion exitosa a la base de datos.</p>");
        } catch (SQLException e) {
            out.println("<p>Error de conexión: " + e.getMessage() + "</p>");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            out.println("<p>Driver JDBC no encontrado.</p>");
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    // Silenciar error
                }
            }
        }
    %>
</body>
</html>