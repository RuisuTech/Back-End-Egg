import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class OrdenDeMerito {
    public static void main(String[] args) {
        // Crear un ArrayList para almacenar las notas
        ArrayList<Integer> notas = new ArrayList<>();

        try ( // Crear un objeto Scanner para leer la entrada del usuario
                Scanner scanner = new Scanner(System.in)) {
            String continuar = "sí";
            // Bucle para permitir al usuario ingresar notas
            while (continuar.equalsIgnoreCase("sí")) {
                // Solicitar al usuario que ingrese una nota
                System.out.print("Ingrese una nota (entre 1 y 10): ");
                int nota = scanner.nextInt();

                // Verificar que la nota esté en el rango permitido
                if (nota >= 1 && nota <= 10) {
                    // Agregar la nota al ArrayList
                    notas.add(nota);
                } else {
                    // Informar al usuario que la nota está fuera de rango
                    System.out.println("Nota inválida. Debe estar entre 1 y 10.");
                }

                // Limpiar el buffer del scanner
                scanner.nextLine();

                // Preguntar al usuario si desea ingresar otra nota
                System.out.print("¿Desea agregar otra nota? (sí/no): ");
                continuar = scanner.nextLine();
            } // Ordenar la lista en orden ascendente
            Collections.sort(notas);
            // Mostrar la lista en orden ascendente
            System.out.println("\nNotas en orden ascendente:");
            for (int nota : notas) {
                System.out.println(nota);
            } // Ordenar la lista en orden descendente
            Collections.sort(notas, Collections.reverseOrder());
            // Mostrar la lista en orden descendente
            System.out.println("\nNotas en orden descendente:");
            for (int nota : notas) {
                System.out.println(nota);
            }
            // Cerrar el scanner
        }
    }
}
