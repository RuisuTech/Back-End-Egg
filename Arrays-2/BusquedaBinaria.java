import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BusquedaBinaria {

    public static void main(String[] args) {
        // Generar un arreglo ordenado de enteros aleatorios
        int[] arreglo = generarArregloOrdenado(10, 1, 100);

        // Imprimir el arreglo generado
        System.out.println("Arreglo generado:");
        imprimirArreglo(arreglo);

        try ( // Solicitar al usuario el valor a buscar
                Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese el valor a buscar en el arreglo: ");
            int valorBuscado = scanner.nextInt();
            
            // Realizar la búsqueda binaria utilizando Arrays.binarySearch()
            int indice = Arrays.binarySearch(arreglo, valorBuscado);
            
            // Verificar si se encontró el valor y mostrar el resultado
            if (indice >= 0) {
                System.out.println("El valor " + valorBuscado + " está en el índice " + indice + " del arreglo.");
            } else {
                System.out.println("El valor " + valorBuscado + " no se encontró en el arreglo.");
            }
        }
    }

    // Método para generar un arreglo de tamaño n con números aleatorios entre min y max, ordenados
    public static int[] generarArregloOrdenado(int n, int min, int max) {
        int[] arreglo = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            arreglo[i] = random.nextInt(max - min + 1) + min;
        }
        Arrays.sort(arreglo); // Ordenar el arreglo
        return arreglo;
    }

    // Método para imprimir un arreglo de enteros
    public static void imprimirArreglo(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();
    }
}
