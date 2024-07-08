import java.util.Scanner;

public class Operadores {
    public static void main(String[] args) {

        // Declaración y asignación de variables
        int a = 10;
        int b = 5;
        
        // Operaciones básicas con valores predeterminados
        int suma = a + b;
        int resta = a - b;
        int multiplicacion = a * b;
        int division = a / b;
        int modulo = a % b;
        
        // Mostrar resultados en consola
        System.out.println("Operaciones con valores predeterminados:");
        System.out.println("La suma de " + a + " y " + b + " es: " + suma);
        System.out.println("La resta de " + a + " y " + b + " es: " + resta);
        System.out.println("El producto de " + a + " y " + b + " es: " + multiplicacion);
        System.out.println("La división de " + a + " entre " + b + " es: " + division);
        System.out.println("El módulo de " + a + " entre " + b + " es: " + modulo);
        
        // Solicitar al usuario que ingrese dos números
        Scanner miScanner = new Scanner(System.in);

        System.out.println("Ingresa el primer número:");
        int num1 = miScanner.nextInt();
        System.out.println("Ingresa el segundo número:");
        int num2 = miScanner.nextInt();
        
        // Realizar la suma de los números ingresados por el usuario
        int sumaUsuario = num1 + num2;
        
        // Mostrar resultado de la suma en consola
        System.out.println("La suma de los números ingresados es: " + sumaUsuario);
        
        // Cerrar el scanner
        miScanner.close();
    }
}
