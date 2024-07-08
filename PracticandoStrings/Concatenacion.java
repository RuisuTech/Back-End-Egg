import java.util.Scanner;

public class Concatenacion {

    public static void main(String[] args) {

        Scanner miScanner = new Scanner(System.in);

        System.out.print("Coloca tu nombre: ");
        String nombre = miScanner.nextLine();

        System.out.print("Coloca tu apellido: ");
        String apellido = miScanner.nextLine();

        System.out.println("Concatenacion de palabra: " + nombre.concat(" " + apellido));   

        miScanner.close();

    }
}
