import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Persona2 implements Comparable<Persona2> {
    private String nombre;
    private int edad;

    public Persona2(String nombre, int edad) {
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
    public int compareTo(Persona2 otraPersona) {
        // Comparación por edad (orden natural)
        return Integer.compare(this.edad, otraPersona.edad);
    }

    // Comparador externo por nombre
    public static final Comparator<Persona2> COMPARADOR_POR_NOMBRE = new Comparator<Persona2>() {
        @Override
        public int compare(Persona2 persona1, Persona2 persona2) {
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
        Persona2 persona1 = new Persona2("Alice", 30);
        Persona2 persona2 = new Persona2("Bob", 25);
        Persona2 persona3 = new Persona2("Charlie", 35);

        // Crear una lista de personas
        List<Persona2> listaPersonas = new ArrayList<>();
        listaPersonas.add(persona1);
        listaPersonas.add(persona2);
        listaPersonas.add(persona3);

        // Imprimir la lista antes de ordenar
        System.out.println("Lista antes de ordenar:");
        for (Persona2 persona : listaPersonas) {
            System.out.println(persona);
        }

        // Ordenar la lista utilizando Comparable (por edad)
        Collections.sort(listaPersonas);

        // Imprimir la lista después de ordenar por edad
        System.out.println("\nLista después de ordenar por edad:");
        for (Persona2 persona : listaPersonas) {
            System.out.println(persona);
        }

        // Ordenar la lista utilizando Comparator (por nombre)
        Collections.sort(listaPersonas, Persona2.COMPARADOR_POR_NOMBRE);

        // Imprimir la lista después de ordenar por nombre
        System.out.println("\nLista después de ordenar por nombre:");
        for (Persona2 persona : listaPersonas) {
            System.out.println(persona);
        }
    }
}
