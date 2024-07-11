import java.util.Scanner;

public class SumarElementosPosicionesPares {
    public static void main(String[] args) {
        // Crear un array de tamaño 5 para almacenar números enteros
        int[] array = new int[5];

        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese los cinco elementos del array
        System.out.println("Ingresa cinco números enteros:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Cerrar el Scanner después de usarlo para liberar recursos
        scanner.close();

        // Sumar los elementos en posiciones pares del array (0, 2 y 4)
        int sumaPosicionesPares = array[0] + array[2] + array[4];

        // Mostrar el resultado por consola
        System.out.println("La suma de los elementos en posiciones pares es: " + sumaPosicionesPares);
    }
}
