# ProyectohechoconchatGPT
# Bubble Sort Optimizado

## Descripción
Se implementó el algoritmo Bubble Sort optimizado utilizando una marca que guarda el índice del último intercambio realizado en conjunto con CHATGPT.
Esta mejora reduce el número de comparaciones y pasadas necesarias cuando parte del arreglo ya se encuentra ordenada.

## Optimización aplicada
El algoritmo registra la última posición donde ocurrió un intercambio y limita las siguientes iteraciones únicamente hasta ese punto.

## Escenarios probados
* Arreglo aleatorio
* Arreglo ordenado creciente
* Arreglo ordenado decreciente

## Tamaños evaluados
100, 500, 1000, 3000 y 5000 elementos.

## Resultados
Se midió el tiempo de ejecución usando el comando `System.nanoTime()` y se generó una gráfica comparativa exportada en PDF.
## Uso de ChatGPT
Se utilizó a ChatGPT como apoyo para:

* Implementación en Java
* Optimización del Bubble Sort
* Generación del código de pruebas
