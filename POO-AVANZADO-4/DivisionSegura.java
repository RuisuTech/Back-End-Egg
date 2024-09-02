import java.util.Scanner;

public class DivisionSegura {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.println("Ingrese el numerador (debe ser distinto de 0):");
            int numerador = obtenerNumerador();
            
            System.out.println("Ingrese el denominador (debe ser distinto de 0):");
            int denominador = obtenerNumerador();
            
            if (denominador == 0) {
                throw new ArithmeticException("El denominador no puede ser 0.");
            }
            
            double resultado = (double) numerador / denominador;
            System.out.println("Resultado de la división: " + resultado);
            
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        scanner.close();
    }
    
    public static int obtenerNumerador() throws ArithmeticException {
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        
        if (numero == 0) {
            throw new ArithmeticException("El número ingresado no puede ser 0.");
        }
        
        return numero;
    }
}
