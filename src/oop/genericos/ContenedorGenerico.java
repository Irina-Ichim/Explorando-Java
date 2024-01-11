
import java.util.ArrayList;
import java.util.List;

// Clase ContenedorGenerico utilizando genéricos
class ContenedorGenerico<T> {
    private List<T> elementos = new ArrayList<>();

    // Método para añadir un elemento al contenedor
    public void agregarElemento(T elemento) {
        elementos.add(elemento);
    }

    // Método para obtener un elemento del contenedor por índice
    public T obtenerElemento(int indice) {
        if (indice >= 0 && indice < elementos.size()) {
            return elementos.get(indice);
        } else {
            return null;
        }
    }

    // Método para imprimir todos los elementos del contenedor
    public void imprimirElementos() {
        for (T elemento : elementos) {
            System.out.println(elemento);
        }
    }
}