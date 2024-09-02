import java.util.Scanner;

public class SaludoUsuario {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            // Llamada al método que solicita el nombre y lo saluda
            String nombre = obtenerNombre();
            System.out.println("Hola, " + nombre + "!");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            // Asegura el cierre del scanner
            scanner.close();
        }
    }

    public static String obtenerNombre() throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, ingresa tu nombre:");
        String nombre = scanner.nextLine();
        
        // Verifica si el nombre tiene menos de 2 caracteres
        if (nombre.length() < 2) {
            throw new Exception("El nombre debe tener al menos 2 caracteres.");
        }
        
        return nombre;
    }
}
