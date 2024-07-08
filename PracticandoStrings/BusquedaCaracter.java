import java.util.Scanner;

public class BusquedaCaracter {
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);

        System.out.print("Dame una palabra: ");
        String palabra = miScanner.nextLine();

        System.out.print("Dame un caracter: ");
        String caracter = miScanner.nextLine();

        int texto = palabra.indexOf(caracter);

        System.out.println((texto >= 0) ? "Si esta" : "No esta");

        miScanner.close();
    }
}
