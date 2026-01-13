<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.sql.*" %>
<html>
<head>
    <title>Gestión de Libros</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"/>
    
</head>
<body class="p-4">
    <h2>Gestion de libros</h2>
    

    <div class="d-flex flex-row">
        <a class="btn btn-primary" href="nuevo.jsp">Añadir libro</a>
        <a class="btn btn-secondary" href="lectores.jsp">Lectores</a>
    </div>

    <%
        try{

            //COnectar a la base de datos
            String url = "jdbc:mysql://localhost:3306/libreria";
            Connection con = DriverManager.getConnection(url, "root" , "password");

            //Creamos la consulta
            Statement stmn = con.createStatement();
            ResultSet resultado = stmn.executeQuery("SELECT codlib, titulo, autor FROM LIBRO");

            while(resultado.next()) {
            %>
                <div class="row mb-3">
                    <div class="col-2"><%= resultado.getString("titulo")%></div>
                    <div class="col-2"><%= resultado.getString("autor")%></div>
                    <div class="col-7">
                        <a href="editar.jsp?codlib=<%= resultado.getInt("codlib") %>">
                            <button class="btn btn-info" >Editar libro</button>
                        </a>
                        <a href="eliminar.jsp?codlib=<%= resultado.getInt("codlib") %>">
                            <button class="btn btn-danger">Eliminar libro</button>
                        </a>
                        <a href="prestar.jsp?codlib=<%= resultado.getInt("codlib") %>">
                            <button class="btn btn-warning" >Prestar libro</button>
                        </a>
                        <a href="devolver.jsp?codlib=<%= resultado.getInt("codlib") %>">
                            <button class="btn btn-dark" >Devolver libro</button>
                        </a>
                        <a href="infoLibro.jsp?codlib=<%= resultado.getInt("codlib") %>">
                            <button class="btn btn-light" >Informacion</button>
                        </a>
                    </div>
                </div>
            <%
            }
            con.close();

        } catch(SQLException sqle) {
            out.print(sqle.getMessage());
        }
    %>


</body>
</html>
