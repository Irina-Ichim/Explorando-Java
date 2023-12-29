package clases;

// Ejemplo de clase con modificadores de no acceso
public class EjemploModificadoresNoAcceso {

    // Modificador final: La variable no puede ser modificada una vez asignada
    final int variableFinal = 42;

    // Modificador static: La variable es compartida por todas las instancias de la clase
    static int variableEstatica = 0;

    // Modificador abstract: La clase no puede ser instanciada directamente y puede tener métodos abstractos
    abstract class ClaseAbstracta {
        abstract void metodoAbstracto();
    }

    // Modificador synchronized: El método solo puede ser accedido por un hilo a la vez
    synchronized void metodoSincronizado() {
        // Código sincronizado
    }

    // Modificador volatile: La variable puede ser modificada por múltiples hilos
    volatile int variableVolatil;

    public static void main(String[] args) {
        // Ejemplo de uso de los modificadores de no acceso
        EjemploModificadoresNoAcceso objeto = new EjemploModificadoresNoAcceso();

        // Acceder a la variable final
        System.out.println("Variable final: " + objeto.variableFinal);

        // Acceder a la variable estática
        System.out.println("Variable estática: " + EjemploModificadoresNoAcceso.variableEstatica);

        // Acceder al método sincronizado
        objeto.metodoSincronizado();
    }
}

