// Archivo: Main.java
import java.util.Scanner;

public class MainRectangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nMenu:");
            System.out.println("1. Crear un Rectángulo");
            System.out.println("2. Mostrar el área de un Rectángulo");
            System.out.println("3. Mostrar el perímetro de un Rectángulo");
            System.out.println("4. Mostrar el número total de Rectángulos creados");
            System.out.println("5. Salir");
            System.out.print("Elija una opción: ");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // Crear un Rectángulo
                    System.out.print("Ingrese el ancho del rectángulo: ");
                    double ancho = scanner.nextDouble();
                    System.out.print("Ingrese el alto del rectángulo: ");
                    double alto = scanner.nextDouble();
                    Rectangulo rectangulo = new Rectangulo(ancho, alto);
                    System.out.println("Rectángulo creado con éxito.");
                    break;

                case 2:
                    // Mostrar el área de un Rectángulo
                    System.out.print("Ingrese el ancho del rectángulo: ");
                    ancho = scanner.nextDouble();
                    System.out.print("Ingrese el alto del rectángulo: ");
                    alto = scanner.nextDouble();
                    rectangulo = new Rectangulo(ancho, alto); // Crear una nueva instancia para mostrar el área
                    rectangulo.imprimirArea();
                    break;

                case 3:
                    // Mostrar el perímetro de un Rectángulo
                    System.out.print("Ingrese el ancho del rectángulo: ");
                    ancho = scanner.nextDouble();
                    System.out.print("Ingrese el alto del rectángulo: ");
                    alto = scanner.nextDouble();
                    rectangulo = new Rectangulo(ancho, alto); // Crear una nueva instancia para mostrar el perímetro
                    rectangulo.imprimirPerimetro();
                    break;

                case 4:
                    // Mostrar el número total de Rectángulos creados
                    System.out.println("Número total de rectángulos creados: " + Rectangulo.obtenerNumeroDeRectangulos());
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
