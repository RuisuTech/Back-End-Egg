import java.util.Scanner;

public class ExtraccionCadena {
    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);

        System.out.println("Dame una frase: ");
        String frase = miScanner.nextLine();

        System.out.println("Dame el primer numero: ");
        int numero1 = miScanner.nextInt();

        System.out.println("Dame el segundo numero: ");
        int numero2 = miScanner.nextInt();

        System.out.println("Primer indice: " + frase.charAt(numero1));   

        System.out.println("Ultimo indice: " + frase.charAt(numero2));   

        System.out.println("Subcadena: " + frase.substring(numero1, numero2));  

        miScanner.close();
    }
}
