package interfaz;

// Main.java
public class Main {
    public static void main(String[] args) {
        // Crear un instrumento de viento
        InstrumentoDeViento saxofon = new InstrumentoDeViento("saxofón");

        // Utilizar métodos de la interfaz InstrumentoMusical
        System.out.println("Nombre del instrumento: " + saxofon.getNombre());
        System.out.println("Sonido producido: " + saxofon.producirSonido());
    }
}

