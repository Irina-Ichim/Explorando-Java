package clases;

public class MetodoMain {

    // Forma 1: Método main sin argumentos
    /*
    public static void main(String[] args) {
        System.out.println("Forma 1: Método main sin argumentos");
        // Código del programa
    }
    */

    // Forma 2: Método main con argumentos
    /*
    public static void main(String args[]) {
        System.out.println("Forma 2: Método main con argumentos");
        // Código del programa
    }
    */

    // Forma 3: Método main con argumentos y retorno void
    /*
    public static void main(String... args) {
        System.out.println("Forma 3: Método main con argumentos y retorno void");
        // Código del programa
    }
    */

    // Forma estándar del método main
    public static void main(String[] args) {
        // "public": Acceso desde cualquier clase.
        // "static": Pertenece a la clase en lugar de instancias específicas.
        // "void": Indica que el método no devuelve ningún valor.

        System.out.println("Este es el método main estándar.");

        // Código del programa aquí...

        // System.exit(0); // Puede ser utilizado para terminar la aplicación explícitamente.
    }
}
