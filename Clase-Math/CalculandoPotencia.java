import java.util.Scanner;

public class CalculandoPotencia {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Coloca el primer numero de base: ");
        double base = scanner.nextDouble();

        System.out.print("Coloca el segundo numero de exponente: ");
        double exponente = scanner.nextDouble();

        double resultado = Math.pow(base, exponente);

        System.out.println("La potencia del numero es: " + resultado);

        scanner.close();
    }
}
