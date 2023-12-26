package operadores;

// Archivo: OperadoresUnarios.java

public class Unarios {

    public static void main(String[] args) {
        // Variables
        int x = 5;

        // Operadores Unarios
        System.out.println("Valor original de x: " + x);

        // Operador de Incremento (++)
        x++;
        System.out.println("Después de x++: " + x);

        // Operador de Decremento (--)
        x--;
        System.out.println("Después de x--: " + x);

        // Operador de Negación (-)
        int y = -x;
        System.out.println("Negación de x: " + y);

        // Operador de Complemento Bit a Bit (~)
        int z = ~x;
        System.out.println("Complemento Bit a Bit de x: " + z);
    }
}

