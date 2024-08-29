import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();

        // Registrar algunas personas
        biblioteca.registrarPersona(new Persona("Juan", "Pérez"));
        biblioteca.registrarPersona(new Persona("Ana", "Gómez"));

        // Agregar algunos libros al catálogo
        biblioteca.agregarLibro(new Libro("1984", "George Orwell", 328));
        biblioteca.agregarLibro(new Libro("El Hobbit", "J.R.R. Tolkien", 310));

        while (true) {
            System.out.println("Menú:");
            System.out.println("1. Agregar libro");
            System.out.println("2. Mostrar catálogo de libros");
            System.out.println("3. Prestar libro");
            System.out.println("4. Devolver libro");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1 -> {
                    System.out.print("Ingrese el título del libro: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Ingrese el autor del libro: ");
                    String autor = scanner.nextLine();
                    System.out.print("Ingrese el número de páginas: ");
                    int numeroDePaginas = scanner.nextInt();
                    scanner.nextLine(); // Consumir el salto de línea

                    Libro libro = new Libro(titulo, autor, numeroDePaginas);
                    biblioteca.agregarLibro(libro);
                    System.out.println("Libro agregado exitosamente.");
                }

                case 2 -> {
                    System.out.println("Catálogo de libros:");
                    biblioteca.mostrarCatalogo();
                }

                case 3 -> {
                    System.out.print("Ingrese el nombre completo de la persona (nombre apellido): ");
                    String nombreCompleto = scanner.nextLine();
                    System.out.print("Ingrese el título del libro a prestar: ");
                    String tituloLibroPrestar = scanner.nextLine();
                    biblioteca.prestarLibro(nombreCompleto, tituloLibroPrestar);
                }

                case 4 -> {
                    System.out.print("Ingrese el nombre completo de la persona (nombre apellido): ");
                    String nombreCompletoDevolver = scanner.nextLine();
                    System.out.print("Ingrese el título del libro a devolver: ");
                    String tituloLibroDevolver = scanner.nextLine();
                    biblioteca.devolverLibro(nombreCompletoDevolver, tituloLibroDevolver);
                }

                case 5 -> {
                    System.out.println("Saliendo del programa.");
                    scanner.close();
                    return;
                }

                default -> System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }
}
