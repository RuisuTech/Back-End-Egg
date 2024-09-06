import java.util.Scanner;

public class GestionCatalogoLibreria {

    public static void main(String[] args) {
        Libreria libreria = new Libreria();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenú:");
            System.out.println("1. Agregar libro");
            System.out.println("2. Eliminar libro");
            System.out.println("3. Mostrar catálogo");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1 -> {
                    System.out.print("Ingrese el título del libro: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Ingrese el autor del libro: ");
                    String autor = scanner.nextLine();
                    System.out.print("Ingrese el número de ISBN del libro: ");
                    String isbn = scanner.nextLine();
                    Libro libro = new Libro(titulo, autor, isbn);
                    libreria.agregarLibro(libro);
                }
                case 2 -> {
                    System.out.print("Ingrese el número de ISBN del libro a eliminar: ");
                    String isbnEliminar = scanner.nextLine();
                    libreria.eliminarLibro(isbnEliminar);
                }
                case 3 -> libreria.mostrarCatalogo();
                case 4 -> {
                    System.out.println("Saliendo del programa.");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        }
    }
}
