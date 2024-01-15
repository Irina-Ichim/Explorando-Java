# La Interfaz `Comparator` en Java

En Java, la interfaz `Comparator` se utiliza para proporcionar un orden personalizado a las instancias de una clase sin modificar la propia clase. Permite a los desarrolladores definir reglas de comparación específicas.

## Método Abstracto de `Comparator`

La interfaz `Comparator` tiene un único método abstracto llamado `compare`, que debe ser implementado por la clase comparadora.

### Método `compare`

```java
int compare(T o1, T o2);
```

El método `compare` toma dos objetos del mismo tipo (`T`) y devuelve un número negativo si el primer objeto es menor que el segundo, cero si son iguales y un número positivo si el primer objeto es mayor que el segundo.

## Implementación Básica

A continuación, se muestra un ejemplo básico de cómo implementar un comparador para ordenar objetos de una clase llamada `Ejemplo` por el campo `campoOrdenar`:

```java
import java.util.Comparator;

public class ComparadorEjemplo implements Comparator<Ejemplo> {
    @Override
    public int compare(Ejemplo o1, Ejemplo o2) {
        return o1.getCampoOrdenar().compareTo(o2.getCampoOrdenar());
    }
}
```

En este ejemplo, `Ejemplo` es la clase que queremos ordenar, y `campoOrdenar` es el campo por el cual deseamos realizar la comparación.

Para utilizar este comparador:

```java
List<Ejemplo> listaEjemplos = new ArrayList<>();
// Agregar objetos a la lista

ComparadorEjemplo comparador = new ComparadorEjemplo();
Collections.sort(listaEjemplos, comparador);
```

Con esto, la lista de objetos `Ejemplo` se ordenará según la lógica definida en el comparador.

Este enfoque proporciona flexibilidad al permitir la definición de múltiples comparadores para la misma clase sin modificar su código fuente.
