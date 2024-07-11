import java.util.Scanner;

public class EncontrarMaximoArray {
    public static void main(String[] args) {
        // Crear un array de enteros con cinco elementos
        int[] array = new int[5];

        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese los cinco elementos
        System.out.println("Ingresa cinco números enteros:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Cerrar el Scanner después de usarlo para liberar recursos
        scanner.close();

        // Encontrar el número máximo en el array
        int maximo = array[0]; // Suponemos que el primer elemento es el máximo inicialmente

        for (int i = 1; i < array.length; i++) {
            if (array[i] > maximo) {
                maximo = array[i];
            }
        }

        // Imprimir el número máximo por consola
        System.out.println("El número máximo en el array es: " + maximo);
    }
}
