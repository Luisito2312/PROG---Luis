
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
        <a class="btn btn-warning" href="nuevo.jsp">Añadir libro</a>
    </div>

    

    <%
        try{

            //COnectar a la base de datos
            String url = "jdbc:mysql://localhost:3306/libreria";
            Connection con = DriverManager.getConnection(url, "root" , "password");

            //Creamos la consulta
            Statement stmn = con.createStatement();
            ResultSet resultado = stmn.executeQuery("SELECT codlib, titulo, autor FROM libro");

            while(resultado.next()) {
            %>
                <div class="row mb-2">
                    <div class="col-3"><%= resultado.getString("titulo")%></div>
                    <div class="col-2"><%= resultado.getString("autor")%></div>
                    <div class="col-3">
                        <a href="editar.jsp?codlib=<%= resultado.getInt("codlib") %>">
                            <button class="btn btn-info" >Editar libro</button>
                        </a>
                        <a href="eliminar.jsp?codlib=<%= resultado.getInt("codlib") %>">
                            <button class="btn btn-danger">Eliminar libro</button><br><br>
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
