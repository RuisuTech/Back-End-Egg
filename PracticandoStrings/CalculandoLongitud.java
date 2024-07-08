import java.util.Scanner;

public class CalculandoLongitud {
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);
        
        System.out.print("Dame una cadena de texto: ");
        String frase = miScanner.nextLine();

        String fras = frase.replace(" ", "");

        System.out.println(fras);

        System.out.println(fras.length());

        miScanner.close();
    }
}
