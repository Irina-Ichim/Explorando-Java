package clases;

import java.util.Scanner;

public class EjemploReturn {

    public static void main(String[] args) {
        // Ejemplo de uso de la instrucción return
        Scanner scanner = new Scanner(System.in);

        System.out.println("Suma de dos números:");
        System.out.print("Ingresa el primer número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingresa el segundo número: ");
        int numero2 = scanner.nextInt();

        // Llamada al método suma
        int resultado = suma(numero1, numero2);

        // Mostrar el resultado
        System.out.println("La suma es: " + resultado);

         // Cerrar el objeto Scanner al finalizar
         scanner.close();
    }

    /**
     * Método que realiza la suma de dos números y utiliza la instrucción return.
     * 
     * @param a Primer número
     * @param b Segundo número
     * @return Resultado de la suma
     */
    public static int suma(int a, int b) {
        // Realizar la suma
        int suma = a + b;

        // Devolver el resultado usando la instrucción return, el return se usa para devolver algo
        return suma;
        // Después de la instrucción return, el control sale del método
        // y cualquier código posterior a return no se ejecutará.
    }
}
