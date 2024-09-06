import java.util.HashSet;
import java.util.Scanner;

public class RegistroDeInvitados {
    private final HashSet<String> invitados;

    public RegistroDeInvitados() {
        invitados = new HashSet<>();
    }

    // Método para agregar un invitado
    public void agregarInvitado(String nombre) {
        if (invitados.add(nombre)) {
            System.out.println(nombre + " ha sido agregado a la lista.");
        } else {
            System.out.println(nombre + " ya está en la lista.");
        }
    }

    // Método para eliminar un invitado
    public void eliminarInvitado(String nombre) {
        if (invitados.remove(nombre)) {
            System.out.println(nombre + " ha sido eliminado de la lista.");
        } else {
            System.out.println(nombre + " no está en la lista.");
        }
    }

    // Método para mostrar la lista de invitados
    public void mostrarInvitados() {
        if (invitados.isEmpty()) {
            System.out.println("La lista de invitados está vacía.");
        } else {
            System.out.println("Lista de invitados:");
            for (String invitado : invitados) {
                System.out.println("- " + invitado);
            }
        }
    }

    public static void main(String[] args) {
        RegistroDeInvitados registro = new RegistroDeInvitados();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenú:");
            System.out.println("1. Agregar invitado");
            System.out.println("2. Eliminar invitado");
            System.out.println("3. Mostrar lista de invitados");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1 -> {
                    System.out.print("Ingrese el nombre del invitado a agregar: ");
                    String nombreAgregar = scanner.nextLine();
                    registro.agregarInvitado(nombreAgregar);
                }
                case 2 -> {
                    System.out.print("Ingrese el nombre del invitado a eliminar: ");
                    String nombreEliminar = scanner.nextLine();
                    registro.eliminarInvitado(nombreEliminar);
                }
                case 3 -> registro.mostrarInvitados();
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
