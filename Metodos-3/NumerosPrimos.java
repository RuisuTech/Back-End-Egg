import java.util.Scanner;

public class NumerosPrimos {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        
        do {
            System.out.print("Ingresa un número para verificar si es primo (ingresa 0 para salir): ");
            numero = scanner.nextInt();
            
            if (numero == 0) {
                break;
            }
            
            if (esPrimo(numero)) {
                System.out.println("El número " + numero + " es primo.");
            } else {
                System.out.println("El número " + numero + " no es primo. Intenta nuevamente.");
            }
            
        } while (numero != 0);
        
        System.out.println("Programa finalizado.");
    }
    
    public static boolean esPrimo(int n) {
        if (n <= 1) {
            return false;
        }
        
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        
        return true;
    }
}
