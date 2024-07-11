import java.util.Random;

public class ContarElementosPares {
    public static void main(String[] args) {
        // Crear un array de 6 elementos enteros
        int[] array = new int[6];

        // Llenar el array con números aleatorios entre 1 y 100 (inclusive)
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100) + 1; // Números aleatorios entre 1 y 100
        }

        // Contar la cantidad de elementos pares en el array
        int conteoPares = 0;
        for (int num : array) {
            if (num % 2 == 0) {
                conteoPares++;
            }
        }

        // Mostrar el resultado por consola
        System.out.println("El array generado es:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println(); // Salto de línea después de imprimir el array
        System.out.println("La cantidad de elementos pares en el array es: " + conteoPares);
    }
}
