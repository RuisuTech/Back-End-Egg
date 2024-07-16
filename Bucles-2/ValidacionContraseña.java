import java.util.Scanner;

public class ValidacionContraseña {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String contraseñaCorrecta = "secreto";
        String contraseñaIngresada;

        System.out.println("=== Validación de Contraseña ===");

        // Ciclo while para validar la contraseña
        while (true) {
            System.out.print("Ingresa la contraseña: ");
            contraseñaIngresada = scanner.nextLine();

            if (contraseñaIngresada.equals(contraseñaCorrecta)) {
                System.out.println("¡Contraseña correcta! Bienvenido.");
                break; // Sale del bucle while cuando la contraseña es correcta
            } else {
                System.out.println("Contraseña incorrecta. Inténtalo nuevamente.");
            }
        }

        scanner.close();
    }
}
