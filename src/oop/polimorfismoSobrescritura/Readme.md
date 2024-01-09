# Mini-Proyecto: Explorando el Polimorfismo de Sobrescritura en Java

## Descripción

Este mini-proyecto tiene como objetivo proporcionar un ejemplo práctico para entender el concepto de polimorfismo de sobrescritura en el contexto de la programación orientada a objetos (POO) en Java.

El polimorfismo de sobrescritura permite que una subclase proporcione una implementación específica de un método que ya está definido en su clase base (superclase). Esto significa que al trabajar con una instancia de la subclase, el método de la subclase será llamado en lugar del método de la superclase.

En este caso, hemos utilizado las clases `Vehiculo` y `Automovil` como ejemplos. La clase `Automovil` hereda de la clase `Vehiculo` y sobrescribe el método `acelerar` para proporcionar una implementación específica para los automóviles.

## Ejemplo

```java
// Clase base (superclase)
class Vehiculo {
    // Método de la superclase
    public void acelerar() {
        System.out.println("Acelerando un vehículo");
    }
}

// Subclase que hereda de Vehiculo
class Automovil extends Vehiculo {
    // Sobrescritura del método acelerar en la subclase
    @Override
    public void acelerar() {
        System.out.println("Acelerando un automóvil");
    }

    // Nuevo método específico de Automovil
    public void abrirPuertas() {
        System.out.println("Abriendo puertas del automóvil");
    }
}

public class PolimorfismoSobrescrituraEjemplo {
    public static void main(String[] args) {
        // Crear instancias de las clases
        Vehiculo miVehiculo = new Vehiculo();
        Vehiculo miAutomovil = new Automovil();  // Polimorfismo

        // Llamadas al método acelerar
        miVehiculo.acelerar();     // Llamada al método de la superclase
        miAutomovil.acelerar();    // Llamada al método sobrescrito en Automovil

        // Intentar llamar al método abrirPuertas generará un error de compilación
        // miAutomovil.abrirPuertas();  // Esto no es posible porque el tipo está declarado como Vehiculo
    }
}
```

## Instrucciones

1. Clona este repositorio:

   ```bash
   git clone https://github.com/Irina-Ichim/Explorando-Java.git
   ```

2. Abre el proyecto en tu entorno de desarrollo Java preferido.

3. Examina el código en `PolimorfismoSobrescrituraEjemplo.java` y comprende cómo se implementa el polimorfismo de sobrescritura.

4. Ejecuta el programa y observa los resultados de las llamadas al método `acelerar`.

## Nota Importante

Intentar llamar al método `abrirPuertas` sobre la referencia `Vehiculo` generará un error de compilación, ya que el tipo de la referencia determina los métodos que se pueden llamar.
