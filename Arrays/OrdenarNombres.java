import java.util.Scanner;

public class OrdenarNombres {
    public static void main(String[] args) {
        // Crear un array de tamaño 4 para almacenar los nombres
        String[] nombres = new String[4];

        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese los 4 nombres
        System.out.println("Ingresa cuatro nombres:");

        for (int i = 0; i < 4; i++) {
            System.out.print("Nombre " + (i + 1) + ": ");
            nombres[i] = scanner.nextLine();
        }

        // Cerrar el Scanner después de usarlo para liberar recursos
        scanner.close();

        // Ordenar los nombres alfabéticamente
        // Utilizaremos un método simple de intercambio para ordenar sin utilizar sort
        for (int i = 0; i < nombres.length - 1; i++) {
            for (int j = i + 1; j < nombres.length; j++) {
                if (nombres[i].compareToIgnoreCase(nombres[j]) > 0) {
                    // Intercambiar nombres[i] y nombres[j]
                    String temp = nombres[i];
                    nombres[i] = nombres[j];
                    nombres[j] = temp;
                }
            }
        }

        // Mostrar los nombres ordenados por consola
        System.out.println("Nombres ordenados alfabéticamente:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }
}
