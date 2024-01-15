// Clase de excepción personalizada para saldo insuficiente
class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException(String mensaje) {
        super(mensaje);
    }
}

// Clase que representa una cuenta bancaria
class CuentaBancaria {
    private double saldo;

    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    // Método para realizar una transacción
    public void realizarTransaccion(double cantidad) throws SaldoInsuficienteException {
        if (cantidad > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente para realizar la transacción");
        }
        // Realizar la transacción si el saldo es suficiente
        saldo -= cantidad;
        System.out.println("Transacción exitosa. Saldo restante: " + saldo);
    }
}

public class PruebaExcepcionPersonalizada {
    public static void main(String[] args) {
        // Crear una cuenta bancaria con saldo inicial de 1000
        CuentaBancaria cuenta = new CuentaBancaria(1000);

        try {
            // Intentar realizar una transacción con una cantidad mayor al saldo
            cuenta.realizarTransaccion(1500);
        } catch (SaldoInsuficienteException e) {
            // Capturar la excepción personalizada
            System.out.println("Error: " + e.getMessage());
        }
    }
}
