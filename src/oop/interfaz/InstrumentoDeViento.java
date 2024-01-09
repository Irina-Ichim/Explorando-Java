package interfaz;

// InstrumentoDeViento.java
public class InstrumentoDeViento implements InstrumentoMusical {
    private String nombre;

    public InstrumentoDeViento(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public String producirSonido() {
        return "Soplido fuerte a través de " + nombre;
    }
}

