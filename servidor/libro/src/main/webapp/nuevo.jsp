<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="utf-8" />
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"/>
    <title>Gestión de libros</title>
</head>
<body class="p-4">
    <h2>Gestion de libros</h2>
    <form action="info.jsp" method="post">

        <div class="form-group row">
            <label for="titulo" class="col-sm-2 col-form-label"><strong>Titulo:</strong></label>
            <div class="col-sm-10">
                <input id="titulo" name="titulo" type="text" class="form-control">
            </div>
        </div>

        <div class="form-group row">
            <label for="autor" class="col-sm-2 col-form-label"><strong>Autor:</strong></label>
            <div class="col-sm-10">
                <input id="autor" name="autor" type="text" class="form-control">
            </div>
        </div>

        <div class="form-group row">
            <label for="argumento" class="col-sm-2 col-form-label"><strong>Argumento:</strong></label>
            <div class="col-sm-10">
                <input id="argumento" name="argumento" type="text" class="form-control">
            </div>
        </div>

        <div class="form-group row">
            <label for="portada" class="col-sm-2 col-form-label"><strong>Portada:</strong></label>
            <div class="col-sm-10">
                <input id="portada" name="portada" type="text" class="form-control">
            </div>
        </div>

        <button type="submit" class="btn btn-primary">Enviar</button>
    </form>
</body>
</html>
