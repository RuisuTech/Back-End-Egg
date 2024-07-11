import java.util.Scanner;

public class CopiarElementosArray {
    public static void main(String[] args) {
        // Crear un array de 3 enteros con valores predeterminados
        int[] arrayOriginal = {5, 10, 15};

        // Crear un nuevo array extendido con 5 elementos en total
        int[] arrayExtendido = new int[5];

        // Copiar los elementos del array original al array extendido
        arrayExtendido[0] = arrayOriginal[0];
        arrayExtendido[1] = arrayOriginal[1];
        arrayExtendido[2] = arrayOriginal[2];

        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese dos números
        System.out.print("Ingresa el primer número para añadir al array: ");
        int numero1 = scanner.nextInt();
        System.out.print("Ingresa el segundo número para añadir al array: ");
        int numero2 = scanner.nextInt();

        // Almacenar los números ingresados en las nuevas posiciones del array extendido
        arrayExtendido[3] = numero1;
        arrayExtendido[4] = numero2;

        // Cerrar el Scanner después de usarlo para liberar recursos
        scanner.close();

        // Mostrar el contenido del nuevo array por consola
        System.out.println("Contenido del nuevo array extendido:");
        for (int num : arrayExtendido) {
            System.out.println(num);
        }
    }
}
