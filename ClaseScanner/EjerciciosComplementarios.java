import java.util.Scanner;

public class EjerciciosComplementarios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 1. Verificación de Edad
        final int ANIO_ACTUAL = 2024; // Declaración de constante para el año actual
        
        // Pedir al usuario que ingrese su año de nacimiento
        System.out.println("Ingresa tu año de nacimiento:");
        int añoNacimiento = scanner.nextInt();
        
        // Calcular la edad actual del usuario
        int calculoEdad = ANIO_ACTUAL - añoNacimiento;
        
        // Determinar si el usuario es mayor de edad (18 años o más)
        if (calculoEdad >= 18) {
            System.out.println("Eres mayor de edad.");
        } else {
            System.out.println("Eres menor de edad.");
        }
        
        // 2. Calculadora de Área y Perímetro de un Rectángulo
        System.out.println("Calculadora de Área y Perímetro de un Rectángulo");
        
        // Pedir al usuario que ingrese la base y la altura del rectángulo
        System.out.println("Ingresa la base del rectángulo:");
        double baseRectangulo = scanner.nextDouble();
        System.out.println("Ingresa la altura del rectángulo:");
        double alturaRectangulo = scanner.nextDouble();
        
        // Calcular el perímetro del rectángulo
        double perimetroRectangulo = 2 * baseRectangulo + 2 * alturaRectangulo;
        System.out.println("El perímetro del rectángulo es: " + perimetroRectangulo);
        
        // Calcular el área del rectángulo
        double areaRectangulo = baseRectangulo * alturaRectangulo;
        System.out.println("El área del rectángulo es: " + areaRectangulo);
        
        // Cerrar el scanner
        scanner.close();
    }
}
