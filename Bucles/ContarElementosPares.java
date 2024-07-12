import java.util.Random;

public class ContarElementosPares {

    public static void main(String[] args) {
        // Paso 1: Crear el array de 10 elementos con números aleatorios menores a 100
        int[] numeros = new int[10];
        Random rand = new Random();

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rand.nextInt(100); // Números aleatorios entre 0 y 99
        }

        // Paso 2: Imprimir todos los elementos del array en una sola línea
        System.out.print("Elementos del array: ");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
        System.out.println(); // Nueva línea después de imprimir los elementos

        // Paso 3: Contar los elementos pares
        int contadorPares = 0;

        for (int num : numeros) {
            if (num % 2 == 0) {
                contadorPares++;
            }
        }

        // Mostrar el total de elementos pares
        System.out.println("Total de elementos pares: " + contadorPares);
    }
}
