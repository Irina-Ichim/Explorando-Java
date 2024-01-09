package polimorfismoSobrescritura;

public class PolimorfismoSobrescrituraEjemplo {
    public static void main(String[] args) {
        // Crear instancias de las clases
        Vehiculo miVehiculo = new Vehiculo();
        Vehiculo miAutomovil = new Automovil();  // Polimorfismo

        // Llamadas al método acelerar
        miVehiculo.acelerar();     // Llamada al método de la superclase
        miAutomovil.acelerar();    // Llamada al método sobrescrito en Automovil

        // Intentar llamar al método abrirPuertas generará un error de compilación
        // miAutomovil.abrirPuertas();  // Esto no es posible porque el tipo está declarado como Vehiculo
    }
}
