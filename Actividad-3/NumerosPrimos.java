import java.util.Scanner;

public class NumerosPrimos {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int numero;

            do {
                System.out.print("Introduce un número (o ingresa 0 para salir): ");
                numero = scanner.nextInt();

                if (numero <= 1) {
                    System.out.println("El número debe ser mayor que 1. Inténtalo de nuevo.");
                    continue;
                }

                boolean esPrimo = verificarPrimo(numero);

                if (esPrimo) {
                    System.out.println(numero + " es un número primo. ¡Felicidades!");
                } else {
                    System.out.println(numero + " no es un número primo. Inténtalo de nuevo.");
                }

            } while (numero != 0);
        }
        System.out.println("Fin del programa.");
    }

    // Método para verificar si un número es primo
    public static boolean verificarPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        if (numero == 2 || numero == 3) {
            return true;
        }
        if (numero % 2 == 0) {
            return false;
        }

        // Verificar divisibilidad desde 3 hasta la raíz cuadrada de numero
        int limite = (int) Math.sqrt(numero);
        for (int i = 3; i <= limite; i += 2) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }
}
