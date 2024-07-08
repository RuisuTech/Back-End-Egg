import java.util.Scanner;

public class ComparacionCadenas {
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);
        
        System.out.print("Dame una palabra: ");
        String palabra1 = miScanner.nextLine();

        System.out.print("Dame una palabra: ");
        String palabra2 = miScanner.nextLine();

        System.out.println((palabra1.equals(palabra2)) ? "Si son iguales" : "No son iguales");

        miScanner.close();
    }
}
