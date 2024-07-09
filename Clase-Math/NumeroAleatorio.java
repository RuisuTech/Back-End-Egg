import java.util.Scanner;

public class NumeroAleatorio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double randomNum = Math.random() * 365.0; // Genera un número aleatorio entre 0.0 y 365.0

        double flooredNum = Math.floor(randomNum);

        System.out.println("El numero aleatorio del dia es: " + flooredNum);

        scanner.close();
    }
    
}
