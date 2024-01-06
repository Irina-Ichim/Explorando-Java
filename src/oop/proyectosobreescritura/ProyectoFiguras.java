package proyectosobreescritura;

public class ProyectoFiguras {
    public static void main(String[] args) {
        Figura figura1 = new Circulo();
        Figura figura2 = new Cuadrado();

        // Llamadas a los métodos dibujar
        figura1.dibujar(); // Llama al método dibujar de Circulo
        figura2.dibujar(); // Llama al método dibujar de Cuadrado

        // Estas líneas no funcionarán ya que calcularArea no está en la clase base Figura
        // figura1.calcularArea();
        // figura2.calcularArea();
        
        // Sin embargo, puedes hacer un casting para usar el método específico
        if (figura1 instanceof Circulo) {
            ((Circulo) figura1).calcularArea();
        }

        if (figura2 instanceof Cuadrado) {
            ((Cuadrado) figura2).calcularArea();
        }
    }
}
