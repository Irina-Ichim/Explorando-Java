package clases;


public class EjemploConstructores {

    // Atributos de la clase
    private int id;
    private String nombre;

    // Constructor vacío o por defecto
    public EjemploConstructores() {
        // Este es un constructor vacío que no toma parámetros.
        // Se utiliza para crear un objeto con valores predeterminados o nulos.
        // En este caso, los atributos se inicializan con sus valores predeterminados.
    }

    // Constructor de copia
    public EjemploConstructores(EjemploConstructores otroObjeto) {
        // Este es un constructor de copia que toma otro objeto de la misma clase como parámetro.
        // Se utiliza para crear una copia exacta de ese objeto.
        // En este caso, se copian los valores de los atributos del objeto proporcionado.
        this.id = otroObjeto.id;
        this.nombre = otroObjeto.nombre;
    }

    // Constructor común
    public EjemploConstructores(int id, String nombre) {
        // Este es un constructor común que toma valores específicos como parámetros.
        // Se utiliza para crear un objeto con valores específicos proporcionados al crearlo.
        this.id = id;
        this.nombre = nombre;
    }

    // Constructor con parámetros
    public EjemploConstructores(String nombre) {
        // Este es un constructor con parámetros que toma solo el nombre como parámetro.
        // Se utiliza para crear un objeto con un nombre específico, manteniendo el id como valor predeterminado.
        this.id = 0; // Valor predeterminado para id
        this.nombre = nombre;
    }

    public static void main(String[] args) {
        // Ejemplo de creación de objetos usando diferentes constructores

        // Constructor vacío
        EjemploConstructores objeto1 = new EjemploConstructores();

        // Constructor de copia
        EjemploConstructores objeto2 = new EjemploConstructores(objeto1);

        // Constructor común
        EjemploConstructores objeto3 = new EjemploConstructores(1, "Ejemplo");

        // Constructor con parámetros
        EjemploConstructores objeto4 = new EjemploConstructores("Otro Ejemplo");
    }
}

