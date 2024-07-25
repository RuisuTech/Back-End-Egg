import java.util.Arrays;
import java.util.Scanner;

public class ManipularOracion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String oracion = ""; // Iniciamos con una oración vacía

        while (true) {
            mostrarMenu(oracion);
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer de entrada

            switch (opcion) {
                case 1:
                    if (oracion.isEmpty()) {
                        System.out.println("Ingrese la nueva oración:");
                        oracion = scanner.nextLine();
                    } else {
                        System.out.println("La oración ya tiene contenido.");
                    }
                    break;
                case 2:
                    if (!oracion.isEmpty()) {
                        oracion = "";
                        System.out.println("Oración borrada.");
                    } else {
                        System.out.println("La oración ya está vacía.");
                    }
                    break;
                case 3:
                    System.out.println("Cantidad de caracteres: " + contarCaracteres(oracion));
                    break;
                case 4:
                    System.out.println("Cantidad de palabras: " + contarPalabras(oracion));
                    break;
                case 5:
                    mostrarPalabrasOrdenadas(oracion);
                    break;
                case 6:
                    buscarPalabra(oracion);
                    break;
                case 7:
                    modificarPalabra(oracion, scanner);
                    break;
                case 8:
                    agregarContenido(oracion, scanner);
                    break;
                case 9:
                    System.out.println("¡Hasta luego!");
                    scanner.close();
                    return; // Termina el programa
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
            System.out.println(); // Separador de operaciones
        }
    }

    private static void mostrarMenu(String oracion) {
        System.out.println("----- Manipulación de Oración -----");
        if (oracion.isEmpty()) {
            System.out.println("1. Crear oración");
        } else {
            System.out.println("2. Borrar oración");
        }
        System.out.println("3. Cantidad de caracteres de la oración");
        System.out.println("4. Cantidad de palabras de la oración");
        System.out.println("5. Mostrar palabras ordenadas alfabéticamente");
        System.out.println("6. Ingresar un número y devolver la palabra correspondiente");
        System.out.println("7. Buscar palabra dentro de la oración");
        System.out.println("8. Modificar palabra dentro de la oración");
        System.out.println("9. Agregar contenido a la oración");
        System.out.println("10. Salir");
        System.out.print("Seleccione una opción: ");
    }

    private static int contarCaracteres(String oracion) {
        return oracion.length();
    }

    private static int contarPalabras(String oracion) {
        if (oracion.isEmpty()) {
            return 0;
        }
        String[] palabras = oracion.split("\\s+");
        return palabras.length;
    }

    private static void mostrarPalabrasOrdenadas(String oracion) {
        if (oracion.isEmpty()) {
            System.out.println("La oración está vacía.");
        } else {
            String[] palabras = oracion.split("\\s+");
            Arrays.sort(palabras);
            System.out.println("Palabras ordenadas alfabéticamente: " + String.join(" ", palabras));
        }
    }

    private static void buscarPalabra(String oracion) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la palabra a buscar:");
        String palabraBuscar = scanner.nextLine().trim().toLowerCase();

        if (oracion.toLowerCase().contains(palabraBuscar)) {
            String[] palabras = oracion.split("\\s+");
            for (int i = 0; i < palabras.length; i++) {
                if (palabras[i].toLowerCase().equals(palabraBuscar)) {
                    System.out.println("La palabra '" + palabraBuscar + "' fue encontrada en la posición " + (i + 1));
                    return;
                }
            }
        }
        System.out.println("La palabra '" + palabraBuscar + "' no fue encontrada en la oración.");
    }

    private static void modificarPalabra(String oracion, Scanner scanner) {
        if (oracion.isEmpty()) {
            System.out.println("La oración está vacía. No hay palabras para modificar.");
            return;
        }
        System.out.println("Ingrese la palabra que desea modificar:");
        String palabraModificar = scanner.nextLine().trim().toLowerCase();

        String[] palabras = oracion.split("\\s+");
        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].toLowerCase().equals(palabraModificar)) {
                System.out.println("Ingrese la nueva palabra o frase:");
                String nuevaPalabra = scanner.nextLine().trim();
                palabras[i] = nuevaPalabra;
                oracion = String.join(" ", palabras);
                System.out.println("Oración modificada: " + oracion);
                return;
            }
        }
        System.out.println("La palabra '" + palabraModificar + "' no fue encontrada en la oración.");
    }

    private static void agregarContenido(String oracion, Scanner scanner) {
        System.out.println("Ingrese el contenido que desea agregar:");
        String contenido = scanner.nextLine();
        oracion += " " + contenido;
        System.out.println("Oración actualizada: " + oracion);
    }
}
