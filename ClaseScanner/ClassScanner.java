import java.util.Scanner;

public class ClassScanner {

    public static void main(String[] args) {
        Scanner miScanner = new Scanner(System.in);

        int edad = 0;
        String nombre = "name";

        System.out.println("Ingrese su edad:");
        edad = miScanner.nextInt();

        miScanner.nextLine();

        System.out.println("Ingrese su nombre:");
        nombre = miScanner.nextLine();

        System.out.println("Su nombre es " + nombre + " y su edad es " + edad);

        miScanner.close();
    }
}