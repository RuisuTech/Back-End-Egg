import java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("Ingrese un número entero (0 para salir): ");
            int numero = scanner.nextInt();
            
            if (numero == 0) {
                System.out.println("Programa finalizado.");
                break;
            }
            
            System.out.println("Tabla de multiplicar de " + numero + ":");
            int multiplicador = 1;
            
            while (multiplicador <= 10) {
                System.out.println(numero + " x " + multiplicador + " = " + (numero * multiplicador));
                multiplicador++;
            }
            
            System.out.println(); // línea en blanco para separar las tablas
        }
        
        scanner.close();
    }
}
