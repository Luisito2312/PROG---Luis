<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="utf-8" />
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"/>
    <title>Gestión de libros</title>
</head>
<body class="p-4">
    <h2>Añadir nuevo lector</h2>
    <form action="nuevoLector2.jsp" method="post">

        <div class="form-group row">
            <label for="nombre" class="col-sm-2 col-form-label"><strong>Nombre:</strong></label>
            <div class="col-sm-10">
                <input id="nombre" name="nombre" type="text" class="form-control">
            </div>
        </div>

        <div class="form-group row">
            <label for="apellido" class="col-sm-2 col-form-label"><strong>Apellido:</strong></label>
            <div class="col-sm-10">
                <input id="apellido" name="apellido" type="text" class="form-control">
            </div>
        </div>

        <div class="form-group row">
            <label for="edad" class="col-sm-2 col-form-label"><strong>Edad:</strong></label>
            <div class="col-sm-10">
                <input id="edad" name="edad" type="number" class="form-control">
            </div>
        </div>

        <div class="form-group row">
            <label for="telefono" class="col-sm-2 col-form-label"><strong>Telefono:</strong></label>
            <div class="col-sm-10">
                <input id="telefono" name="telefono" type="number" class="form-control">
            </div>
        </div>

        <button type="submit" class="btn btn-primary">Enviar</button>
    </form>
</body>
</html>
