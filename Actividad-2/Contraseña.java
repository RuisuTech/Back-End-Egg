import java.util.Scanner;

public class Contraseña {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su contraseña:");
        String contraseña = scanner.nextLine();

        if (esContraseñaSegura(contraseña)) {
            System.out.println("¡Contraseña segura! Cumple con todos los criterios.");
        } else {
            System.out.println("Contraseña no segura. Debe cumplir los siguientes criterios:");
            System.out.println("1. Debe tener al menos 8 caracteres.");
            System.out.println("2. Debe contener al menos una letra mayúscula y una letra minúscula.");
            System.out.println("3. Debe contener al menos un número.");
            System.out.println("4. Debe contener al menos un carácter especial (por ejemplo, !, @, #, $).");
        }

        scanner.close();
    }

    public static boolean esContraseñaSegura(String contraseña) {
        // Verificar longitud mínima de 8 caracteres
        if (contraseña.length() < 8) {
            return false;
        }

        // Verificar al menos una letra mayúscula y una letra minúscula
        if (!contraseña.matches(".*[A-Z].*") || !contraseña.matches(".*[a-z].*")) {
            return false;
        }

        // Verificar al menos un número
        if (!contraseña.matches(".*\\d.*")) {
            return false;
        }

        // Verificar al menos un carácter especial
        if (!contraseña.matches(".*[!@#$%^&*()\\[\\]{}|<>.,?/\\\\~_+=-].*")) {
            return false;
        }

        // Si pasa todas las validaciones, la contraseña es segura
        return true;
    }
}
