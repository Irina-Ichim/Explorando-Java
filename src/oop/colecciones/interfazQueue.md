# Interfaz Queue en Java

La interfaz `Queue` en Java es parte del framework de colecciones y representa una cola, que sigue el principio de "primero en entrar, primero en salir" (FIFO). A continuación, se explicará la interfaz `Queue`, sus métodos más comunes y cómo se implementa.

## Interfaz Queue

La interfaz `Queue` extiende la interfaz `Collection` y agrega métodos específicos para manipular elementos en una cola. Algunas características clave de la interfaz `Queue` incluyen:

- **FIFO:** Los elementos se añaden al final de la cola y se eliminan desde el principio.
- **Cola Restringida:** Puede tener restricciones, como límites de tamaño.

## Métodos Más Comunes

Algunos de los métodos más comunes de la interfaz `Queue` incluyen:

- **`offer(E elemento)`:** Agrega un elemento al final de la cola.

  ```java
  Queue<String> cola = new LinkedList<>();
  cola.offer("Elemento1");
  ```

- **`poll()`:** Remueve y devuelve el elemento al frente de la cola. Retorna `null` si la cola está vacía.

  ```java
  String elementoRemovido = cola.poll();
  ```

- **`peek()`:** Devuelve el elemento al frente de la cola sin removerlo. Retorna `null` si la cola está vacía.

  ```java
  String elementoAlFrente = cola.peek();
  ```

- **`isEmpty()`:** Retorna `true` si la cola está vacía, `false` si tiene elementos.

  ```java
  boolean estaVacia = cola.isEmpty();
  ```

## Implementación Común

### LinkedList

`LinkedList` es una implementación común de la interfaz `Queue`. Algunas características de `LinkedList` como cola son:

- **Eficiente para Operaciones de Cola:** `LinkedList` ofrece un rendimiento eficiente para operaciones de cola, como `offer`, `poll`, y `peek`.
- **Flexibilidad:** Puede ser utilizada como una cola o como una lista enlazada estándar.

Ejemplo de uso:

```java
Queue<String> cola = new LinkedList<>();
cola.offer("Elemento1");
cola.offer("Elemento2");
String elementoRemovido = cola.poll();
```

## PriorityQueue

`PriorityQueue` es otra implementación de la interfaz `Queue` que mantiene los elementos ordenados según su prioridad. Algunas características de `PriorityQueue` son:

- **Ordenamiento Automático:** Los elementos se organizan automáticamente según su orden natural o mediante un comparador proporcionado.
- **Búsqueda Eficiente del Elemento con Mayor Prioridad:** La operación `poll()` devuelve y elimina el elemento con mayor prioridad.

Ejemplo de uso:

```java
Queue<Integer> priorityQueue = new PriorityQueue<>();
priorityQueue.offer(5);
priorityQueue.offer(2);
priorityQueue.offer(8);
int elementoPrioritario = priorityQueue.poll(); // Devuelve 2
```

En resumen, la interfaz `PriorityQueue` en Java proporciona una cola donde los elementos se mantienen ordenados según su prioridad. Es útil en situaciones donde se necesita procesar elementos en un orden específico basado en su prioridad.
