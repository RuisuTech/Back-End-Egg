import java.util.Arrays;
import java.util.Scanner;

public class RellenarArreglo {

    public static void main(String[] args) {
        // Solicitar al usuario el tamaño del arreglo
        try (Scanner scanner = new Scanner(System.in)) {
            // Solicitar al usuario el tamaño del arreglo
            System.out.print("Ingrese el tamaño del arreglo: ");
            int tamaño = scanner.nextInt();
            
            // Solicitar al usuario el número entero con el que quiere rellenar el arreglo
            System.out.print("Ingrese el número entero con el que quiere rellenar el arreglo: ");
            int numeroRelleno = scanner.nextInt();
            
            // Crear un arreglo de tamaño proporcionado por el usuario
            int[] arreglo = new int[tamaño];
            
            // Rellenar el arreglo con el número entero utilizando Arrays.fill()
            Arrays.fill(arreglo, numeroRelleno);
            
            // Imprimir el arreglo resultante
            System.out.println("Arreglo rellenado:");
            for (int i = 0; i < arreglo.length; i++) {
                System.out.println("Índice " + i + ": " + arreglo[i]);
            }
        }
    }
}
