import java.util.Scanner;

public class MenuOpciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Menú de opciones:");
        System.out.println("1. Guardar");
        System.out.println("2. Cargar");
        System.out.println("3. Salir");

        System.out.print("Ingresa el número de la opción que deseas seleccionar (1-3): ");
        int opcion = scanner.nextInt();

        String mensaje;

        switch (opcion) {
            case 1:
                mensaje = "Has seleccionado: Guardar";
                break;
            case 2:
                mensaje = "Has seleccionado: Cargar";
                break;
            case 3:
                mensaje = "Has seleccionado: Salir";
                break;
            default:
                mensaje = "Opción no válida";
                break;
        }

        System.out.println(mensaje);

        scanner.close();
    }
}
