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

