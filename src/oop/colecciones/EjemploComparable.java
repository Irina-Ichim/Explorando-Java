import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Persona implements Comparable<Persona> {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Getters y Setters

    @Override
    public int compareTo(Persona otraPersona) {
        return Integer.compare(this.edad, otraPersona.edad);
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}

public class EjemploComparable {
    public static void main(String[] args) {
        // Crear personas
        Persona persona1 = new Persona("Alice", 30);
        Persona persona2 = new Persona("Bob", 25);
        Persona persona3 = new Persona("Charlie", 35);

        // Crear una lista de personas
        List<Persona> listaPersonas = new ArrayList<>();
        listaPersonas.add(persona1);
        listaPersonas.add(persona2);
        listaPersonas.add(persona3);

        // Imprimir la lista antes de ordenar
        System.out.println("Lista antes de ordenar:");
        for (Persona persona : listaPersonas) {
            System.out.println(persona);
        }

        // Ordenar la lista utilizando Comparable
        Collections.sort(listaPersonas);

        // Imprimir la lista después de ordenar
        System.out.println("\nLista después de ordenar por edad:");
        for (Persona persona : listaPersonas) {
            System.out.println(persona);
        }
    }
}

