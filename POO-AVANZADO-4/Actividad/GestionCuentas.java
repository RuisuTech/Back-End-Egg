// Archivo: GestionCuentas.java
public class GestionCuentas {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria(1000.00);

        try {
            System.out.println("Saldo inicial: " + cuenta.getSaldo());

            // Intentar retirar una cantidad válida
            cuenta.retirar(500.00);
            System.out.println("Saldo después del retiro de 500: " + cuenta.getSaldo());

            // Intentar retirar una cantidad que excede el saldo
            cuenta.retirar(600.00); // Esto lanzará una excepción

        } catch (SaldoInsuficienteException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Verificar saldo final
        System.out.println("Saldo final: " + cuenta.getSaldo());
    }
}
