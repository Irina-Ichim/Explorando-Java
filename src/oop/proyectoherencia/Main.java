package proyectoherencia;

// Main.java
public class Main {
    public static void main(String[] args) {
        // Crear instancias de Perro y Gato
        Perro miPerro = new Perro("Max", "Labrador");
        Gato miGato = new Gato("Whiskers", "Blanco y negro");

        // Llamar a los métodos de las subclases
        miPerro.hacerSonido();
        miPerro.ladrar();
        miPerro.mostrarInformacion();

        System.out.println();

        miGato.hacerSonido();
        miGato.maullar();
        miGato.mostrarInformacion();
    }
}

