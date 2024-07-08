import java.util.Scanner;

public class Divisibilidad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario que ingrese un número
        System.out.println("Ingresa un número:");
        int numero = scanner.nextInt();
        
        // Determinar si el número es divisible por 5, por 3, por ambos o por ninguno
        boolean divisiblePor5 = numero % 5 == 0;
        boolean divisiblePor3 = numero % 3 == 0;
        
        if (divisiblePor5 && divisiblePor3) {
            System.out.println("El número " + numero + " es divisible por 5 y por 3.");
        } else if (divisiblePor5) {
            System.out.println("El número " + numero + " es divisible por 5 pero no por 3.");
        } else if (divisiblePor3) {
            System.out.println("El número " + numero + " es divisible por 3 pero no por 5.");
        } else {
            System.out.println("El número " + numero + " no es divisible ni por 5 ni por 3.");
        }
        
        // Cerrar el scanner
        scanner.close();
    }
}
