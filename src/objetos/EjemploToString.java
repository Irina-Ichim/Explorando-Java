package objetos;


/**
 * Clase que ilustra el uso del método toString().
 */
public class EjemploToString {

    /**
     * Clase de ejemplo de un objeto personalizado.
     */
    static class Persona {
        private String nombre;
        private int edad;

        public Persona(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
        }

        // Sobrescribir el método toString() para proporcionar una representación de cadena significativa
        @Override
        public String toString() {
            return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
        }
    }

    /**
     * Método principal que sirve como punto de entrada del programa.
     *
     * @param args Los argumentos de la línea de comandos (no se utilizan en este ejemplo).
     */
    public static void main(String[] args) {
        // Ejemplo con una clase de la API (String)
        String cadena = new String("Hola");

        // Imprimir con toString() (implícitamente se llama)
        System.out.println("Usando toString() para String: " + cadena);

        // Ejemplo con un objeto personalizado
        Persona persona = new Persona("Juan", 25);

        // Imprimir con toString() (llamando explícitamente)
        System.out.println("Usando toString() para Persona: " + persona.toString());
    }
}

