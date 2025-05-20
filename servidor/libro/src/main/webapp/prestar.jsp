<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="utf-8" />
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <title>Préstamo de Libro</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"/>
</head>
<body>
    <h2>Préstamo de libro</h2>

    <%
    Connection con = null;
    Statement stmn = null;
    ResultSet resultado = null;

    try {
        String url = "jdbc:mysql://localhost:3306/libreria";
        con = DriverManager.getConnection(url, "root", "password");

        String sql = "SELECT codusu, nombre FROM usuario";
        stmn = con.createStatement();
        resultado = stmn.executeQuery(sql);

        int codLib = Integer.parseInt(request.getParameter("codlib"));
    %>

    <form action="prestar2.jsp" method="post">
        <label for="nomUsu">Seleccione un usuario:</label>
        <select name="nomUsu" id="nomUsu" required>
            <option value="" disabled selected>-- Seleccione --</option>
            <%
                while (resultado.next()) {
                    int codusu = resultado.getInt("codusu");
                    String nombre = resultado.getString("nombre");
            %>
                <option value="<%= codusu %>"><%= nombre %></option>
            <%
                }
            %>
        </select>
        <input type="number" name="nota">Nota a poner</input>
        <input type="hidden" name="codlib" id="codlib" value="<%= codLib %>">
        <br><br>
        <button type="submit">Enviar</button>
    </form>

    <%
    } catch(SQLException e) {
        out.print("Error: " + e.getMessage());
    }
    %>
</body>
</html>
