package abstracción;

// Clase concreta que representa una motocicleta
class Motocicleta extends Vehiculo {
    // Implementación del método abstracto para una motocicleta
    @Override
    void conducir() {
        System.out.println("La motocicleta está en movimiento.");
    }
    
    // Puede tener métodos adicionales específicos para motocicletas
    void hacerCaballito() {
        System.out.println("La motocicleta hace un caballito.");
    }
}
