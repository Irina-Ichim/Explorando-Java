package clases;

public class EjemploSettersGetters {

    // Atributos de la clase
    private int id;
    private String nombre;
    private boolean activo; // Nuevo atributo booleano

    // Constructor
    public EjemploSettersGetters(int id, String nombre, boolean activo) {
        this.id = id;
        this.nombre = nombre;
        this.activo = activo;
    }

    // Getter para obtener el valor de id
    public int getId() {
        return id;
    }

    // Setter para establecer el valor de id
    public void setId(int id) {
        this.id = id;
    }

    // Getter para obtener el valor de nombre
    public String getNombre() {
        return nombre;
    }

    // Setter para establecer el valor de nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter para obtener el valor de activo utilizando el nombre convencional
    public boolean isActivo() {
        return activo;
    }

    // Setter para establecer el valor de activo utilizando el nombre convencional
    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public static void main(String[] args) {
        // Ejemplo de uso de setters y getters con el nuevo atributo booleano

        // Crear un objeto utilizando el constructor
        EjemploSettersGetters objeto = new EjemploSettersGetters(1, "Objeto", true);

        // Obtener valores utilizando getters
        System.out.println("ID: " + objeto.getId());
        System.out.println("Nombre: " + objeto.getNombre());
        System.out.println("Activo: " + objeto.isActivo()); // Utilizando el nombre convencional

        // Modificar valores utilizando setters
        objeto.setId(10);
        objeto.setNombre("Objeto Modificado");
        objeto.setActivo(false);

        // Obtener los nuevos valores utilizando getters
        System.out.println("ID Modificado: " + objeto.getId());
        System.out.println("Nombre Modificado: " + objeto.getNombre());
        System.out.println("Activo Modificado: " + objeto.isActivo()); // Utilizando el nombre convencional
    }
}

