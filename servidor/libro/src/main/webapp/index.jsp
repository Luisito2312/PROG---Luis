<%@ page import="java.util.*, java.sql.*" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<html>
<head>
    <title>Gestión de Libros</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"/>
    <style>
        .btn-editar { background-color: #007bff; color: white; }
        .btn-borrar { background-color: #dc3545; color: white; }
    </style>
</head>
<body class="p-4">
    <div class="container">
        <h2>Gestión de Libros</h2>
        <button class="btn btn-primary mb-3">Añadir Libro</button>

        <%
            // Conexión a la base de datos
            Connection conn = null;
            Statement stmt = null;
            ResultSet rs = null;

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/libreria", "usuario", "password");
                stmt = conn.createStatement();
                rs = stmt.executeQuery("SELECT titulo, autor FROM libro");
        %>

        <div class="row">
            <div class="col-md-4 font-weight-bold">Título</div>
            <div class="col-md-4 font-weight-bold">Autor</div>
            <div class="col-md-4 font-weight-bold">Acciones</div>
        </div>

        <%
                while (rs.next()) {
                    String titulo = rs.getString("titulo");
                    String autor = rs.getString("autor");
        %>
        <div class="row mb-2">
            <div class="col-md-4"><%= titulo %></div>
            <div class="col-md-4"><%= autor %></div>
            <div class="col-md-4">
                <button class="btn btn-editar btn-sm">Editar</button>
                <button class="btn btn-borrar btn-sm">Borrar</button>
            </div>
        </div>
        <%
                }
            } catch (Exception e) {
                out.println("<p>Error al obtener los libros: " + e.getMessage() + "</p>");
            } finally {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            }
        %>
    </div>
</body>
</html>
