import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingresa el primer número: ");
            double num1 = scanner.nextDouble();
            
            System.out.print("Ingresa el segundo número: ");
            double num2 = scanner.nextDouble();
            
            try {
                double resultado = dividir(num1, num2);
                System.out.println("Resultado: " + resultado);
            } catch (ArithmeticException e) {
                System.out.println("Error: División por cero no permitida.");
                e.printStackTrace(); // Esto imprimirá el stack trace
            }
        }
    }

    public static double dividir(double a, double b) {
        return a / b; // Aquí es donde ocurrirá la división por cero
    }
}
