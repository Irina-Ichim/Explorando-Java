package objetos;


/**
 * Clase que ilustra el uso del método equals() y las diferencias con el operador ==.
 */
public class ComparacionObjetos {

    /**
     * Método principal que sirve como punto de entrada del programa.
     *
     * @param args Los argumentos de la línea de comandos (no se utilizan en este ejemplo).
     */

     /**== (Comparación de Referencias): Este operador compara las referencias de dos objetos. Devolverá true solo si ambas referencias
      * apuntan al mismo objeto en la memoria. En el ejemplo, cadena1 y cadena2 son dos objetos diferentes, aunque tengan el mismo 
        contenido.
      * equals() (Comparación de Contenido): Este método compara el contenido de dos objetos. La implementación predeterminada de equals()
        en la clase Object compara las referencias, pero muchas clases, incluida String, sobrescriben este método para comparar el 
        contenido. En el ejemplo, cadena1.equals(cadena2) devuelve true porque el contenido de ambos objetos es el mismo.
     */
    public static void main(String[] args) {
        // Crear dos objetos con el mismo contenido
        String cadena1 = new String("Hola");
        String cadena2 = new String("Hola");

        // Usar == para comparar referencias
        boolean referenciaIgual = (cadena1 == cadena2);

        // Usar equals() para comparar contenido
        boolean contenidoIgual = cadena1.equals(cadena2);

        // Imprimir resultados
        System.out.println("Usando == para comparar referencias: " + referenciaIgual);
        System.out.println("Usando equals() para comparar contenido: " + contenidoIgual);
    }
}

