# ProyectoInstrumentosMusicales

Este proyecto ejemplifica el uso de interfaces en Java mediante la representación de instrumentos musicales.

## 🎶 InstrumentoMusical Interface

La interfaz `InstrumentoMusical` define un conjunto de métodos que cualquier instrumento musical debe implementar. Aquí están los métodos:

- `getNombre()`: Retorna el nombre del instrumento.
- `producirSonido()`: Retorna el sonido producido por el instrumento.

## 🎷 InstrumentoDeViento Class

La clase `InstrumentoDeViento` implementa la interfaz `InstrumentoMusical` y representa un instrumento de viento, como un saxofón. Aquí están los métodos implementados:

- `getNombre()`: Retorna el nombre del instrumento de viento.
- `producirSonido()`: Retorna el sonido producido al soplar a través del instrumento de viento.

## 🚀 Ejemplo de Uso

```java
// Crear un instrumento de viento
InstrumentoDeViento saxofon = new InstrumentoDeViento("saxofón");

// Utilizar métodos de la interfaz InstrumentoMusical
System.out.println("Nombre del instrumento: " + saxofon.getNombre());
System.out.println("Sonido producido: " + saxofon.producirSonido());
