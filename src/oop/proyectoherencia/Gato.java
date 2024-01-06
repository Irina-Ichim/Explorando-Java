package oop.proyectoherencia;

// Gato.java
public class Gato extends Animal {
    private String color;

    public Gato(String nombre, String color) {
        super(nombre);
        this.color = color;
    }

    public void maullar() {
        System.out.println("¡Miau, miau!");
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Color: " + color);
    }
}
