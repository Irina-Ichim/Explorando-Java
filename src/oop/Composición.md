# Composición en Java con POO

La **composición** es un principio fundamental en programación orientada a objetos (POO) que permite construir objetos complejos combinando otros objetos más simples. En lugar de utilizar la herencia para compartir propiedades y comportamientos, la composición implica tener un objeto dentro de otro y utilizarlo para lograr ciertas funcionalidades.

## Ejemplo en Java

Supongamos que tenemos dos clases, `Motor` y `Coche`. En lugar de heredar de una clase a otra, aplicamos la composición al incluir un objeto `Motor` dentro de la clase `Coche`.

```java
// Clase Motor
public class Motor {
    private int cilindraje;

    public Motor(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public void encender() {
        System.out.println("El motor se ha encendido.");
    }
}

// Clase Coche que utiliza composición con Motor
public class Coche {
    private Motor motor;
    private String modelo;

    public Coche(String modelo, int cilindraje) {
        this.modelo = modelo;
        this.motor = new Motor(cilindraje); // Composición aquí
    }

    public void arrancar() {
        System.out.println("Arrancando el coche " + modelo);
        motor.encender(); // Usando el objeto Motor
    }
}
