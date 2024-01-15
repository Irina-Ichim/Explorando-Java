import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Persona1 {
    private String nombre;
    private int edad;

    public Persona1(String nombre, int edad) {
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
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}

class ComparadorPorEdad implements Comparator<Persona1> {
    @Override
    public int compare(Persona1 persona1, Persona1 persona2) {
        return Integer.compare(persona1.getEdad(), persona2.getEdad());
    }
}

public class EjemploComparator {
    public static void main(String[] args) {
        // Crear personas
        Persona1 persona1 = new Persona1("Alice", 30);
        Persona1 persona2 = new Persona1("Bob", 25);
        Persona1 persona3 = new Persona1("Charlie", 35);

        // Crear una lista de personas
        List<Persona1> listaPersonas = new ArrayList<>();
        listaPersonas.add(persona1);
        listaPersonas.add(persona2);
        listaPersonas.add(persona3);

        // Crear un comparador por edad
        ComparadorPorEdad comparadorEdad = new ComparadorPorEdad();

        // Imprimir la lista antes de ordenar
        System.out.println("Lista antes de ordenar:");
        for (Persona1 persona : listaPersonas) {
            System.out.println(persona);
        }

        // Ordenar la lista utilizando Comparator
        Collections.sort(listaPersonas, comparadorEdad);

        // Imprimir la lista después de ordenar por edad
        System.out.println("\nLista después de ordenar por edad:");
        for (Persona1 persona : listaPersonas) {
            System.out.println(persona);
        }
    }
}

