import java.util.Scanner;

public class Fibonacci {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa la posición en la serie de Fibonacci: ");
        int posicion = scanner.nextInt();
        
        int resultado = calcularFibonacci(posicion);
        System.out.println("El valor en la posición " + posicion + " de la serie de Fibonacci es: " + resultado);
    }
    
    public static int calcularFibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return calcularFibonacci(n - 1) + calcularFibonacci(n - 2);
        }
    }
}
