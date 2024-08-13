import java.util.Scanner;

public class Factorial {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa un número para calcular su factorial: ");
        int numero = scanner.nextInt();
        
        int resultado = factorial(numero);
        System.out.println("El factorial de " + numero + " es: " + resultado);
    }
    
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
