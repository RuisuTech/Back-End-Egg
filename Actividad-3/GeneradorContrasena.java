import java.util.Random;

public class GeneradorContrasena {

    public static void main(String[] args) {
        int longitud = 12;  // Longitud de la contraseña, puedes modificar esto según tus necesidades
        char[] contrasena = generarContrasena(longitud);
        String contrasenaString = new String(contrasena);
        System.out.println("Contraseña generada: " + contrasenaString);
    }

    public static char[] generarContrasena(int longitud) {
        // Definir conjunto de caracteres posibles para la contraseña
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        char[] contrasena = new char[longitud];
        Random random = new Random();

        // Inicializar variables para asegurar que hay al menos una mayúscula, una minúscula y un dígito
        boolean tieneMayuscula = false;
        boolean tieneMinuscula = false;
        boolean tieneDigito = false;

        do {
            for (int i = 0; i < longitud; i++) {
                char caracter = caracteres.charAt(random.nextInt(caracteres.length()));
                contrasena[i] = caracter;

                if (Character.isUpperCase(caracter)) {
                    tieneMayuscula = true;
                } else if (Character.isLowerCase(caracter)) {
                    tieneMinuscula = true;
                } else if (Character.isDigit(caracter)) {
                    tieneDigito = true;
                }
            }
        } while (!(tieneMayuscula && tieneMinuscula && tieneDigito));  // Repetir si falta alguna condición

        return contrasena;
    }
}
