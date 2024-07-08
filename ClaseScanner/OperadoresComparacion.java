import java.util.Scanner;

public class OperadoresComparacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 1. Comparaciones con los primeros dos números ingresados por el usuario
        System.out.println("Ingresa el primer número:");
        int num1 = scanner.nextInt();
        System.out.println("Ingresa el segundo número:");
        int num2 = scanner.nextInt();
        
        // A. Comparar si el primer número es mayor que el segundo
        boolean esMayor = num1 > num2;
        System.out.println("¿El primer número es mayor que el segundo? " + esMayor);
        
        // B. Verificar si el primer número es distinto al segundo
        boolean esDistinto = num1 != num2;
        System.out.println("¿El primer número es distinto al segundo? " + esDistinto);
        
        // C. Verificar si el primer número es divisible por 2
        boolean esDivisiblePorDos = num1 % 2 == 0;
        System.out.println("¿El primer número es divisible por 2? " + esDivisiblePorDos);
        
        // Limpiar el buffer del scanner
        scanner.nextLine();
        
        // 2. Validaciones con los siguientes dos números ingresados por el usuario
        System.out.println("Ingresa el tercer número:");
        int num3 = scanner.nextInt();
        System.out.println("Ingresa el cuarto número:");
        int num4 = scanner.nextInt();
        
        // A. Si el número 1 es mayor al número 2 y si el número 3 es mayor al número 4
        boolean condicionA = (num1 > num2) && (num3 > num4);
        System.out.println("¿El número 1 es mayor que el número 2 y el número 3 es mayor que el número 4? " + condicionA);
        
        // B. Si el número 1 es mayor al número 2 o si el número 3 es mayor al número 4
        boolean condicionB = (num1 > num2) || (num3 > num4);
        System.out.println("¿El número 1 es mayor que el número 2 o el número 3 es mayor que el número 4? " + condicionB);
        
        // Cerrar el scanner
        scanner.close();
    }
}
