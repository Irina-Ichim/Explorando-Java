package clases;

public class Coche {

    // Atributos de la clase Coche con modificadores de acceso

    // Atributo público: Puede ser accedido directamente desde cualquier otra clase.
    public String color;

    // Atributo privado: Solo puede ser accedido o modificado mediante métodos.
    private double longitud;

    // Atributo protegido: Accesible desde la propia clase, subclases y clases en el mismo paquete.
    protected int plazas;

    // Constructor de la clase Coche
    public Coche(String color, double longitud, int plazas) {
        // Inicialización de los atributos al crear un objeto de la clase Coche.
        this.color = color;
        this.longitud = longitud;
        this.plazas = plazas;
    }

    // Otros métodos de la clase Coche

    // Método para simular la acción de conducir el coche.
    public void conducir() {
        System.out.println("El coche está en movimiento.");
    }

    // Métodos para acceder y modificar el atributo privado longitud

    // Método para obtener el valor de longitud.
    public double getLongitud() {
        return longitud;
    }

    // Método para establecer el valor de longitud.
    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    // Método principal (main) para un ejemplo de uso de la clase Coche.
    public static void main(String[] args) {
        // Ejemplo de uso de la clase Coche
        Coche miCoche = new Coche("Rojo", 4.5, 5);

        // Mostrar información sobre el coche.
        System.out.println("Color: " + miCoche.color);
        System.out.println("Longitud: " + miCoche.getLongitud());
        System.out.println("Plazas: " + miCoche.plazas);

        // Simular la acción de conducir el coche.
        miCoche.conducir();

        // Modificar la longitud usando el método setLongitud.
        miCoche.setLongitud(5.0);

        // Mostrar la nueva longitud.
        System.out.println("Nueva longitud: " + miCoche.getLongitud());
    }
}
