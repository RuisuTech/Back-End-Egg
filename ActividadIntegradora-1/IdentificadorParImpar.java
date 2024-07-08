import java.util.Scanner;

public class IdentificadorParImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario que ingrese un número
        System.out.println("Ingresa un número entero:");
        int numero = scanner.nextInt();
        
        // Determinar si el número ingresado es par o impar utilizando el operador ternario
        String resultado = (numero % 2 == 0) ? "El número es par." : "El número es impar.";
        
        // Mostrar el resultado en la consola
        System.out.println(resultado);
        
        // Cerrar el scanner
        scanner.close();
    }
}
