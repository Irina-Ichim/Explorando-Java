# Interfaz Map en Java

La interfaz `Map` en Java es parte del framework de colecciones y representa una colección de pares clave-valor, donde cada clave está asociada con un valor único. A continuación, se explicará la interfaz `Map`, qué es un mapa, los métodos más comunes y cómo se implementa.

## Interfaz Map

La interfaz `Map` en Java representa una colección de pares clave-valor, donde cada clave está asociada con un valor único. Algunas características clave de la interfaz `Map` incluyen:

- **Claves Únicas:** No puede contener claves duplicadas.
- **Valores Asociados:** Asocia cada clave con un valor.
- **Estructura de Diccionario:** Similar a un diccionario o una tabla hash.

## ¿Qué es un Map?

Un mapa es una colección de datos que asocia claves con valores. Es útil para representar relaciones y realizar búsquedas eficientes por clave. En un mapa, cada clave está asociada con un valor único.

## Métodos Más Comunes

Algunos de los métodos más comunes de la interfaz `Map` incluyen:

- **`put(K clave, V valor)`:** Asocia la clave dada con el valor dado en el mapa.

  ```java
  Map<String, Integer> mapa = new HashMap<>();
  mapa.put("Manzana", 3);
  ```

- **`get(Object clave)`:** Devuelve el valor asociado con la clave dada o `null` si la clave no está presente.

  ```java
  Integer cantidad = mapa.get("Manzana");
  ```

- **`remove(Object clave)`:** Elimina la entrada asociada con la clave dada.

  ```java
  mapa.remove("Manzana");
  ```

- **`containsKey(Object clave)`:** Retorna `true` si el mapa contiene la clave dada.

  ```java
  boolean contieneManzana = mapa.containsKey("Manzana");
  ```

- **`keySet()`:** Devuelve un conjunto de todas las claves en el mapa.

  ```java
  Set<String> conjuntoDeClaves = mapa.keySet();
  ```

## Implementación Común

### HashMap

`HashMap` es una implementación común de la interfaz `Map` que utiliza una tabla hash para almacenar los pares clave-valor. Algunas características de `HashMap` son:

- **Búsqueda Eficiente:** Ofrece un rendimiento eficiente para operaciones de búsqueda y modificación.
- **No Garantiza Orden:** No mantiene un orden específico de las claves.

Ejemplo de uso:

```java
Map<String, Integer> mapa = new HashMap<>();
mapa.put("Manzana", 3);
mapa.put("Banana", 5);
```

### LinkedHashMap

`LinkedHashMap` es una implementación de la interfaz `Map` que mantiene el orden de inserción de las claves. Algunas características de `LinkedHashMap` son:

- **Orden de Inserción:** Mantiene el orden en el que las claves fueron insertadas.
- **Eficiente Iteración:** Iterar sobre las claves se realiza en el orden de inserción.

Ejemplo de uso:

```java
Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
linkedHashMap.put("Manzana", 3);
linkedHashMap.put("Banana", 5);
```

### TreeMap

`TreeMap` es otra implementación de la interfaz `Map` que mantiene las claves ordenadas según su orden natural o mediante un comparador proporcionado. Algunas características de `TreeMap` son:

- **Orden Natural o por Comparador:** Las claves se almacenan ordenadas.
- **Eficiencia en Búsquedas:** Ofrece un rendimiento eficiente para búsquedas basadas en claves.

Ejemplo de uso:

```java
Map<String, Integer> treeMap = new TreeMap<>();
treeMap.put("Manzana", 3);
treeMap.put("Banana", 5);
```

En resumen, la interfaz `Map` en Java proporciona una estructura de datos para representar relaciones clave-valor. Las implementaciones comunes como `HashMap`, `LinkedHashMap` y `TreeMap` ofrecen diferentes características, como eficiencia en búsquedas, mantenimiento de orden de inserción y almacenamiento ordenado de claves, respectivamente.
