
import java.util.Scanner;

public class VerificaNumeroValido {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        try {
            

            System.out.println("Introduzca una cadena: ");
            String cadena = scanner.nextLine();

            System.out.println(Double.valueOf(cadena));

            
        } catch (Exception e) {
            System.out.println("La entrada no es un número válido.");
        }

        scanner.close();
    }
}
