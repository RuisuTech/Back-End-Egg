
import java.util.Scanner;

public class ContandoLosDigitosNumero {

    public static void main(String[] args) {
        // Solicitar al usuario que ingrese un número
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        int numero = scanner.nextInt();
        // Convertir el número en una cadena
        String cadenaNumero = String.valueOf(numero);
        // Contador para contar los dígitos en el número
        int conteoDigitos = 0;
        // Recorrer cada carácter en la cadena y contar los dígitos
        for (int i = 0; i < cadenaNumero.length(); i++) {
            char caracter = cadenaNumero.charAt(i);
            if (Character.isDigit(caracter)) {

                conteoDigitos++;
            }
        }
        // Mostrar el conteo al usuario
        System.out.println("El número de dígitos en el número es: "
                + conteoDigitos);

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
