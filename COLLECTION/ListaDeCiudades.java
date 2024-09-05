import java.util.ArrayList;
import java.util.Scanner;

public class ListaDeCiudades {
    public static void main(String[] args) {
        // Crear un ArrayList para almacenar los nombres de las ciudades
        ArrayList<String> ciudades = new ArrayList<>();
        
        try ( // Crear un objeto Scanner para leer la entrada del usuario
                Scanner scanner = new Scanner(System.in)) {
            String continuar = "sí";
            // Bucle para permitir al usuario ingresar nombres de ciudades
            while (continuar.equalsIgnoreCase("sí")) {
                // Solicitar al usuario que ingrese el nombre de una ciudad
                System.out.print("Ingrese el nombre de una ciudad: ");
                String ciudad = scanner.nextLine();
                
                // Agregar la ciudad al ArrayList
                ciudades.add(ciudad);
                
                // Preguntar al usuario si desea ingresar otra ciudad
                System.out.print("¿Desea agregar otra ciudad? (sí/no): ");
                continuar = scanner.nextLine();
            }   // Mostrar la lista completa de ciudades almacenadas
            System.out.println("\nLista de ciudades ingresadas:");
            for (String ciudad : ciudades) {
                System.out.println(ciudad);
            }
            // Cerrar el scanner
        }
    }
}
