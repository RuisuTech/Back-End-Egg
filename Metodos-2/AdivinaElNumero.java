import java.util.Scanner;

public class AdivinaElNumero {

    public static void main(String[] args) {
        int numeroSecreto = numeroAleatorio(1, 20);
        int intento;
        try (Scanner sc = new Scanner(System.in)) {
            do {
                System.out.println("Adivina el número entre 1 y 20:");
                intento = sc.nextInt();

                if (intento < numeroSecreto) {
                    System.out.println("El número es mayor.");
                } else if (intento > numeroSecreto) {
                    System.out.println("El número es menor.");
                }
            } while (intento != numeroSecreto);
        }

        System.out.println("¡Felicidades! Has adivinado el número.");
    }

    public static int numeroAleatorio(int min, int max) {
        return (int) Math.floor(Math.random() * (max - min + 1) + min);
    }
}
