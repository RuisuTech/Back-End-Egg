import java.util.Scanner;

public class DeterminacionEdades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario que ingrese su edad
        System.out.println("Ingresa tu edad:");
        int edad = scanner.nextInt();
        
        // Determinar la categoría de edad
        if (edad < 18) {
            System.out.println("Eres menor de edad");
        } else if (edad >= 18 && edad <= 64) {
            System.out.println("Eres adulto");
        } else {
            System.out.println("Eres un adulto mayor");
        }
        
        // Cerrar el scanner
        scanner.close();
    }
}
