package operadores;

public class Ternario {

    public static void main(String[] args) {
        // Ejemplo con el Operador Ternario
        int numero1 = 10;
        int numero2 = 5;

        // Sintaxis del Operador Ternario
        // variable = (condición) ? valor_si_verdadero : valor_si_falso;

        // Asignación usando el Operador Ternario
        int resultado = (numero1 > numero2) ? numero1 : numero2;

        // Mostrar Resultado
        System.out.println("El resultado es: " + resultado);

        // Ejemplo con String
        boolean esMayor = (numero1 > numero2);
        String mensaje = esMayor ? "Número 1 es mayor" : "Número 2 es mayor o igual";

        // Mostrar Mensaje
        System.out.println(mensaje);
    }

}
