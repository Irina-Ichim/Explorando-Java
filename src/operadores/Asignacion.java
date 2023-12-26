package operadores;

// Archivo: OperadoresAsignacion.java

public class Asignacion {

    public static void main(String[] args) {
        // Operador de Asignación (=)
        int a = 5;
        System.out.println("Valor de a: " + a);

        // Operadores de Asignación Compuestos
        int b = 10;

        // Operador +=
        b += 5; // Equivalente a b = b + 5;
        System.out.println("Valor de b después de +=: " + b);

        // Operador -=
        b -= 3; // Equivalente a b = b - 3;
        System.out.println("Valor de b después de -=: " + b);

        // Operador *=
        b *= 2; // Equivalente a b = b * 2;
        System.out.println("Valor de b después de *=: " + b);

        // Operador /=
        b /= 4; // Equivalente a b = b / 4;
        System.out.println("Valor de b después de /=: " + b);

        // Operador %=
        b %= 2; // Equivalente a b = b % 2;
        System.out.println("Valor de b después de %=: " + b);
    }
}
