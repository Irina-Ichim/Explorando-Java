package abstracción;

//Clase principal que demuestra el uso de abstracción
public class AbstraccionEjemplo {
    public static void main(String[] args) {
        // No se puede crear una instancia de la clase abstracta Vehiculo
        // Vehiculo vehiculo = new Vehiculo(); // Esto generaría un error
        
        // Pero se pueden crear instancias de las clases concretas que la extienden
        Automovil auto = new Automovil();
        Motocicleta moto = new Motocicleta();
        
        // Llamadas a métodos comunes y específicos de cada tipo de vehículo
        auto.conducir();
        auto.detener();
        auto.abrirPuertas();
        
        moto.conducir();
        moto.detener();
        moto.hacerCaballito();
    }
}
