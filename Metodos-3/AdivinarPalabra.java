import java.util.Random;
import java.util.Scanner;

public class AdivinarPalabra {

    public static void main(String[] args) {
        // Lista predefinida de palabras
        String[] palabras = {"casa", "programacion", "java", "teclado", "pantalla"};
        
        // Seleccionar una palabra aleatoria
        Random random = new Random();
        String palabraSeleccionada = palabras[random.nextInt(palabras.length)];

        // Variables del juego
        int intentos = 6;
        char[] pista = new char[palabraSeleccionada.length()];
        for (int i = 0; i < pista.length; i++) {
            pista[i] = '_';
        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("¡Bienvenido al juego de adivinar la palabra!");
        System.out.println("Tienes " + intentos + " intentos para adivinar la palabra.");
        System.out.println("Pista: " + String.valueOf(pista));

        // Bucle principal del juego
        while (intentos > 0 && String.valueOf(pista).contains("_")) {
            System.out.print("\nIngresa una letra: ");
            char letra = scanner.nextLine().toLowerCase().charAt(0);

            if (comprobarLetra(palabraSeleccionada, letra, pista)) {
                System.out.println("¡Correcto! " + String.valueOf(pista));
            } else {
                intentos--;
                System.out.println("Letra incorrecta. Te quedan " + intentos + " intentos.");
            }
        }

        // Mensaje final del juego
        if (String.valueOf(pista).equals(palabraSeleccionada)) {
            System.out.println("¡Felicidades! Adivinaste la palabra: " + palabraSeleccionada);
        } else {
            System.out.println("Se te acabaron los intentos. La palabra era: " + palabraSeleccionada);
        }
    }

    // Método para comprobar si la letra está en la palabra y en qué posiciones
    public static boolean comprobarLetra(String palabra, char letra, char[] pista) {
        boolean acierto = false;
        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) == letra) {
                pista[i] = letra;
                acierto = true;
            }
        }
        return acierto;
    }
}
