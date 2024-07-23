import java.util.Scanner;

public class CalculoFactorial {

    public static void main(String[] args) {
        // Solicitar al usuario ingresar un número
        try (Scanner scanner = new Scanner(System.in)) {
            // Solicitar al usuario ingresar un número
            System.out.print("Ingrese un número para calcular su factorial: ");
            int numero = scanner.nextInt();
            
            // Validar que el número ingresado sea positivo
            if (numero < 0) {
                System.out.println("El factorial no está definido para números negativos.");
            } else {
                int factorial = 1;
                int contador = 1;
                
                // Calcular factorial usando un bucle do-while
                do {
                    factorial *= contador;
                    contador++;
                } while (contador <= numero);
                
                // Mostrar el resultado
                System.out.println("El factorial de " + numero + " es: " + factorial);
            }
        }
    }
}
