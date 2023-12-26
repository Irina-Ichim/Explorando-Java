package operadores;

// Archivo: AritmeticosCombinados.java

public class AritmeticosCombinados {

    public static void main(String[] args) {
        // Variables
        int x = 10;
        int y = 5;

        // Operadores Aritméticos Combinados
        x += y; // Equivalente a x = x + y;
        System.out.println("Después de +=: " + x);

        x -= y; // Equivalente a x = x - y;
        System.out.println("Después de -=: " + x);

        x *= y; // Equivalente a x = x * y;
        System.out.println("Después de *=: " + x);

        x /= y; // Equivalente a x = x / y;
        System.out.println("Después de /=: " + x);

        x %= y; // Equivalente a x = x % y;
        System.out.println("Después de %=: " + x);
    }
}

