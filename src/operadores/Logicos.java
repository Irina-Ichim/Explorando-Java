package operadores;

public class Logicos {
    // Archivo: Logicos.java
    public static void main(String[] args) {
        // Operador OR (||)
        boolean or1 = (4 == 4) || (5 == 5);
        boolean or2 = (5 == 5) || (5 < 4);
        boolean or3 = (5 < 4) || (5 == 5);
        boolean or4 = (5 < 4) || (5 == 4);

        // Operador AND (&&)
        boolean and1 = (4 == 4) && (5 == 5);
        boolean and2 = (5 == 5) && (5 < 4);
        boolean and3 = (5 < 4) && (5 == 5);
        boolean and4 = (5 < 4) && (5 == 4);

        // Operador Negación (!)
        boolean not1 = !(5 == 5);
        boolean not2 = !(5 < 4);

        // Operador XOR (^)
        boolean xor1 = true ^ true;
        boolean xor2 = true ^ false;
        boolean xor3 = false ^ true;
        boolean xor4 = false ^ false;

        // Operador OR (|)
        boolean or5 = true | false;

        // Operador AND (&)
        boolean and5 = true & false;

        // Mostrar Resultados
        System.out.println("Operador OR (||):");
        System.out.println("(4 == 4) || (5 == 5): " + or1);
        System.out.println("(5 == 5) || (5 < 4): " + or2);
        System.out.println("(5 < 4) || (5 == 5): " + or3);
        System.out.println("(5 < 4) || (5 == 4): " + or4);

        System.out.println("\nOperador AND (&&):");
        System.out.println("(4 == 4) && (5 == 5): " + and1);
        System.out.println("(5 == 5) && (5 < 4): " + and2);
        System.out.println("(5 < 4) && (5 == 5): " + and3);
        System.out.println("(5 < 4) && (5 == 4): " + and4);

        System.out.println("\nOperador Negación (!):");
        System.out.println("!(5 == 5): " + not1);
        System.out.println("!(5 < 4): " + not2);

        System.out.println("\nOperador XOR (^):");
        System.out.println("true ^ true: " + xor1);
        System.out.println("true ^ false: " + xor2);
        System.out.println("false ^ true: " + xor3);
        System.out.println("false ^ false: " + xor4);

        System.out.println("\nOperador OR (|):");
        System.out.println("true | false: " + or5);

        System.out.println("\nOperador AND (&):");
        System.out.println("true & false: " + and5);
    }
}


