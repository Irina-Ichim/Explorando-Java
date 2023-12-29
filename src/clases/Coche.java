package clases;

public class Coche {

    // Atributos con modificadores de acceso
    public String color;      // Atributo público
    private double longitud;   // Atributo privado
    protected int plazas;      // Atributo protegido

    // Atributos adicionales
    private String modelo;     // Atributo privado
    protected boolean enMarcha; // Atributo protegido

    // Constructor de la clase Coche
    public Coche(String color, double longitud, int plazas, String modelo) {
        this.color = color;
        this.longitud = longitud;
        this.plazas = plazas;
        this.modelo = modelo;
        this.enMarcha = false; // Por defecto, el coche no está en marcha al crearlo.
    }

    // Métodos de acceso para atributos privados y protegidos

    // Método para obtener el valor de longitud (atributo privado).
    public double getLongitud() {
        return longitud;
    }

    // Método para establecer el valor de longitud (atributo privado).
    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    // Método para obtener el modelo (atributo privado).
    public String getModelo() {
        return modelo;
    }

    // Método para establecer el modelo (atributo privado).
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    // Método para obtener el estado de marcha (atributo protegido).
    protected boolean isEnMarcha() {
        return enMarcha;
    }

    // Método para arrancar el coche (atributo protegido).
    protected void arrancar() {
        enMarcha = true;
        System.out.println("El coche está en marcha.");
    }

    // Otros métodos de la clase Coche
    public void conducir() {
        System.out.println("El coche está en movimiento.");
    }

    public static void main(String[] args) {
        // Ejemplo de uso de la clase Coche
        Coche miCoche = new Coche("Rojo", 4.5, 5, "Sedán");

        // Mostrar información sobre el coche.
        System.out.println("Color: " + miCoche.color);
        System.out.println("Longitud: " + miCoche.getLongitud());
        System.out.println("Plazas: " + miCoche.plazas);
        System.out.println("Modelo: " + miCoche.getModelo());

        // Acceder al estado de marcha.
        System.out.println("En marcha: " + miCoche.isEnMarcha());

        // Arrancar el coche.
        miCoche.arrancar();

        // Conducir el coche.
        miCoche.conducir();
    }
}
