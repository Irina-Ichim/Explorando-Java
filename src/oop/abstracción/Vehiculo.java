package abstracción;

// Clase abstracta que representa un vehículo genérico
abstract class Vehiculo {
    // Método abstracto que debe ser implementado por las subclases
    abstract void conducir();
    
    // Método concreto compartido por todas las subclases
    void detener() {
        System.out.println("El vehículo se detuvo.");
    }
}

