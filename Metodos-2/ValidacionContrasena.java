public class ValidacionContrasena {

    public static void main(String[] args) {
        String contrasena = "Ejemplo1@";
        if (esSegura(contrasena)) {
            System.out.println("La contraseña es segura.");
        } else {
            System.out.println("La contraseña no es segura.");
        }
    }

    public static boolean esSegura(String contrasena) {
        return tieneLongitudCorrecta(contrasena) && 
               tieneMayuscula(contrasena) && 
               tieneMinuscula(contrasena) && 
               tieneNumero(contrasena) && 
               tieneCaracterEspecial(contrasena);
    }

    public static boolean tieneLongitudCorrecta(String contrasena) {
        return contrasena.length() >= 8;
    }

    public static boolean tieneMayuscula(String contrasena) {
        for (char c : contrasena.toCharArray()) {
            if (Character.isUpperCase(c)) {
                return true;
            }
        }
        return false;
    }

    public static boolean tieneMinuscula(String contrasena) {
        for (char c : contrasena.toCharArray()) {
            if (Character.isLowerCase(c)) {
                return true;
            }
        }
        return false;
    }

    public static boolean tieneNumero(String contrasena) {
        for (char c : contrasena.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }

    public static boolean tieneCaracterEspecial(String contrasena) {
        String caracteresEspeciales = "!@#$%^&*()-_+=<>?";
        for (char c : contrasena.toCharArray()) {
            if (caracteresEspeciales.contains(Character.toString(c))) {
                return true;
            }
        }
        return false;
    }
}
