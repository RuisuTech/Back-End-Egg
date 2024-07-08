import java.util.Scanner;

public class ConversionPalabra {
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);

        System.out.print("Dame una cadena de texto: ");
        String cadena = miScanner.nextLine();
        
        System.out.println(cadena.toUpperCase());
        System.out.println(cadena.toLowerCase());

        miScanner.close();
    }
}
