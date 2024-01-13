# Interfaz List en Java

La interfaz `List` en Java es parte del framework de colecciones y representa una secuencia ordenada de elementos. A continuación, se explicará la interfaz `List`, sus métodos más usados y algunas de las implementaciones más comunes.

## Interfaz List

La interfaz `List` extiende la interfaz `Collection` y agrega características específicas de las listas, como el acceso por índice y la capacidad de mantener elementos duplicados. Algunas características clave de la interfaz `List` incluyen:

- **Ordenada:** Mantiene el orden de inserción de los elementos.
- **Índices:** Permite acceder a los elementos por su posición (índice).
- **Duplicados:** Puede contener elementos duplicados.

## Métodos Más Usados

Algunos de los métodos más usados de la interfaz `List` incluyen:

- **`add(int índice, E elemento)`:** Agrega un elemento en la posición especificada.
  
  ```java
  List<String> lista = new ArrayList<>();
  lista.add("Manzana");
  lista.add(1, "Banana");
  ```

- **`get(int índice)`:** Devuelve el elemento en la posición especificada.

  ```java
  String elemento = lista.get(1);
  ```

- **`remove(int índice)`:** Elimina el elemento en la posición especificada.

  ```java
  lista.remove(0);
  ```

- **`size()`:** Devuelve el número de elementos en la lista.

  ```java
  int tamaño = lista.size();
  ```

## Implementaciones Comunes

### ArrayList

`ArrayList` es una implementación de la interfaz `List` que utiliza un array dinámico para almacenar elementos. Algunas características de `ArrayList` son:

- **Acceso Rápido:** Permite un acceso rápido a los elementos por índice.
- **Modificación Eficiente:** Es eficiente para agregar o eliminar elementos al final de la lista.

Ejemplo de uso:

```java
List<String> arrayList = new ArrayList<>();
arrayList.add("Manzana");
arrayList.add("Banana");
arrayList.add("Cereza");
```

### LinkedList

`LinkedList` es otra implementación de la interfaz `List` que utiliza una lista doblemente enlazada. Algunas características de `LinkedList` son:

- **Inserción y Eliminación Eficientes:** Es eficiente para agregar o eliminar elementos en cualquier posición.
- **Iteración Eficiente:** Buena para operaciones de iteración.

Ejemplo de uso:

```java
List<String> linkedList = new LinkedList<>();
linkedList.add("Manzana");
linkedList.add("Banana");
linkedList.add("Cereza");
```

### Vector

`Vector` es una implementación de la interfaz `List` que es sincronizada, lo que significa que es segura para operaciones concurrentes. Sin embargo, su uso se ha vuelto menos común en comparación con `ArrayList`.

Ejemplo de uso:

```java
List<String> vector = new Vector<>();
vector.add("Manzana");
vector.add("Banana");
vector.add("Cereza");
```

En resumen, la interfaz `List` en Java proporciona una estructura de datos ordenada que admite operaciones por índice. Las implementaciones comunes como `ArrayList` y `LinkedList` ofrecen diferentes características y se eligen según los requisitos específicos de la aplicación.
