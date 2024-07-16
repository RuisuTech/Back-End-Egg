import java.util.Scanner;

public class ContadorParesImpares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contadorPares = 0;
        int contadorImpares = 0;
        
        System.out.println("Ingrese una serie de números enteros (ingrese 0 para terminar):");
        
        while (true) {
            System.out.print("Ingrese un número entero (0 para terminar): ");
            int numero = scanner.nextInt();
            
            if (numero == 0) {
                break; // salir del bucle si se ingresa 0
            }
            
            if (numero % 2 == 0) {
                contadorPares++;
            } else {
                contadorImpares++;
            }
        }
        
        System.out.println("Cantidad de números pares ingresados: " + contadorPares);
        System.out.println("Cantidad de números impares ingresados: " + contadorImpares);
        
        scanner.close();
    }
}
