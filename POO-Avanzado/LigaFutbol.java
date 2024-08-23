import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LigaFutbol {
    private static List<Jugador> jugadores = new ArrayList<>();
    private static List<Equipo> equipos = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean salir = false;

        while (!salir) {
            System.out.println("\nMenu:");
            System.out.println("1. Crear jugador");
            System.out.println("2. Crear equipo");
            System.out.println("3. Asignar jugador a equipo");
            System.out.println("4. Mostrar lista de jugadores");
            System.out.println("5. Mostrar lista de equipos");
            System.out.println("6. Eliminar jugador");
            System.out.println("7. Eliminar equipo");
            System.out.println("8. Seleccionar jugador");
            System.out.println("9. Seleccionar equipo");
            System.out.println("10. Salir");
            System.out.print("Selecciona una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    crearJugador();
                    break;
                case 2:
                    crearEquipo();
                    break;
                case 3:
                    asignarJugadorAEquipo();
                    break;
                case 4:
                    mostrarJugadores();
                    break;
                case 5:
                    mostrarEquipos();
                    break;
                case 6:
                    eliminarJugador();
                    break;
                case 7:
                    eliminarEquipo();
                    break;
                case 8:
                    seleccionarJugador();
                    break;
                case 9:
                    seleccionarEquipo();
                    break;
                case 10:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
                    break;
            }
        }
        scanner.close();
    }

    private static void crearJugador() {
        System.out.print("Introduce el nombre del jugador: ");
        String nombre = scanner.nextLine();

        if (equipos.isEmpty()) {
            System.out.println("No hay equipos disponibles. El jugador se creará sin equipo.");
            jugadores.add(new Jugador(nombre, null));
        } else {
            mostrarEquipos();
            System.out.print("Selecciona el equipo para el jugador (introduce el nombre del equipo): ");
            String nombreEquipo = scanner.nextLine();
            Equipo equipoSeleccionado = equipos.stream()
                                               .filter(e -> e.getNombre().equalsIgnoreCase(nombreEquipo))
                                               .findFirst()
                                               .orElse(null);

            jugadores.add(new Jugador(nombre, equipoSeleccionado));
        }
    }

    private static void crearEquipo() {
        System.out.print("Introduce el nombre del equipo: ");
        String nombre = scanner.nextLine();
        equipos.add(new Equipo(nombre));
    }

    private static void asignarJugadorAEquipo() {
        if (jugadores.isEmpty() || equipos.isEmpty()) {
            System.out.println("No hay jugadores o equipos disponibles.");
            return;
        }

        mostrarJugadores();
        System.out.print("Selecciona el nombre del jugador para asignar (introduce el nombre): ");
        String nombreJugador = scanner.nextLine();
        Jugador jugadorSeleccionado = jugadores.stream()
                                               .filter(j -> j.getNombre().equalsIgnoreCase(nombreJugador))
                                               .findFirst()
                                               .orElse(null);

        if (jugadorSeleccionado == null) {
            System.out.println("Jugador no encontrado.");
            return;
        }

        mostrarEquipos();
        System.out.print("Selecciona el nombre del equipo (introduce el nombre del equipo): ");
        String nombreEquipo = scanner.nextLine();
        Equipo equipoSeleccionado = equipos.stream()
                                           .filter(e -> e.getNombre().equalsIgnoreCase(nombreEquipo))
                                           .findFirst()
                                           .orElse(null);

        if (equipoSeleccionado == null) {
            System.out.println("Equipo no encontrado.");
            return;
        }

        jugadorSeleccionado.setEquipo(equipoSeleccionado);
    }

    private static void mostrarJugadores() {
        System.out.println("\nLista de jugadores:");
        if (jugadores.isEmpty()) {
            System.out.println("No hay jugadores.");
        } else {
            jugadores.forEach(System.out::println);
        }
    }

    private static void mostrarEquipos() {
        System.out.println("\nLista de equipos:");
        if (equipos.isEmpty()) {
            System.out.println("No hay equipos.");
        } else {
            equipos.forEach(System.out::println);
        }
    }

    private static void eliminarJugador() {
        if (jugadores.isEmpty()) {
            System.out.println("No hay jugadores disponibles.");
            return;
        }

        mostrarJugadores();
        System.out.print("Introduce el nombre del jugador a eliminar: ");
        String nombre = scanner.nextLine();
        Jugador jugadorAEliminar = jugadores.stream()
                                            .filter(j -> j.getNombre().equalsIgnoreCase(nombre))
                                            .findFirst()
                                            .orElse(null);

        if (jugadorAEliminar == null) {
            System.out.println("Jugador no encontrado.");
            return;
        }

        jugadores.remove(jugadorAEliminar);
        System.out.println("Jugador eliminado.");
    }

    private static void eliminarEquipo() {
        if (equipos.isEmpty()) {
            System.out.println("No hay equipos disponibles.");
            return;
        }

        mostrarEquipos();
        System.out.print("Introduce el nombre del equipo a eliminar: ");
        String nombre = scanner.nextLine();
        Equipo equipoAEliminar = equipos.stream()
                                        .filter(e -> e.getNombre().equalsIgnoreCase(nombre))
                                        .findFirst()
                                        .orElse(null);

        if (equipoAEliminar == null) {
            System.out.println("Equipo no encontrado.");
            return;
        }

        equipos.remove(equipoAEliminar);

        // Eliminar la referencia a este equipo de todos los jugadores
        for (Jugador jugador : jugadores) {
            if (jugador.getEquipo() != null && jugador.getEquipo().equals(equipoAEliminar)) {
                jugador.setEquipo(null);
            }
        }

        System.out.println("Equipo eliminado.");
    }

    private static void seleccionarJugador() {
        if (jugadores.isEmpty()) {
            System.out.println("No hay jugadores disponibles.");
            return;
        }

        mostrarJugadores();
        System.out.print("Introduce el nombre del jugador a seleccionar: ");
        String nombre = scanner.nextLine();
        Jugador jugadorSeleccionado = jugadores.stream()
                                               .filter(j -> j.getNombre().equalsIgnoreCase(nombre))
                                               .findFirst()
                                               .orElse(null);

        if (jugadorSeleccionado == null) {
            System.out.println("Jugador no encontrado.");
            return;
        }

        boolean volver = false;

        while (!volver) {
            System.out.println("\nSubmenú de jugador:");
            System.out.println("1. Ver detalles");
            System.out.println("2. Cambiar nombre");
            System.out.println("3. Cambiar equipo");
            System.out.println("4. Regresar al menú principal");
            System.out.print("Selecciona una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    System.out.println("Detalles del jugador:");
                    System.out.println(jugadorSeleccionado);
                    break;
                case 2:
                    System.out.print("Introduce el nuevo nombre del jugador: ");
                    String nuevoNombre = scanner.nextLine();
                    // Actualizar el nombre del jugador
                    jugadorSeleccionado = new Jugador(nuevoNombre, jugadorSeleccionado.getEquipo());
                    jugadores.removeIf(j -> j.getNombre().equalsIgnoreCase(nombre));
                    jugadores.add(jugadorSeleccionado);
                    System.out.println("Nombre cambiado.");
                    break;
                case 3:
                    mostrarEquipos();
                    System.out.print("Selecciona el nombre del nuevo equipo (introduce el nombre del equipo): ");
                    String nombreEquipo = scanner.nextLine();
                    Equipo equipoSeleccionado = equipos.stream()
                                                       .filter(e -> e.getNombre().equalsIgnoreCase(nombreEquipo))
                                                       .findFirst()
                                                       .orElse(null);

                    if (equipoSeleccionado == null) {
                        System.out.println("Equipo no encontrado.");
                        break;
                    }

                    jugadorSeleccionado.setEquipo(equipoSeleccionado);
                    System.out.println("Equipo cambiado.");
                    break;
                case 4:
                    volver = true;
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
                    break;
            }
        }
    }

    private static void seleccionarEquipo() {
        if (equipos.isEmpty()) {
            System.out.println("No hay equipos disponibles.");
            return;
        }

        mostrarEquipos();
        System.out.print("Introduce el nombre del equipo a seleccionar: ");
        String nombre = scanner.nextLine();
        Equipo equipoSeleccionado = equipos.stream()
                                           .filter(e -> e.getNombre().equalsIgnoreCase(nombre))
                                           .findFirst()
                                           .orElse(null);

        if (equipoSeleccionado == null) {
            System.out.println("Equipo no encontrado.");
            return;
        }

        boolean volver = false;

        while (!volver) {
            System.out.println("\nSubmenú de equipo:");
            System.out.println("1. Ver detalles");
            System.out.println("2. Cambiar nombre");
            System.out.println("3. Agregar jugador al equipo");
            System.out.println("4. Mostrar jugadores del equipo");
            System.out.println("5. Regresar al menú principal");
            System.out.print("Selecciona una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    System.out.println("Detalles del equipo:");
                    System.out.println(equipoSeleccionado);
                    break;
                case 2:
                    System.out.print("Introduce el nuevo nombre del equipo: ");
                    String nuevoNombre = scanner.nextLine();
                    equipoSeleccionado.setNombre(nuevoNombre);

                    // Actualizar el nombre del equipo en todos los jugadores
                    for (Jugador jugador : jugadores) {
                        if (jugador.getEquipo() != null && jugador.getEquipo().equals(equipoSeleccionado)) {
                            jugador.getEquipo().setNombre(nuevoNombre);
                        }
                    }
                    System.out.println("Nombre cambiado.");
                    break;
                case 3:
                    mostrarJugadores();
                    System.out.print("Selecciona el nombre del jugador para agregar al equipo (introduce el nombre): ");
                    String nombreJugador = scanner.nextLine();
                    Jugador jugador = jugadores.stream()
                                               .filter(j -> j.getNombre().equalsIgnoreCase(nombreJugador))
                                               .findFirst()
                                               .orElse(null);

                    if (jugador == null) {
                        System.out.println("Jugador no encontrado.");
                        break;
                    }

                    jugador.setEquipo(equipoSeleccionado);
                    System.out.println("Jugador agregado al equipo.");
                    break;
                case 4:
                    System.out.println("Jugadores del equipo " + equipoSeleccionado.getNombre() + ":");
                    jugadores.stream()
                             .filter(j -> j.getEquipo() != null && j.getEquipo().equals(equipoSeleccionado))
                             .forEach(System.out::println);
                    break;
                case 5:
                    volver = true;
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
                    break;
            }
        }
    }
}
