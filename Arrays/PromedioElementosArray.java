import java.util.Scanner;

public class PromedioElementosArray {
    public static void main(String[] args) {
        // Crear un array de enteros con cuatro elementos
        int[] array = new int[4];

        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese los cuatro elementos
        System.out.println("Ingresa cuatro números enteros:");

        for (int i = 0; i < 4; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Cerrar el Scanner después de usarlo para liberar recursos
        scanner.close();

        // Calcular la suma de los elementos del array manualmente
        int suma = 0;
        for (int num : array) {
            suma += num;
        }

        // Calcular el promedio de los elementos del array
        double promedio = (double) suma / array.length;

        // Imprimir resultados por consola
        System.out.println("La suma de los elementos del array es: " + suma);
        System.out.println("El promedio de los elementos del array es: " + promedio);
    }
}
