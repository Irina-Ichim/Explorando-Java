import java.util.Queue;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class EjemploQueue {

    public static void main(String[] args) {
        // Implementación con LinkedList
        Queue<String> colaLinkedList = new LinkedList<>();
        colaLinkedList.offer("Manzana");
        colaLinkedList.offer("Banana");
        colaLinkedList.offer("Cereza");

        // Mostrar elementos de la cola LinkedList
        System.out.println("Cola con LinkedList:");
        mostrarElementosCola(colaLinkedList);

        // Implementación con PriorityQueue
        Queue<Integer> colaPriorityQueue = new PriorityQueue<>();
        colaPriorityQueue.offer(5);
        colaPriorityQueue.offer(2);
        colaPriorityQueue.offer(8);

        // Mostrar elementos de la cola PriorityQueue
        System.out.println("\nCola con PriorityQueue:");
        mostrarElementosCola(colaPriorityQueue);
    }

    // Método para mostrar elementos de la cola
    private static void mostrarElementosCola(Queue<?> cola) {
        while (!cola.isEmpty()) {
            System.out.println(cola.poll());
        }
    }
}

