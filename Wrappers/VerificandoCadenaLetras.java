
import java.util.Scanner;

public class VerificandoCadenaLetras {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca una cadena: ");
        String cadena = scanner.nextLine();

        boolean soloLetras = true;

        // Recorremos cada caracter de la cadena
        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);

            // Verificamos si el caracter no es una letra
            if (!Character.isLetter(caracter)) {
                soloLetras = false;
                break;  // Si encontramos un no-letra, salimos del bucle
            }
        }

        // Mostramos el resultado
        if (soloLetras) {
            System.out.println("La cadena contiene solo letras.");
        } else {
            System.out.println("La cadena NO contiene solo letras.");
        }

        scanner.close();
    }
}
