import java.util.Scanner;

public class DivisionSeguraMejorada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingresa el primer número entero: ");
            int num1 = scanner.nextInt();

            System.out.print("Ingresa el segundo número entero: ");
            int num2 = scanner.nextInt();

            try {
                int resultado = num1 / num2;
                System.out.println("El resultado de la división es: " + resultado);
            } catch (ArithmeticException e) {
                System.out.println("Error: No se puede dividir entre cero.");
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("Error: Debes ingresar números enteros válidos.");
        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
