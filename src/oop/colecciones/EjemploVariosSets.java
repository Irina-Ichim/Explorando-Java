import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.Set;

public class EjemploVariosSets {

    public static void main(String[] args) {
        // Crear un HashSet
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Manzana");
        hashSet.add("Banana");
        hashSet.add("Cereza");
        hashSet.add("Durazno");

        // Crear un LinkedHashSet
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Manzana");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Cereza");
        linkedHashSet.add("Durazno");

        // Crear un TreeSet
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Manzana");
        treeSet.add("Banana");
        treeSet.add("Cereza");
        treeSet.add("Durazno");

        // Mostrar los conjuntos
        System.out.println("HashSet: " + hashSet);
        System.out.println("LinkedHashSet: " + linkedHashSet);
        System.out.println("TreeSet: " + treeSet);
    }
}

