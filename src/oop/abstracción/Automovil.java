package abstracción;

// Clase concreta que representa un automóvil
class Automovil extends Vehiculo {
    // Implementación del método abstracto para un automóvil
    @Override
    void conducir() {
        System.out.println("El automóvil está en marcha.");
    }
    
    // Puede tener métodos adicionales específicos para automóviles
    void abrirPuertas() {
        System.out.println("Se abrieron las puertas del automóvil.");
    }
}
