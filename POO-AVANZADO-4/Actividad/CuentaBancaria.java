// Archivo: CuentaBancaria.java
public class CuentaBancaria {
    private double saldo;

    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void retirar(double cantidad) throws SaldoInsuficienteException {
        if (cantidad > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente para retirar " + cantidad + ". Saldo actual: " + saldo);
        }
        saldo -= cantidad;
    }

    public double getSaldo() {
        return saldo;
    }
}
