import java.util.Scanner;

public class VariableGlobal {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String nombre = obtenerNombre();
        int edad = obtenerEdad();
        imprimeNombreYEdad(nombre, edad);
    }

    public static String obtenerNombre() {
        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();
        return nombre;
    }

    public static int obtenerEdad() {
        System.out.print("Ingresa tu edad: ");
        int edad = scanner.nextInt();
        scanner.nextLine();

        return edad;
    }

    public static void imprimeNombreYEdad(String nombre, int edad) {
        System.out.println("Me llamo " + nombre + " y tengo " + edad + " años.");
    }
}
