import java.util.Arrays;
import java.util.Scanner;

public class CopiarParteArreglo {

    public static void main(String[] args) {
        // Arreglo original de enteros
        int[] arregloOriginal = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        // Mostrar el arreglo original junto con sus índices
        System.out.println("Arreglo original:");
        mostrarArregloConIndices(arregloOriginal);

        try ( // Solicitar al usuario el índice inicial y el índice final
                Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese el índice inicial (0 a " + (arregloOriginal.length - 1) + "): ");
            int indiceInicial = scanner.nextInt();
            System.out.print("Ingrese el índice final (0 a " + (arregloOriginal.length - 1) + "): ");
            int indiceFinal = scanner.nextInt();
            
            // Validar que el índice inicial sea menor que el índice final
            if (indiceInicial >= indiceFinal || indiceInicial < 0 || indiceFinal >= arregloOriginal.length) {
                System.out.println("Índices incorrectos. Asegúrese de que el índice inicial sea menor que el índice final y ambos estén dentro del rango del arreglo.");
            } else {
                // Copiar la parte del arreglo original entre los índices inicial y final (inclusive)
                int[] arregloCopiado = Arrays.copyOfRange(arregloOriginal, indiceInicial, indiceFinal + 1);
                
                // Imprimir el nuevo arreglo copiado
                System.out.println("Nuevo arreglo copiado:");
                mostrarArregloConIndices(arregloCopiado);
            }
        }
    }

    // Método para mostrar un arreglo junto con sus índices
    public static void mostrarArregloConIndices(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Índice " + i + ": " + arreglo[i]);
        }
    }
}
