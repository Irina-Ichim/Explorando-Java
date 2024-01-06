package proyectosobreescritura;

// Otra subclase que también sobrescribe el método dibujar
class Cuadrado extends Figura {
    @Override
    public void dibujar() {
        System.out.println("Dibujando un cuadrado.");
    }

    public void calcularArea() {
        System.out.println("Calculando el área de un cuadrado.");
    }
}
