import java.util.Scanner;

public class RestaConExcepcionesMejorada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingresa el primer número: ");
            double num1 = scanner.nextDouble();

            System.out.print("Ingresa el segundo número: ");
            double num2 = scanner.nextDouble();

            double resultado = num1 - num2;
            System.out.println("El resultado de la resta es: " + resultado);
        } catch (java.util.InputMismatchException e) {
            System.out.println("Error: Debes ingresar números válidos.");
        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
