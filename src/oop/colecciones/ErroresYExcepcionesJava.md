# Errores y Excepciones en Java

## Introducción

En el desarrollo de software en Java, es crucial comprender los conceptos de errores y excepciones. Estos son aspectos fundamentales para crear aplicaciones robustas y manejar situaciones inesperadas.

## Tipos de Errores

Existen dos categorías principales de errores en Java:

1. **Errores de Compilación (Compile-time Errors):**
   - Ocurren durante la fase de compilación.
   - Relacionados con la sintaxis del código fuente.
   - El programa no se compila correctamente.

2. **Errores de Ejecución (Runtime Errors):**
   - Ocurren durante la ejecución del programa.
   - Incluyen excepciones no manejadas y otros problemas en tiempo de ejecución.

## Tipos de Excepciones

Las excepciones en Java se dividen en dos tipos:

1. **Excepciones Verificadas (Checked Exceptions):**
   - Heredan de la clase `Exception` (excepto `RuntimeException` y sus subclases).
   - Obligan al programador a manejarlas mediante `try-catch` o declarando en la firma del método que pueden lanzarse.

2. **Excepciones No Verificadas (Unchecked Exceptions):**
   - Heredan de la clase `RuntimeException`.
   - No requieren manejo explícito y pueden ser capturadas opcionalmente.

## Diferencia entre Error y Excepción

- **Error:**
  - Representa problemas serios y no recuperables en tiempo de ejecución.
  - Ejemplos: `StackOverflowError`, `OutOfMemoryError`.

- **Excepción:**
  - Representa condiciones excepcionales que un programa debería anticipar y manejar.
  - Ejemplos: `NullPointerException`, `ArrayIndexOutOfBoundsException`.

## Manejo de Excepciones

Para manejar excepciones en Java, utilizamos bloques `try`, `catch`, y opcionalmente `finally`:

```java
try {
    // Código que puede lanzar una excepción
} catch (TipoDeExcepcion e) {
    // Manejo de la excepción
} finally {
    // Bloque opcional que se ejecuta siempre, haya o no excepción
}
```

Es fundamental comprender y aplicar el manejo adecuado de excepciones para construir programas más robustos y evitar comportamientos inesperados.

## Conclusión

Entender los errores y excepciones en Java es esencial para desarrolladores. El manejo adecuado de estas situaciones contribuye a la creación de software más confiable y fácil de mantener.
