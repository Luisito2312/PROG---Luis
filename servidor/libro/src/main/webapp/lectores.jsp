<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html lang="es">
    <head>
        <meta charset="utf-8" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"/>
    </head>
    <body class="p-4">
        <h2>Gestion de lectores</h2>

        <div class="d-flex flex-row">
            <a class="btn btn-primary" href="index.jsp">Libros</a>
            <a class="btn btn-secondary" href="nuevoLector.jsp">Nuevo lector</a>
        </div>

        <table class="table">
            <thead>
                <tr>
                    <th>Nombre</th>
                    <th>Apellido</th>
                    <th>Edad</th>
                    <th>Telefono</th>
                    <th></th>
                    <th></th>
                </tr>
            </thead>

        <%  
            try {

                String url = "jdbc:mysql://localhost:3306/libreria";
                Connection con = DriverManager.getConnection(url, "root" , "password");

                Statement stmn = con.createStatement();
                ResultSet resultado = stmn.executeQuery("SELECT codlec, nombre, apellido, edad, telefono FROM LECTOR");

                while(resultado.next()) { %>
                    <tbody>
                        <tr>
                            <td><%= resultado.getString("nombre")%></td>
                            <td><%= resultado.getString("apellido")%></td>
                            <td><%= resultado.getString("edad")%></td>
                            <td><%= resultado.getString("telefono")%></td>
                            <td>
                                <a href="editarLector.jsp?codlec=<%= resultado.getInt("codlec") %>">
                                    <button class="btn btn-dark" >Editar lector</button>
                                </a>
                            </td>
                            <td>
                                <a href="bloquearLector.jsp?codlec=<%= resultado.getInt("codlec") %>">
                                    <button class="btn btn-success" >Des/bloquear</button>
                                </a>
                            </td>
                            

                        </tr>
                    </tbody>
                <%}

            }catch(SQLException e){
                out.print("ERROR: " + e.getMessage());
            }
        %>

    </body>
</html>