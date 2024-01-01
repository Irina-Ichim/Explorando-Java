package objetos;

/**
 * Clase que representa un ejemplo de objeto en Java.
 */
public class EjemploObjeto {

    // Atributos de la clase
    private String nombre;
    private int edad;

    /**
     * Constructor de la clase.
     *
     * @param nombre El nombre del objeto.
     * @param edad   La edad del objeto.
     */
    public EjemploObjeto(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    /**
     * Método para obtener el nombre del objeto.
     *
     * @return El nombre del objeto.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método para obtener la edad del objeto.
     *
     * @return La edad del objeto.
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Método para modificar el nombre del objeto.
     *
     * @param nuevoNombre El nuevo nombre a asignar.
     */
    public void setNombre(String nuevoNombre) {
        this.nombre = nuevoNombre;
    }

    /**
     * Método para modificar la edad del objeto.
     *
     * @param nuevaEdad La nueva edad a asignar.
     */
    public void setEdad(int nuevaEdad) {
        this.edad = nuevaEdad;
    }

    /**
     * Método principal que sirve como punto de entrada del programa.
     *
     * @param args Los argumentos de la línea de comandos (no se utilizan en este ejemplo).
     */
    public static void main(String[] args) {
        // Crear un objeto utilizando el constructor
        EjemploObjeto miObjeto = new EjemploObjeto("Juan", 25);

        // Imprimir los atributos originales del objeto
        System.out.println("Nombre: " + miObjeto.getNombre());
        System.out.println("Edad: " + miObjeto.getEdad());

        // Modificar los atributos del objeto
        miObjeto.setNombre("Maria");
        miObjeto.setEdad(30);

        // Imprimir los atributos modificados del objeto
        System.out.println("\nDespués de la modificación:");
        System.out.println("Nombre: " + miObjeto.getNombre());
        System.out.println("Edad: " + miObjeto.getEdad());
    }
}
