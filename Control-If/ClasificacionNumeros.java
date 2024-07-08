import java.util.Scanner;

public class ClasificacionNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario que ingrese un número
        System.out.println("Ingresa un número:");
        double numero = scanner.nextDouble();
        
        // Determinar si el número es positivo, negativo o cero
        if (numero > 0) {
            System.out.println("El número es positivo.");
        } else if (numero < 0) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es cero.");
        }
        
        // Cerrar el scanner
        scanner.close();
    }
}
