package clases;

public class UsoThis {

    // Atributos de la clase
    private int id;
    private String nombre;

    // Constructor que no utiliza this
    public UsoThis(int id, String nombre) {
        // Cuando los nombres de los parámetros no coinciden con los nombres de los atributos,
        // no es necesario utilizar this para distinguir entre ellos.
        this.id = id;
        this.nombre = nombre;
    }

    // Método que utiliza this para referirse a los atributos
    public void mostrarInformacion() {
        // Cuando hay ambigüedad entre el nombre del parámetro y el nombre del atributo,
        // se utiliza this para referirse al atributo de la clase.
        System.out.println("ID: " + this.id);
        System.out.println("Nombre: " + this.nombre);
    }

    // Método que no utiliza this
    public void establecerId(int id) {
        // En este caso, el parámetro id y el atributo id tienen nombres diferentes,
        // por lo que no es necesario utilizar this.
        this.id = id;
    }

    public static void main(String[] args) {
        // Ejemplo de uso de la palabra reservada this

        // Crear un objeto utilizando el constructor que no utiliza this
        UsoThis objeto1 = new UsoThis(1, "Objeto 1");

        // Llamar al método que utiliza this para mostrar la información
        objeto1.mostrarInformacion();

        // Llamar al método que no utiliza this para establecer el ID
        objeto1.establecerId(10);

        // Llamar nuevamente al método que utiliza this para mostrar la información actualizada
        objeto1.mostrarInformacion();
    }
}

