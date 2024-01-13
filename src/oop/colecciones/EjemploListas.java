import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class EjemploListas {

    public static void main(String[] args) {
        // ArrayList
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Manzana");
        arrayList.add("Banana");
        arrayList.add("Cereza");

        // LinkedList
        List<String> linkedList = new LinkedList<>();
        linkedList.add("Manzana");
        linkedList.add("Banana");
        linkedList.add("Cereza");

        // Vector
        List<String> vector = new Vector<>();
        vector.add("Manzana");
        vector.add("Banana");
        vector.add("Cereza");

        // Mostrar elementos de ArrayList
        System.out.println("ArrayList:");
        mostrarElementos(arrayList);

        // Mostrar elementos de LinkedList
        System.out.println("\nLinkedList:");
        mostrarElementos(linkedList);

        // Mostrar elementos de Vector
        System.out.println("\nVector:");
        mostrarElementos(vector);
    }

    // Método para mostrar elementos de la lista
    private static void mostrarElementos(List<String> lista) {
        for (String elemento : lista) {
            System.out.println(elemento);
        }
    }
}
