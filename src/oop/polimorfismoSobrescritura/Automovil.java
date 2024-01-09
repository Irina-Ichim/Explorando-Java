package polimorfismoSobrescritura;

// Subclase que hereda de Vehiculo
class Automovil extends Vehiculo {
    // Sobrescritura del método acelerar en la subclase
    @Override
    public void acelerar() {
        System.out.println("Acelerando un automóvil");
    }

    // Nuevo método específico de Automovil
    public void abrirPuertas() {
        System.out.println("Abriendo puertas del automóvil");
    }
}