import java.util.*;

public class ManipularOraciones {

    private static String oracion = "";  // Variable global para almacenar la oración

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine();  // Limpiar el buffer

            switch (opcion) {
                case 1:
                    crearOBorrarOracion(scanner);
                    break;
                case 2:
                    mostrarCantidadDeCaracteres();
                    break;
                case 3:
                    mostrarCantidadDePalabras();
                    break;
                case 4:
                    mostrarPalabrasOrdenadas();
                    break;
                case 5:
                    mostrarPalabraPorNumero(scanner);
                    break;
                case 6:
                    buscarPalabra(scanner);
                    break;
                case 7:
                    modificarPalabra(scanner);
                    break;
                case 8:
                    agregarContenido(scanner);
                    break;
                case 9:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        } while (opcion != 9);
    }

    public static void mostrarMenu() {
        System.out.println("\n--- Menú de Opciones ---");
        if (oracion.isEmpty()) {
            System.out.println("1. Crear oración");
        } else {
            System.out.println("1. Borrar oración");
        }
        System.out.println("2. Cantidad de caracteres de la oración");
        System.out.println("3. Cantidad de palabras de la oración");
        System.out.println("4. Mostrar palabras ordenadas alfabéticamente");
        System.out.println("5. Ingresar un número y devolver la palabra correspondiente");
        System.out.println("6. Buscar palabra dentro de la oración");
        System.out.println("7. Modificar palabra dentro de la oración");
        System.out.println("8. Agregar contenido a la oración");
        System.out.println("9. Salir");
        System.out.print("Seleccione una opción: ");
    }

    public static void crearOBorrarOracion(Scanner scanner) {
        if (oracion.isEmpty()) {
            System.out.print("Ingrese la nueva oración: ");
            oracion = scanner.nextLine();
            System.out.println("Oración creada: " + oracion);
        } else {
            oracion = "";
            System.out.println("Oración borrada.");
        }
    }

    public static void mostrarCantidadDeCaracteres() {
        System.out.println("Cantidad de caracteres en la oración: " + oracion.length());
    }

    public static void mostrarCantidadDePalabras() {
        String[] palabras = oracion.split("\\s+");
        System.out.println("Cantidad de palabras en la oración: " + palabras.length);
    }

    public static void mostrarPalabrasOrdenadas() {
        String[] palabras = oracion.split("\\s+");
        Arrays.sort(palabras);
        System.out.println("Palabras ordenadas alfabéticamente: " + String.join(" ", palabras));
    }

    public static void mostrarPalabraPorNumero(Scanner scanner) {
        String[] palabras = oracion.split("\\s+");
        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();
        if (numero > 0 && numero <= palabras.length) {
            System.out.println("La palabra en la posición " + numero + " es: " + palabras[numero - 1]);
        } else {
            System.out.println("Número inválido. Intente nuevamente.");
        }
    }

    public static void buscarPalabra(Scanner scanner) {
        System.out.print("Ingrese la palabra a buscar: ");
        String palabra = scanner.nextLine();
        String[] palabras = oracion.split("\\s+");
        boolean encontrada = false;

        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].equalsIgnoreCase(palabra)) {
                System.out.println("La palabra '" + palabra + "' se encuentra en la posición " + (i + 1));
                encontrada = true;
                break;
            }
        }

        if (!encontrada) {
            System.out.println("La palabra no fue encontrada.");
        }
    }

    public static void modificarPalabra(Scanner scanner) {
        System.out.print("Ingrese la palabra a modificar: ");
        String palabra = scanner.nextLine();
        String[] palabras = oracion.split("\\s+");
        boolean encontrada = false;

        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].equalsIgnoreCase(palabra)) {
                System.out.print("Ingrese la nueva palabra: ");
                palabras[i] = scanner.nextLine();
                encontrada = true;
                break;
            }
        }

        if (encontrada) {
            oracion = String.join(" ", palabras);
            System.out.println("Oración modificada: " + oracion);
        } else {
            System.out.println("La palabra no fue encontrada.");
        }
    }

    public static void agregarContenido(Scanner scanner) {
        System.out.print("Ingrese el contenido a agregar: ");
        String contenido = scanner.nextLine();
        oracion += " " + contenido;
        System.out.println("Oración actualizada: " + oracion);
    }
}
