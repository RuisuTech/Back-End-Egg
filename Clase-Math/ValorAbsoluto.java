import java.util.Scanner;

public class ValorAbsoluto {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        System.out.print("Coloca un numero: ");
        int numero = scanner.nextInt();

        System.out.println("El valor absoluto de su numero es: " + Math.abs(numero));

        scanner.close();
    }
    
}