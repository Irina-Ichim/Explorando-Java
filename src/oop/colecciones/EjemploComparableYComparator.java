import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Persona implements Comparable<Persona> {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public int compareTo(Persona otraPersona) {
        // Comparación por edad (orden natural)
        return Integer.compare(this.edad, otraPersona.edad);
    }

    // Comparador externo por nombre
    public static final Comparator<Persona> COMPARADOR_POR_NOMBRE = new Comparator<Persona>() {
        @Override
        public int compare(Persona persona1, Persona persona2) {
            // Comparación por nombre (extrínseca)
            return persona1.nombre.compareTo(persona2.nombre);
        }
    };

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}

public class EjemploComparableYComparator {
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

        // Ordenar la lista utilizando Comparable (por edad)
        Collections.sort(listaPersonas);

        // Imprimir la lista después de ordenar por edad
        System.out.println("\nLista después de ordenar por edad:");
        for (Persona persona : listaPersonas) {
            System.out.println(persona);
        }

        // Ordenar la lista utilizando Comparator (por nombre)
        Collections.sort(listaPersonas, Persona.COMPARADOR_POR_NOMBRE);

        // Imprimir la lista después de ordenar por nombre
        System.out.println("\nLista después de ordenar por nombre:");
        for (Persona persona : listaPersonas) {
            System.out.println(persona);
        }
    }
}
