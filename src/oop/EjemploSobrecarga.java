public class EjemploSobrecarga {

    // Método sobrecargado con un parámetro de tipo entero
    public void mostrarMensaje(int numero) {
        System.out.println("El número es: " + numero);
    }

    // Método sobrecargado con un parámetro de tipo cadena
    public void mostrarMensaje(String texto) {
        System.out.println("El texto es: " + texto);
    }

    // Método sobrecargado con dos parámetros de diferentes tipos
    public void mostrarMensaje(int numero, String texto) {
        System.out.println("Número: " + numero + ", Texto: " + texto);
    }

    // Método sobrecargado con dos parámetros de diferentes tipos y en un orden diferente
    public void mostrarMensaje(String texto, int numero) {
        System.out.println("Texto: " + texto + ", Número: " + numero);
    }

    public static void main(String[] args) {
        EjemploSobrecarga ejemplo = new EjemploSobrecarga();

        // Llamadas a los métodos sobrecargados
        ejemplo.mostrarMensaje(42);
        ejemplo.mostrarMensaje("Hola, mundo!");
        ejemplo.mostrarMensaje(23, "Saludos");
        ejemplo.mostrarMensaje("Java", 8);
    }
}
