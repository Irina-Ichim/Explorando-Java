public class EjemploGenericos {
    public static void main(String[] args) {
        // Crear un contenedor para enteros
        ContenedorGenerico<Integer> contenedorEnteros = new ContenedorGenerico<>();
        contenedorEnteros.agregarElemento(10);
        contenedorEnteros.agregarElemento(20);
        contenedorEnteros.agregarElemento(30);

        System.out.println("Elementos en el contenedor de enteros:");
        contenedorEnteros.imprimirElementos();

        // Crear un contenedor para cadenas
        ContenedorGenerico<String> contenedorCadenas = new ContenedorGenerico<>();
        contenedorCadenas.agregarElemento("Hola");
        contenedorCadenas.agregarElemento("Mundo");
        contenedorCadenas.agregarElemento("Java");

        System.out.println("\nElementos en el contenedor de cadenas:");
        contenedorCadenas.imprimirElementos();
    }
}
