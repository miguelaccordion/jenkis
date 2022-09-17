#!/bin/bash
echo "Bienvenidos al planeta $planeta"
if [ "$agente" = "true" ]
then
      echo "Preparese para la misión agente X, que la fuerza lo acompañe"
else
      echo "Disfrute el planeta humano $nombre, trata de no morir."
fi
echo "..."
sleep 10
echo "Suerte! La necesitarás."
