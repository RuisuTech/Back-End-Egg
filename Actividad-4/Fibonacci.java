import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la posición de la serie de Fibonacci que desea calcular: ");
        int posicion = scanner.nextInt();

        // Validar que la posición sea válida (no negativa)
        if (posicion < 0) {
            System.out.println("La posición debe ser un número no negativo.");
        } else {
            // Calcular el valor de Fibonacci para la posición ingresada
            int resultado = fibonacci(posicion);
            System.out.println("El valor de Fibonacci en la posición " + posicion + " es: " + resultado);
        }

        scanner.close();
    }

    // Función para calcular el número de Fibonacci para una posición dada
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1 || n == 2) {
            return 1;
        } else {
            int a = 1, b = 1, c = 0;
            for (int i = 3; i <= n; i++) {
                c = a + b;
                a = b;
                b = c;
            }
            return c;
        }
    }
}
