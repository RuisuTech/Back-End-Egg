
import java.util.Scanner;

public class RegistroAlumnos {

    private static final int MAX_ALUMNOS = 20; // Puedes ajustar el tamaño según sea necesario
    private static String[] nombres = new String[MAX_ALUMNOS];
    private static Double[] notas = new Double[MAX_ALUMNOS];
    private static int cantidadAlumnos = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            mostrarMenu();
            opcion = leerOpcion(scanner);

            switch (opcion) {
                case 1:
                    registrarAlumno(scanner);
                    break;
                case 2:
                    mostrarTodosLosAlumnos();
                    break;
                case 3:
                    mostrarPromedioNotas();
                    break;
                case 4:
                    buscarAlumnoPorNombre(scanner);
                    break;
                case 5:
                    modificarNotaPorNombre(scanner);
                    break;
                case 6:
                    eliminarAlumnoPorNombre(scanner);
                    break;
                case 7:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida, por favor intente de nuevo.");
            }
        } while (opcion != 7);

        scanner.close();
    }

    private static void mostrarMenu() {
        System.out.println("\nMenú de Opciones:");
        System.out.println("1. Registrar alumno");
        System.out.println("2. Mostrar todos los alumnos");
        System.out.println("3. Mostrar promedio de notas");
        System.out.println("4. Buscar alumno por nombre");
        System.out.println("5. Modificar nota por nombre");
        System.out.println("6. Eliminar alumno por nombre");
        System.out.println("7. Salir");
    }

    private static int leerOpcion(Scanner scanner) {
        int opcion = 0;
        try {
            System.out.print("Ingrese su opción: ");
            opcion = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida. Por favor, ingrese un número.");
        }
        return opcion;
    }

    private static void registrarAlumno(Scanner scanner) {
        if (cantidadAlumnos >= MAX_ALUMNOS) {
            System.out.println("No se pueden registrar más alumnos.");
            return;
        }

        System.out.print("Ingrese el nombre del alumno: ");
        String nombre = scanner.nextLine();

        if (nombre.trim().isEmpty()) {
            System.out.println("El nombre no puede estar vacío.");
            return;
        }

        Double nota = null;
        while (nota == null) {
            try {
                System.out.print("Ingrese la nota del alumno (0.00 - 10.00): ");
                nota = Double.parseDouble(scanner.nextLine());

                if (nota < 0.00 || nota > 10.00) {
                    System.out.println("La nota debe estar entre 0.00 y 10.00. Inténtelo de nuevo.");
                    nota = null;
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, ingrese un número válido.");
            }
        }

        nombres[cantidadAlumnos] = nombre;
        notas[cantidadAlumnos] = nota;
        cantidadAlumnos++;
        System.out.println("Alumno registrado exitosamente.");
    }

    private static void mostrarTodosLosAlumnos() {
        if (cantidadAlumnos == 0) {
            System.out.println("No hay alumnos registrados.");
            return;
        }

        System.out.println("\nListado de alumnos:");
        for (int i = 0; i < cantidadAlumnos; i++) {
            System.out.println("Nombre: " + nombres[i] + " - Nota: " + notas[i]);
        }
    }

    private static void mostrarPromedioNotas() {
        if (cantidadAlumnos == 0) {
            System.out.println("No hay alumnos registrados.");
            return;
        }

        double sumaNotas = 0.0;
        for (int i = 0; i < cantidadAlumnos; i++) {
            sumaNotas += notas[i];
        }

        double promedio = sumaNotas / cantidadAlumnos;
        System.out.println("El promedio de las notas es: " + promedio);
    }

    private static void buscarAlumnoPorNombre(Scanner scanner) {
        System.out.print("Ingrese el nombre del alumno a buscar: ");
        String nombreBuscado = scanner.nextLine();

        for (int i = 0; i < cantidadAlumnos; i++) {
            if (nombres[i].equalsIgnoreCase(nombreBuscado)) {
                System.out.println("Nombre: " + nombres[i] + " - Nota: " + notas[i]);
                return;
            }
        }

        System.out.println("Alumno no encontrado.");
    }

    private static void modificarNotaPorNombre(Scanner scanner) {
        System.out.print("Ingrese el nombre del alumno para modificar la nota: ");
        String nombreModificado = scanner.nextLine();

        for (int i = 0; i < cantidadAlumnos; i++) {
            if (nombres[i].equalsIgnoreCase(nombreModificado)) {
                Double nuevaNota = null;
                while (nuevaNota == null) {
                    try {
                        System.out.print("Ingrese la nueva nota (0.00 - 10.00): ");
                        nuevaNota = Double.parseDouble(scanner.nextLine());

                        if (nuevaNota < 0.00 || nuevaNota > 10.00) {
                            System.out.println("La nota debe estar entre 0.00 y 10.00. Inténtelo de nuevo.");
                            nuevaNota = null;
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Entrada inválida. Por favor, ingrese un número válido.");
                    }
                }

                notas[i] = nuevaNota;
                System.out.println("Nota modificada exitosamente.");
                return;
            }
        }

        System.out.println("Alumno no encontrado.");
    }

    private static void eliminarAlumnoPorNombre(Scanner scanner) {
        System.out.print("Ingrese el nombre del alumno a eliminar: ");
        String nombreEliminar = scanner.nextLine();

        for (int i = 0; i < cantidadAlumnos; i++) {
            if (nombres[i].equalsIgnoreCase(nombreEliminar)) {
                // Mover el último alumno al índice actual
                for (int j = i; j < cantidadAlumnos - 1; j++) {
                    nombres[j] = nombres[j + 1];
                    notas[j] = notas[j + 1];
                }

                nombres[cantidadAlumnos - 1] = null;
                notas[cantidadAlumnos - 1] = null;
                cantidadAlumnos--;
                System.out.println("Alumno eliminado exitosamente.");
                return;
            }
        }

        System.out.println("Alumno no encontrado.");
    }
}
