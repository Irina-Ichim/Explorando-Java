# Herencia en Java

La herencia es uno de los conceptos fundamentales en la programación orientada a objetos (OOP). En Java, la herencia permite la creación de nuevas clases basadas en clases existentes, promoviendo la reutilización de código y la creación de relaciones entre las clases.

## Tipos de Clases

Existen dos tipos principales de clases en el contexto de la herencia:

1. **Clase Padre (Superclase):** Es la clase original de la que se heredan atributos y métodos. Puede contener comportamientos comunes y atributos compartidos por las clases derivadas.

2. **Clase Hija (Subclase):** Es la nueva clase creada que hereda de la clase padre. Puede extender o modificar la funcionalidad de la clase padre y también puede agregar nuevos atributos y métodos.

## Jerarquía de Clases

Toda jerarquía de clases en Java tiene en la cúspide la clase implícita `Object` de la API de Java. Esto significa que todas las clases heredan directa o indirectamente de `Object`, proporcionando métodos comunes que pueden ser utilizados por cualquier objeto.

## Tipos de Herencia

En Java, existen diferentes tipos de herencia:

1. **Herencia Simple:** Una clase puede heredar de una única clase padre.

2. **Herencia Múltiple (a través de Interfaces):** Una clase puede implementar múltiples interfaces, permitiendo la herencia de comportamientos de varias fuentes.

## Propiedades de la Herencia

1. **Reutilización de Código:** Permite utilizar y extender el código existente.

2. **Polimorfismo:** Permite tratar objetos de diferentes clases de manera uniforme.

3. **Organización y Abstracción:** Facilita la organización del código y la creación de jerarquías que representan relaciones del mundo real.

## Implementación de la Herencia en Java

En Java, la herencia se implementa utilizando la palabra clave `extends`. Ejemplo:

```java
public class Animal {
    // Atributo y métodos de la clase Animal
}

public class Perro extends Animal {
    // Atributos y métodos específicos para la clase Perro
}
```

## Uso de la Palabra Reservada `super`

La palabra reservada `super` se utiliza para acceder a los miembros de la clase padre desde la clase hija. Puede utilizarse para llamar al constructor de la clase padre, acceder a sus métodos o referirse a sus atributos.

```java
public class Perro extends Animal {
    private String raza;

    public Perro(String nombre, String raza) {
        super(nombre);  // Llamada al constructor de la clase padre
        this.raza = raza;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + super.nombre + ", Raza: " + raza);
    }
}
```

### Con el uso de `super`, se establece una conexión entre la clase padre y la clase hija, permitiendo una implementación más flexible y organizada.

