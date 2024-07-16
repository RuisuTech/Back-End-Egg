import java.util.Scanner;

public class MenuInteractivo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            mostrarMenu();
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Has elegido: 1.");
                    break;
                case 2:
                    System.out.println("Has elegido: 2.");
                    break;
                case 3:
                    System.out.println("Has elegido: 3.");
                    break;
                case 4:
                    System.out.println("Has elegido: 4.");
                    break;
                case 5:
                    System.out.println("Has elegido: 5.");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, elige una opción del 1 al 5.");
                    break;
            }

            System.out.println(); // Salto de línea para separar cada iteración del menú
        } while (opcion != 5);

        System.out.println("¡Hasta luego!");
        scanner.close();
    }

    public static void mostrarMenu() {
        System.out.println("======= MENÚ =======");
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
        System.out.println("5");
        System.out.println("====================");
    }
}
