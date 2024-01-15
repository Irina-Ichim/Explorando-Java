package proyectoherencia;

// Animal.java
public class Animal {
    protected String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public void hacerSonido() {
        System.out.println("Haciendo sonidos...");
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
    }
}

