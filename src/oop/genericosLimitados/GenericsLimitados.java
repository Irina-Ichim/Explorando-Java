package genericosLimitados;

// Genéricos de límite superior
class ContenedorNumerico<T extends Number> {
    private T elemento;

    public ContenedorNumerico(T elemento) {
        this.elemento = elemento;
    }

    public T obtenerElemento() {
        return elemento;
    }

    public void imprimirTipo() {
        System.out.println("Tipo del elemento: " + elemento.getClass().getName());
    }
}

// Genéricos de límite inferior (corregido)
class ContenedorSuperclase<T> {
    private T elemento;

    public ContenedorSuperclase(T elemento) {
        this.elemento = elemento;
    }

    public T obtenerElemento() {
        return elemento;
    }

    public void imprimirTipo() {
        System.out.println("Tipo del elemento: " + elemento.getClass().getName());
    }
}

public class GenericsLimitados {
    public static void main(String[] args) {
        // Genéricos de límite superior
        ContenedorNumerico<Integer> contenedorEntero = new ContenedorNumerico<>(42);
        contenedorEntero.imprimirTipo();
        System.out.println("Valor del elemento: " + contenedorEntero.obtenerElemento());

        // Genéricos de límite inferior
        ContenedorSuperclase<Number> contenedorNumero = new ContenedorSuperclase<>(3.14);
        contenedorNumero.imprimirTipo();
        System.out.println("Valor del elemento: " + contenedorNumero.obtenerElemento());
    }
}


