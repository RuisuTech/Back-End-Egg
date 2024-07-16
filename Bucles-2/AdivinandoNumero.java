import java.util.Scanner;

public class AdivinandoNumero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroAleatorio = (int) (Math.random() * 20) + 1; // Genera un número aleatorio entre 1 y 20
        int intentos = 0;
        int numeroUsuario;

        System.out.println("Bienvenido al juego de adivinar el número (entre 1 y 20)");

        do {
            System.out.print("Introduce un número: ");
            numeroUsuario = scanner.nextInt();
            intentos++;

            if (numeroUsuario < numeroAleatorio) {
                System.out.println("El número que has introducido es menor que el número aleatorio.");
            } else if (numeroUsuario > numeroAleatorio) {
                System.out.println("El número que has introducido es mayor que el número aleatorio.");
            }
        } while (numeroUsuario != numeroAleatorio);

        System.out.println("¡Correcto! Has adivinado el número " + numeroAleatorio + " en " + intentos + " intentos.");
        scanner.close();
    }
}
