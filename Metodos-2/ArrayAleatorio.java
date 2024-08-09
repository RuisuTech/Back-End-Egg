import java.util.Scanner;

public class ArrayAleatorio {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Ingrese el tamaño del array:");
            int tamaño = sc.nextInt();
            System.out.println("Ingrese el valor mínimo del rango:");
            int minimo = sc.nextInt();
            System.out.println("Ingrese el valor máximo del rango:");
            int maximo = sc.nextInt();

            int[] array = generarArrayAleatorio(tamaño, minimo, maximo);
            System.out.println("Array generado:");
            imprimirArray(array);
        }
    }

    public static int[] generarArrayAleatorio(int tamaño, int min, int max) {
        int[] array = new int[tamaño];
        for (int i = 0; i < tamaño; i++) {
            array[i] = numeroAleatorio(min, max);
        }
        return array;
    }

    public static int numeroAleatorio(int min, int max) {
        return (int) Math.floor(Math.random() * (max - min + 1) + min);
    }

    public static void imprimirArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
