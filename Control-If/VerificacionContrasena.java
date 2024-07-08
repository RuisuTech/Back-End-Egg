import java.util.Scanner;

public class VerificacionContrasena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Contraseña predefinida
        String contrasenaPredefinida = "password123";
        
        // Solicitar al usuario que ingrese la contraseña
        System.out.println("Ingresa la contraseña:");
        String contrasenaIngresada = scanner.nextLine();
        
        // Verificar si la contraseña ingresada coincide con la predefinida
        if (contrasenaIngresada.equals(contrasenaPredefinida)) {
            System.out.println("Acceso concedido");
        } else {
            System.out.println("Acceso denegado");
        }
        
        // Cerrar el scanner
        scanner.close();
    }
}
