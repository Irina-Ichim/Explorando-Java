public class Operaciones {
    
    /*Polimorfismo de sobrecarga:se refiere a la capacidad de tener múltiples métodos en la misma clase con el mismo nombre pero
     diferentes tipos o número de parámetros. El compilador determina cuál versión del método usar según la firma del método en tiempo 
     de compilación.
     */

    // Método para sumar dos enteros
    public int sumar(int a, int b) {
        return a + b;
    }

    // Método sobrecargado para sumar dos números decimales
    public double sumar(double a, double b) {
        return a + b;
    }

    // Método sobrecargado para concatenar dos cadenas
    public String sumar(String a, String b) {
        return a + b;
    }

    public static void main(String[] args) {
        Operaciones operaciones = new Operaciones();

        // Llamadas a los métodos sobrecargados
        int resultadoEntero = operaciones.sumar(5, 10);
        double resultadoDecimal = operaciones.sumar(3.5, 2.7);
        String resultadoCadena = operaciones.sumar("Hola", " Mundo");

        // Imprimir resultados
        System.out.println("Suma de enteros: " + resultadoEntero);
        System.out.println("Suma de decimales: " + resultadoDecimal);
        System.out.println("Concatenación de cadenas: " + resultadoCadena);
    }
}
