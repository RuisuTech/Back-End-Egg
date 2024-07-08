import java.util.Scanner;

public class CalculadoraBasica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario que ingrese dos números
        System.out.println("Ingresa el primer número:");
        double num1 = scanner.nextDouble();
        System.out.println("Ingresa el segundo número:");
        double num2 = scanner.nextDouble();
        
        // Declarar una variable para almacenar el resultado de la operación
        double resultado = 0;
        
        // Solicitar al usuario que elija la operación a realizar
        System.out.println("Elige la operación que quieres realizar:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        
        int opcion = scanner.nextInt();
        
        // Realizar la operación seleccionada y almacenar el resultado
        switch (opcion) {
            case 1:
                resultado = num1 + num2;
                System.out.println("El resultado de la suma es: " + resultado);
                break;
            case 2:
                resultado = num1 - num2;
                System.out.println("El resultado de la resta es: " + resultado);
                break;
            case 3:
                resultado = num1 * num2;
                System.out.println("El resultado de la multiplicación es: " + resultado);
                break;
            case 4:
                // Verificar división por cero
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("El resultado de la división es: " + resultado);
                } else {
                    System.out.println("No se puede dividir entre cero.");
                }
                break;
            default:
                System.out.println("Opción inválida.");
        }
        
        // Cerrar el scanner
        scanner.close();
    }
}
