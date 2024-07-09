import java.util.Scanner;

public class RaizCuadrada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Coloca un numero positivo: ");
        double numero = scanner.nextDouble();

        double resultado = Math.sqrt(numero);

        System.out.println("La raiz cuadrada del numero es: " + resultado);

        scanner.close();
    }
}
