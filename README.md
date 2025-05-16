"# programacionII-controlStock" 

Sistema de Stock en Estantería - Modelo con Array 3D

Este ejemplo muestra cómo modelar un sistema de stock de productos en un depósito utilizando un
array tridimensional en Java. Se representan pasillos, estantes y posiciones como las tres
dimensiones del array.

Modelo Visual del Depósito (2 pasillos, 3 estantes, 4 posiciones):

Pasillo 0:
Estante 0: [X] [ ] [ ] [ ]
Estante 1: [ ] [ ] [ ] [ ]
Estante 2: [ ] [ ] [ ] [ ]
Pasillo 1:
Estante 0: [ ] [ ] [ ] [ ]
Estante 1: [ ] [ ] [ ] [ ]
Estante 2: [ ] [ ] [ ] [ ]
(X = producto cargado)
Estructura del Array:
String[][][] deposito = new String[pasillos][estantes][posiciones];
Funciones del Sistema:
- Cargar producto: ingresa un nombre en una ubicación específica
- Consultar producto: muestra lo que hay en una celda
- Mostrar depósito: imprime todos los pasillos con su contenido
Lógica en Java (resumen):
1. Se define el array 3D con tamaño fijo
2. El usuario navega por un menú en consola
3. Se valida la posición antes de cargar o consultar
4. Se usa for anidados para recorrer pasillos, estantes y posiciones
