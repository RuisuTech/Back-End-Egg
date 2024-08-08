
import java.util.Scanner;

public class PrácticaInicial {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingresa tu nombre: ");
            String nombre = scanner.nextLine();
            
            System.out.print("Ingresa tu edad: ");
            int edad = scanner.nextInt();
            
            imprimeNombreYEdad(nombre, edad);
        }
    }

    public static void imprimeNombreYEdad(String nombre, int edad) {
        System.out.println("Me llamo " + nombre + " y tengo " + edad + " años.");
}
}
