package operadores;

public class Relacionales {
    // Archivo: OperadoresRelacionales.java

    public static void main(String[] args) {
        // Variables
        int a = 5;
        int b = 10;

        // Operadores Relacionales
        boolean igual = (a == b);
        boolean diferente = (a != b);
        boolean mayorQue = (a > b);
        boolean menorQue = (a < b);
        boolean mayorOIgualQue = (a >= b);
        boolean menorOIgualQue = (a <= b);

        // Mostrar Resultados
        System.out.println("a == b: " + igual);
        System.out.println("a != b: " + diferente);
        System.out.println("a > b: " + mayorQue);
        System.out.println("a < b: " + menorQue);
        System.out.println("a >= b: " + mayorOIgualQue);
        System.out.println("a <= b: " + menorOIgualQue);
    }
}

    
