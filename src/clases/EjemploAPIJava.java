package clases;

import java.util.ArrayList;  // Importa la clase ArrayList desde el paquete java.util

/**
 * Clase de ejemplo que utiliza la API de Java.
 */
public class EjemploAPIJava {

    /**
     * Método principal que sirve como punto de entrada del programa.
     *
     * @param args Los argumentos de la línea de comandos (no se utilizan en este ejemplo).
     */
    public static void main(String[] args) {
        // Crear una instancia de ArrayList que almacena cadenas
        ArrayList<String> listaDeCadenas = new ArrayList<>();

        // Añadir elementos a la lista
        listaDeCadenas.add("Hola");
        listaDeCadenas.add("Mundo");

        // Imprimir los elementos de la lista
        System.out.println("Elementos en la lista:");
        for (String elemento : listaDeCadenas) {
            System.out.println(elemento);
        }
    }
}
