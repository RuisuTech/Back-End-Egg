import java.util.Scanner;

public class ReemplazoCaracter {
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);
        
        System.out.print("Dame una frase: ");
        String frase = miScanner.nextLine();

        System.out.print("Dame un caracter: ");
        String caracter1 = miScanner.nextLine();

        System.out.print("Dame un caracter: ");
        String caracter2 = miScanner.nextLine();

        System.out.println(frase.replace(caracter1, caracter2));

        miScanner.close();
    }
}
