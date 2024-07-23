import java.util.Scanner;

public class NumerosPrimos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de números primos que desea obtener: ");
        int cantidad = scanner.nextInt();

        if (cantidad <= 0) {
            System.out.println("Ingrese un número positivo mayor que cero.");
        } else {
            int encontrados = 0;
            int numero = 2;  // Comenzamos desde el primer número primo

            System.out.println("Los " + cantidad + " primeros números primos son:");

            while (encontrados < cantidad) {
                if (esPrimo(numero)) {
                    System.out.print(numero + " ");
                    encontrados++;
                }
                numero++;
            }
        }

        scanner.close();
    }

    // Función para verificar si un número es primo
    public static boolean esPrimo(int n) {
        if (n <= 1) {
            return false;
        }
        if (n <= 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        int i = 5;
        while (i * i <= n) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
            i += 6;
        }
        return true;
    }
}
