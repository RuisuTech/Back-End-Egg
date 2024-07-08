import java.util.Scanner;

public class Calificacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario que ingrese un número entre 0 y 100
        System.out.println("Ingresa un número entre 0 y 100:");
        int numero = scanner.nextInt();
        
        // Validar si el número está dentro del rango especificado
        if (numero >= 0 && numero <= 100) {
            // Determinar la calificación según el rango
            if (numero >= 90 && numero <= 100) {
                System.out.println("Calificación obtenida: A");
            } else if (numero >= 80 && numero <= 89) {
                System.out.println("Calificación obtenida: B");
            } else if (numero >= 70 && numero <= 79) {
                System.out.println("Calificación obtenida: C");
            } else if (numero >= 60 && numero <= 69) {
                System.out.println("Calificación obtenida: D");
            } else {
                System.out.println("Calificación obtenida: F");
            }
        } else {
            // Informar al usuario que el número está fuera del rango válido
            System.out.println("El número ingresado está fuera del rango válido (0 a 100).");
        }
        
        // Cerrar el scanner
        scanner.close();
    }
}
