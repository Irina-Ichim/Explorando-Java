package sentencias;

import java.util.Scanner;

public class SentenciasAnidadas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un número: ");
        int numero = sc.nextInt();

        // Sentencias anidadas para determinar si el número es positivo, negativo o cero
        if (numero > 0) {
            System.out.println("El número es positivo.");
        } else if (numero < 0) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es cero.");
        }

        sc.close(); // Cerrar el objeto Scanner al final
    }
}

