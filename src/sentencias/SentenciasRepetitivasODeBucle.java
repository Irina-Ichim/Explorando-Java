import java.util.Scanner;

public class SentenciasRepetitivasODeBucle {

    public static void main(String[] args) {
        SentenciasRepetitivasODeBucle ejemplos = new SentenciasRepetitivasODeBucle();

        // Ejemplo de bucle while
        ejemplos.leerNumero();

        // Ejemplo de bucle do-while
        ejemplos.numeroPar(10);

        // Ejemplo de bucle for
        ejemplos.imprimirNumerosNaturales(5);
    }

    public void leerNumero() {
        Scanner sc = new Scanner(System.in);
        int numero;

        do {
            System.out.println("Introduce un numero positivo:");
            numero = sc.nextInt();
        } while (numero <= 0);

        // Cerrar el objeto Scanner al final de su uso
        sc.close();
    }

    public void numeroPar(int numero) {
        int n;

        do {
            n = (int) (Math.random() * numero);
            System.out.println(n);
        } while (n % 2 == 0);

        System.out.println("Y el número impar que ha detenido el bucle es: " + n);
    }

    public void imprimirNumerosNaturales(int n) {
        System.out.println("Imprimir los primeros " + n + " números naturales:");

        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }

        System.out.println(); // Agrega un salto de línea al final
    }
}


