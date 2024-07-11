import java.util.Scanner;

public class BuscarElementoArray {
    public static void main(String[] args) {
        // Crear un array de tamaño 3 para almacenar números enteros
        int[] array = new int[3];

        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese los tres elementos del array
        System.out.println("Ingresa tres números enteros:");

        for (int i = 0; i < 3; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Pedir al usuario que ingrese un número para buscar en el array
        System.out.print("Ingresa un número para buscar en el array: ");
        int numeroBuscar = scanner.nextInt();

        // Cerrar el Scanner después de usarlo para liberar recursos
        scanner.close();

        // Verificar si el número está presente en el array
        boolean encontrado = false;
        for (int num : array) {
            if (num == numeroBuscar) {
                encontrado = true;
                break;
            }
        }

        // Imprimir resultado por consola
        if (encontrado) {
            System.out.println("El número " + numeroBuscar + " está presente en el array.");
        } else {
            System.out.println("El número " + numeroBuscar + " no está presente en el array.");
        }
    }
}
