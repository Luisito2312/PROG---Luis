<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta charset="UTF-8">
    <title>Partida ROL</title>
    <style>
        table {
            width: 100%;
            border-collapse: collapse;
            text-align: center;
        }
        td, th {
            border: 1px solid black;
            vertical-align: top;
            padding: 10px;
        }
        img.personaje {
            width: 100px;
            height: auto;
            border-radius: 10px;
        }
        img.npc {
            width: 50px;
            height: 50px;
            border-radius: 50%;
        }
        .hearts {
            font-size: 20px;
            color: red;
        }
        button {
            margin: 5px;
            padding: 8px 12px;
            border-radius: 5px;
            cursor: pointer;
            font-family: 'IM Fell English', serif;
            transition: background 0.3s;
            display: inline-block;
        }
        button:hover {
            background-color: #555;
        }
        .button-container {
            display: flex;
            justify-content: space-evenly;
            gap: 10px;
        }
    </style>
    <!-- Añadir en el <head> -->
    <link href="https://fonts.googleapis.com/css2?family=IM+Fell+English&display=swap" rel="stylesheet">

    <style>
        body {
            background-color: #1b1b1b;
            color: #ddd;
            font-family: 'IM Fell English', serif;
            text-align: center;
            margin: 0;
            padding: 20px;
        }

        h1 {
            font-size: 3em;
            margin-bottom: 20px;
            text-shadow: 2px 2px 5px black;
        }

        table {
            width: 100%;
            border-collapse: collapse;
        }

        th, td {
            padding: 20px;
            vertical-align: top;
        }

        .personaje {
            width: 150px;
            height: 150px;
            border-radius: 10px;
            border: 2px solid #666;
            box-shadow: 0 0 10px rgba(0, 255, 255, 0.5);
        }

        .npc {
            width: 80px;
            height: 80px;
            border-radius: 50%;
            border: 2px dashed #999;
            margin-top: 10px;
        }

        button {
            background-color: #333;
            color: #ccc;
            border: 1px solid #555;
            padding: 8px 12px;
            margin: 5px;
            border-radius: 5px;
            cursor: pointer;
            font-family: 'IM Fell English', serif;
            transition: background 0.3s;
            display: inline-block;
        }

        button:hover {
            background-color: #555;
        }

        #corazones {
            font-size: 20px;
            color: crimson;
        }

        .corazones {
            font-size: 20px;
            color: crimson;
        }

        hr {
            border: 1px solid #444;
            margin: 20px 0;
        }
    </style>


    <script>
        let personajeCounter = 0;

        function crearPersonaje() {
            const personajesTable = document.getElementById("personajes");

            const nombre = prompt("Nombre del personaje:");
            if (nombre == null) return;
            const url = prompt("URL de la imagen del personaje:");
            if (url == null) return;

            // Crear cabecera para el nuevo personaje
            const th = document.createElement("th");
            th.id = `personaje_${personajeCounter}`;
           th.innerHTML = `
                <div style="display: flex; align-items: center; gap: 10px;">
                    <img id="img_personaje_${personajeCounter}" src="${url}" class="personaje">
                    <div style="text-align: left;">
                        <strong id="nombre_personaje_${personajeCounter}">${nombre}</strong><br><br>
                        Vida: <progress id="vida_${personajeCounter}" value="100" max="100" style="width: 120px;"></progress>
                        <button onclick="cambiarVida(${personajeCounter}, 10)">+</button>
                        <button onclick="cambiarVida(${personajeCounter}, -10)">–</button><br>

                        Degeneración: <progress id="degen_${personajeCounter}" value="0" max="100" style="width: 120px;"></progress>
                        <button onclick="cambiarDegeneracion(${personajeCounter}, 10)">+</button>
                        <button onclick="cambiarDegeneracion(${personajeCounter}, -10)">–</button>
                    </div>
                </div>
                <br>
                <div class="button-container">
                    <button onclick="editarPersonaje(${personajeCounter})">Editar Personaje</button>
                    <button onclick="agregarNpc('${personajeCounter}')">Agregar NPC</button>
                    <button onclick="eliminarPersonaje(${personajeCounter})">Eliminar Personaje</button>
                </div>
            `;
            personajesTable.rows[0].appendChild(th);

            // Crear celda debajo para los NPCs
            const td = document.createElement("td");
            td.id = `npcs_personaje_${personajeCounter}`;
            personajesTable.rows[1].appendChild(td);

            personajeCounter++;
        }

        function eliminarPersonaje(id) {
            const confirmar = confirm("¿Seguro que quieres eliminar este personaje y todos sus NPCs?");
            if (confirmar) {
                // Eliminar el personaje principal (columna de arriba)
                const personaje = document.getElementById(`personaje_${id}`);
                personaje.remove();

                // Eliminar todos los NPCs debajo (columna de abajo)
                const npcs = document.getElementById(`npcs_personaje_${id}`);
                npcs.remove();
            }
        }

        function editarPersonaje(id) {
            const nombre = prompt("Nuevo nombre del personaje:");
            if (nombre != null) {
                document.getElementById(`nombre_personaje_${id}`).innerText = nombre;
            }

            const url = prompt("Nueva URL de la imagen:");
            if (url != null) {
                document.getElementById(`img_personaje_${id}`).src = url;
            }

            const vida = prompt("Nueva vida (0-100):");
            if (vida !== null && !isNaN(vida)) {
                document.getElementById(`vida_${id}`).value = Math.max(0, Math.min(100, parseInt(vida)));
            }

            const degen = prompt("Nueva degeneración (0-100):");
            if (degen !== null && !isNaN(degen)) {
                document.getElementById(`degen_${id}`).value = Math.max(0, Math.min(100, parseInt(degen)));
            }
        }

        function agregarNpc(personajeId) {
            const container = document.getElementById("npcs_personaje_" + personajeId);

            const npcId = personajeId + "_npc_" + container.children.length;

            const nombre = prompt("Nombre del NPC:");
            if (nombre == null) return;
            const url = prompt("URL de la imagen del NPC:");
            if (url == null) return;

            const div = document.createElement("div");
            div.id = "div_" + npcId;
            div.innerHTML = `
                <img id="img_${npcId}" src="${url}" class="npc"><br>
                <span id="nombre_${npcId}">${nombre}</span><br><br>
                <div class="button-container">
                    <button onclick="editarNpc('${npcId}')">Editar NPC</button>
                    <button onclick="incrementar('${npcId}')">+</button>
                    <button onclick="decrementar('${npcId}')">-</button>
                    <button onclick="eliminarNpc('div_${npcId}')">Eliminar NPC</button>
                </div>
                <span id="contador_${npcId}">0</span><br>
                <div id="corazones_${npcId}" class="hearts"></div>
                <hr/>
            `;
            container.appendChild(div);
        }

        function editarNpc(npcId) {
            const nombre = prompt("Nuevo nombre del NPC:");
            if (nombre != null) {
                document.getElementById(`nombre_${npcId}`).innerText = nombre;
            }
            const url = prompt("Nueva URL de la imagen del NPC:");
            if (url != null) {
                document.getElementById(`img_${npcId}`).src = url;
            }
        }

        function incrementar(id) {
            const span = document.getElementById("contador_" + id);
            span.innerText = parseInt(span.innerText) + 1;
            actualizarCorazones(id);
        }

        function decrementar(id) {
            const span = document.getElementById("contador_" + id);
            if (parseInt(span.innerText) > 0) {
                span.innerText = parseInt(span.innerText) - 1;
                actualizarCorazones(id);
            }
        }

        function actualizarCorazones(id) {
            const numero = parseInt(document.getElementById("contador_" + id).innerText);
            let corazones = "";
            for (let i = 0; i < numero; i++) {
                corazones += "&#10084;&#65039;";
            }
            document.getElementById("corazones_" + id).innerHTML = corazones;
        }

        function eliminarNpc(divId) {
            const div = document.getElementById(divId);
            div.remove();
        }

        function cambiarVida(id, delta) {
            const barra = document.getElementById(`vida_${id}`);
            let nuevaVida = parseInt(barra.value) + delta;
            nuevaVida = Math.max(0, Math.min(100, nuevaVida));
            barra.value = nuevaVida;
        }

        function cambiarDegeneracion(id, delta) {
            const barra = document.getElementById(`degen_${id}`);
            let nuevaDeg = parseInt(barra.value) + delta;
            nuevaDeg = Math.max(0, Math.min(100, nuevaDeg));
            barra.value = nuevaDeg;
        }
    </script>
</head>

<body>

<h1>Harem - Campaña de DnD</h1>

<button onclick="crearPersonaje()">Añadir Personaje</button>

<br><br>

<table id="personajes">
    <tr>
        <!-- Aquí irán los personajes principales -->
    </tr>
    <tr>
        <!-- Aquí irán los NPCs relacionados -->
    </tr>
</table>

</body>
</html>
