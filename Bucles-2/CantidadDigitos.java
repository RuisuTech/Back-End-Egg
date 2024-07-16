import java.util.Scanner;

public class CantidadDigitos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número entero: ");
        int numero = scanner.nextInt();

        int cantidadDigitos = 0;
        int numeroAbsoluto = Math.abs(numero); // Obtener el valor absoluto del número para simplificar la cuenta de dígitos

        // Manejar el caso especial cuando el número es 0
        if (numeroAbsoluto == 0) {
            cantidadDigitos = 1;
        } else {
            // Contar los dígitos usando un bucle while
            while (numeroAbsoluto > 0) {
                numeroAbsoluto = numeroAbsoluto / 10;
                cantidadDigitos++;
            }
        }

        // Mostrar la cantidad de dígitos
        System.out.println("El número " + numero + " tiene " + cantidadDigitos + " dígitos.");

        scanner.close();
    }
}
