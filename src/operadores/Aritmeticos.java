package operadores;

// Archivo: OperadoresAritmeticos.java

public class Aritmeticos {

    public static void main(String[] args) {
        // Operadores Aritméticos
        int resultadoSuma = 8 + 4;     // Suma
        int resultadoResta = 9 - 2;    // Resta
        int resultadoMultiplicacion = 3 * 2;  // Multiplicación
        int resultadoDivision = 8 / 2;  // División
        int resultadoResto = 20 % 8;    // Resto

        // Mostrar resultados
        System.out.println("Resultado de la suma: " + resultadoSuma);
        System.out.println("Resultado de la resta: " + resultadoResta);
        System.out.println("Resultado de la multiplicación: " + resultadoMultiplicacion);
        System.out.println("Resultado de la división: " + resultadoDivision);
        System.out.println("Resultado del resto: " + resultadoResto);

        // Uso de operador suma con cadenas de texto
        String a = "Buenos ";
        String b = "días.";
        String saludo = a + b;
        System.out.println("Saludo: " + saludo);
    }
}

