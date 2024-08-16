// Archivo: Main.java
import java.util.Scanner;

public class MainAuto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Auto auto = new Auto(); // Inicializar con el constructor sin parámetros
        boolean running = true;

        while (running) {
            System.out.println("\nMenu:");
            System.out.println("1. Establecer Marca");
            System.out.println("2. Establecer Modelo");
            System.out.println("3. Establecer Año");
            System.out.println("4. Imprimir Datos");
            System.out.println("5. Salir");
            System.out.print("Elija una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la marca: ");
                    String marca = scanner.nextLine();
                    auto.setMarca(marca);
                    break;
                case 2:
                    System.out.print("Ingrese el modelo: ");
                    String modelo = scanner.nextLine();
                    auto.setModelo(modelo);
                    break;
                case 3:
                    System.out.print("Ingrese el año: ");
                    int año = scanner.nextInt();
                    scanner.nextLine(); // Consumir el salto de línea
                    auto.setAño(año);
                    break;
                case 4:
                    System.out.println("\nDatos del Auto:");
                    auto.imprimirDatos();
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    running = false;
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        }

        scanner.close();
    }
}
