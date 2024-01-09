# Ejercicio de Abstracción en Java

Este repositorio contiene un pequeño ejercicio en Java que demuestra el concepto de abstracción en programación orientada a objetos. La abstracción es un principio fundamental de la OOP que permite representar conceptos complejos de manera simplificada y generalizada.

## Clases y Métodos Abstractos

En este ejercicio, creamos una jerarquía de clases que incluye una clase abstracta llamada `Vehiculo` y dos clases concretas, `Automovil` y `Motocicleta`, que extienden la clase `Vehiculo`. Aquí hay una breve descripción de cada componente:

- **Vehiculo (Clase Abstracta):**
  - Contiene un método abstracto `conducir()` que debe ser implementado por las subclases.
  - Incluye un método concreto `detener()` compartido por todas las subclases.

- **Automovil (Clase Concreta):**
  - Extiende la clase abstracta `Vehiculo`.
  - Implementa el método abstracto `conducir()` específico para un automóvil.
  - Incluye un método adicional `abrirPuertas()` específico para automóviles.

- **Motocicleta (Clase Concreta):**
  - Extiende la clase abstracta `Vehiculo`.
  - Implementa el método abstracto `conducir()` específico para una motocicleta.
  - Incluye un método adicional `hacerCaballito()` específico para motocicletas.

## Uso Práctico

El archivo principal, `AbstraccionEjemplo.java`, demuestra cómo usar estas clases en un contexto práctico. Aquí hay un resumen de las acciones realizadas en el archivo:

1. Se intenta crear una instancia de la clase abstracta `Vehiculo`, lo cual no es posible debido a su naturaleza abstracta.

2. Se crean instancias de las clases concretas `Automovil` y `Motocicleta`.

3. Se realizan llamadas a métodos comunes y específicos de cada tipo de vehículo, demostrando la abstracción en acción.

## Instrucciones de Ejecución

Para ejecutar el código y ver los resultados, puedes seguir estos pasos:

1. Clona este repositorio en tu máquina local: `git clone https://github.com/Irina-Ichim/Explorando-Java.git`.

2. Navega al directorio del proyecto: `cd Explorando-Java`.

3. Compila el archivo principal: `javac AbstraccionEjemplo.java`.

4. Ejecuta el programa: `java AbstraccionEjemplo`.

