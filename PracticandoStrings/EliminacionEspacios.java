import java.util.Scanner;

public class EliminacionEspacios {
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);
        
        System.out.println("Dame una frase con espaciado al inicio y al final: ");
        String frase = miScanner.nextLine();

        System.out.println(frase.trim());

        miScanner.close();
    }
}
