import java.util.Arrays;
import java.util.Random;

public class OrdenDescendente {

    public static void main(String[] args) {
        // Declarar e inicializar el arreglo con valores aleatorios entre 1 y 100
        int[] arreglo = generarArregloAleatorio(10, 1, 100);

        // Imprimir el arreglo inicial
        System.out.println("Arreglo inicial:");
        imprimirArreglo(arreglo);

        // Ordenar el arreglo en forma descendente utilizando Arrays.sort()
        Arrays.sort(arreglo);
        invertirArreglo(arreglo);

        // Imprimir el arreglo ordenado en forma descendente
        System.out.println("\nArreglo ordenado en forma descendente:");
        imprimirArreglo(arreglo);
    }

    // Método para generar un arreglo de tamaño n con números aleatorios entre min y max
    public static int[] generarArregloAleatorio(int n, int min, int max) {
        int[] arreglo = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            arreglo[i] = random.nextInt(max - min + 1) + min;
        }
        return arreglo;
    }

    // Método para imprimir un arreglo de enteros
    public static void imprimirArreglo(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();
    }

    // Método para invertir el orden de los elementos de un arreglo
    public static void invertirArreglo(int[] arreglo) {
        int left = 0;
        int right = arreglo.length - 1;

        while (left < right) {
            // Intercambiar los elementos en las posiciones left y right
            int temp = arreglo[left];
            arreglo[left] = arreglo[right];
            arreglo[right] = temp;

            // Mover los índices hacia el centro
            left++;
            right--;
        }
    }
}
