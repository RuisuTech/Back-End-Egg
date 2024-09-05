import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Turnero {
    private final ArrayList<Integer> turnos;
    private final Random random;
    
    public Turnero() {
        turnos = new ArrayList<>();
        random = new Random();
    }
    
    // Método para agregar un nuevo turno
    public void agregarTurno() {
        int nuevoTurno = turnos.size() + 1; // Asigna un número de turno secuencial
        turnos.add(nuevoTurno);
        System.out.println("Turno asignado: " + nuevoTurno);
    }
    
    // Método para realizar el sorteo
    public void realizarSorteo() {
        if (turnos.isEmpty()) {
            System.out.println("No hay turnos disponibles.");
            return;
        }
        
        int indiceAleatorio = random.nextInt(turnos.size());
        int turnoSorteado = turnos.get(indiceAleatorio);
        
        // Eliminar el turno sorteado de la lista
        turnos.remove(indiceAleatorio);
        
        System.out.println("Turno sorteado: " + turnoSorteado);
    }
    
    // Método para mostrar la lista de turnos actuales
    public void mostrarTurnos() {
        if (turnos.isEmpty()) {
            System.out.println("No hay turnos en la lista.");
            return;
        }
        
        System.out.println("Turnos actuales:");
        for (int turno : turnos) {
            System.out.println(turno);
        }
    }
    
    public static void main(String[] args) {
        Turnero turnero = new Turnero();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\nOpciones:");
            System.out.println("1. Agregar nuevo turno");
            System.out.println("2. Realizar sorteo");
            System.out.println("3. Mostrar turnos");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            
            int opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1 -> turnero.agregarTurno();
                case 2 -> turnero.realizarSorteo();
                case 3 -> turnero.mostrarTurnos();
                case 4 -> {
                    System.out.println("Saliendo...");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Opción inválida. Por favor intente de nuevo.");
            }
        }
    }
}
