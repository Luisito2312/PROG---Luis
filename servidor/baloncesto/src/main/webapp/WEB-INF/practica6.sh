#!/bin/bash

function generar_logins() {
    if [[ ! -f usuarios.txt ]]; then
        echo "El archivo usuarios.txt no existe."
        return
    fi

    > loginServ.txt
    while IFS=':' read -r nombre apellido1 apellido2 dni; do
        login="${nombre:0:1}${apellido1:0:3}${apellido2:0:3}${dni: -4}"
        echo "${login,,}" >> loginServ.txt
    done < usuarios.txt

    echo "Logins generados y guardados en loginServ.txt"
}

function comprobar_red() {
    read -p "Introduzca una IP: " ip_base
    read -p "Introduzca una cantidad: " cantidad

    IFS='.' read -r o1 o2 o3 o4 <<< "$ip_base"

    for ((i=0; i < cantidad; i++)); do
        nueva_ip="${o1}.${o2}.${o3}.$((o4 + i))"
        ping -c 1 -W 1 $nueva_ip &> /dev/null
        if [[ $? -eq 0 ]]; then
            echo "$nueva_ip está activa"
        else
            echo "$nueva_ip no está activa"
        fi
    done
}

while true; do
    clear
    echo "MENU"
    echo "1 - Generar login de usuarios"
    echo "2 - Comprobación de red"
    echo "0 - Salir"
    read -p "Elija su opción: " opcion

    case $opcion in
        1)
            generar_logins
            read -p "Presione Enter para continuar..."
            ;;
        2)
            comprobar_red
            read -p "Presione Enter para continuar..."
            ;;
        0)
            echo "Saliendo..."
            exit 0
            ;;
        *)
            echo "Opción inválida. Intente nuevamente..."
            sleep 2
            ;;
    esac
done

