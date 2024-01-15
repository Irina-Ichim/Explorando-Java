package proyectoherencia;

// Perro.java
public class Perro extends Animal {
    private String raza;

    public Perro(String nombre, String raza) {
        super(nombre);
        this.raza = raza;
    }

    public void ladrar() {
        System.out.println("¡Guau, guau!");
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Raza: " + raza);
    }
}

