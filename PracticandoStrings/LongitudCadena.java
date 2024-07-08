import java.util.Scanner;

public class LongitudCadena {
    public static void main(String[] args) {

        Scanner miScanner = new Scanner(System.in);

        System.out.print("Coloca una palabra: ");
        String palabra = miScanner.nextLine();

        System.out.println("Longitud de palabra: " + palabra.length());

        miScanner.close();
    }

}