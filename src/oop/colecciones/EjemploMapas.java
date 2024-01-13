import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.Set;

public class EjemploMapas {

    public static void main(String[] args) {
        // Implementación con HashMap
        Map<String, Integer> mapaHashMap = new HashMap<>();
        mapaHashMap.put("Manzana", 3);
        mapaHashMap.put("Banana", 5);
        mapaHashMap.put("Cereza", 2);

        // Mostrar elementos del mapa HashMap
        System.out.println("HashMap:");
        mostrarElementosMapa(mapaHashMap);

        // Implementación con LinkedHashMap
        Map<String, Integer> mapaLinkedHashMap = new LinkedHashMap<>();
        mapaLinkedHashMap.put("Manzana", 3);
        mapaLinkedHashMap.put("Banana", 5);
        mapaLinkedHashMap.put("Cereza", 2);

        // Mostrar elementos del mapa LinkedHashMap
        System.out.println("\nLinkedHashMap:");
        mostrarElementosMapa(mapaLinkedHashMap);

        // Implementación con TreeMap
        Map<String, Integer> mapaTreeMap = new TreeMap<>();
        mapaTreeMap.put("Manzana", 3);
        mapaTreeMap.put("Banana", 5);
        mapaTreeMap.put("Cereza", 2);

        // Mostrar elementos del mapa TreeMap
        System.out.println("\nTreeMap:");
        mostrarElementosMapa(mapaTreeMap);
    }

    // Método para mostrar elementos del mapa
    private static void mostrarElementosMapa(Map<String, Integer> mapa) {
        Set<Map.Entry<String, Integer>> entrySet = mapa.entrySet();
        for (Map.Entry<String, Integer> entry : entrySet) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
