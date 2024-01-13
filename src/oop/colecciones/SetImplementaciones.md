# Interfaz Set y sus Implementaciones en Java

La interfaz `Set` en Java es parte del framework de colecciones y representa un conjunto de elementos únicos, es decir, no puede contener duplicados. A continuación, se explicará la interfaz `Set` y tres implementaciones comunes: `HashSet`, `LinkedHashSet` y `TreeSet`.

## Interfaz Set

La interfaz `Set` es una interfaz en Java que extiende la interfaz `Collection`. Algunas características clave de la interfaz `Set` incluyen:

- **Elementos Únicos:** No permite elementos duplicados; cada elemento en el conjunto es único.
- **No Garantiza Orden:** No garantiza el orden de los elementos en el conjunto.
- **Métodos Básicos:** Incluye métodos básicos como `add`, `remove`, y `contains`.

## HashSet

`HashSet` es una implementación de la interfaz `Set` que utiliza una tabla hash para almacenar los elementos. Algunas características de `HashSet` son:

- **No Ordenado:** No mantiene un orden específico de los elementos.
- **Rendimiento:** Ofrece un rendimiento constante para operaciones básicas como `add`, `remove` y `contains`.

Ejemplo de uso:

```java
Set<String> hashSet = new HashSet<>();
hashSet.add("Manzana");
hashSet.add("Banana");
hashSet.add("Cereza");
```

## LinkedHashSet

`LinkedHashSet` es otra implementación de la interfaz `Set` que mantiene el orden de inserción de los elementos. Algunas características de `LinkedHashSet` son:

- **Orden de Inserción:** Mantiene el orden en el que se agregaron los elementos.
- **Rendimiento:** Ofrece un buen rendimiento para operaciones básicas, aunque ligeramente inferior a `HashSet`.

Ejemplo de uso:

```java
Set<String> linkedHashSet = new LinkedHashSet<>();
linkedHashSet.add("Manzana");
linkedHashSet.add("Banana");
linkedHashSet.add("Cereza");
```

## TreeSet

`TreeSet` es una implementación de la interfaz `Set` que almacena elementos en un árbol, ordenándolos según su orden natural o un comparador proporcionado. Algunas características de `TreeSet` son:

- **Orden Natural o por Comparador:** Los elementos se almacenan ordenados según su orden natural o por un comparador proporcionado.
- **Mayor Sobrecarga:** Puede tener una sobrecarga mayor para operaciones básicas debido a la necesidad de mantener el orden.

Ejemplo de uso:

```java
Set<String> treeSet = new TreeSet<>();
treeSet.add("Manzana");
treeSet.add("Banana");
treeSet.add("Cereza");
```

En resumen, la interfaz `Set` y sus implementaciones proporcionan diferentes comportamientos en términos de orden y rendimiento, lo que permite a los desarrolladores elegir la implementación más adecuada según los requisitos específicos de sus aplicaciones.
