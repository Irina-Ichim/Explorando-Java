package proyectosobreescritura;

// Subclase que sobrescribe el método dibujar
class Circulo extends Figura {
    @Override
    public void dibujar() {
        System.out.println("Dibujando un círculo.");
    }

    public void calcularArea() {
        System.out.println("Calculando el área de un círculo.");
    }
}
