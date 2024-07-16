import java.util.Scanner;

public class CalculadoraSumaAcumulada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        boolean continuar = true;
        
        System.out.println("Calculadora de suma acumulada de números enteros positivos.");
        
        do {
            System.out.print("Ingrese un número entero positivo: ");
            int numero = scanner.nextInt();
            
            if (numero > 0) {
                suma += numero; // acumular la suma
            } else {
                System.out.println("¡Error! Debe ingresar un número entero positivo.");
                continue; // vuelve al inicio del bucle para pedir otro número
            }
            
            // Preguntar si desea ingresar otro número
            System.out.print("¿Desea ingresar otro número? (Sí/No): ");
            String respuesta = scanner.next();
            
            if (!respuesta.equalsIgnoreCase("Sí") && !respuesta.equalsIgnoreCase("Si")) {
                continuar = false;
            }
            
        } while (continuar);
        
        System.out.println("La suma acumulada de los números ingresados es: " + suma);
        
        scanner.close();
    }
}
