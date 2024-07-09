import java.util.Scanner;

public class LimiteAleatorio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Coloca un comienzo: ");
        double comienzo = scanner.nextDouble();

        System.out.println("Coloca un limite: ");
        double limite = scanner.nextDouble();
        
        double randomNum = comienzo + Math.random() * (limite - comienzo);

        double flooredNum = Math.floor(randomNum);

        System.out.println("El numero aleatorio dentro de ese limite es: " + flooredNum);

        scanner.close();
    }
}
