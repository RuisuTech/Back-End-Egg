import java.util.Scanner;

public class Calificacion {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Ingrese un número entre 0 y 100:");
            int puntuacion = sc.nextInt();

            if (puntuacion >= 0 && puntuacion <= 100) {
                System.out.println("La calificación es: " + obtenerNota(puntuacion));
            } else {
                System.out.println("Número fuera de rango.");
            }
        }
    }

    public static String obtenerNota(int puntuacion) {
        return switch (puntuacion / 10) {
            case 10, 9 -> "A";
            case 8 -> "B";
            case 7 -> "C";
            case 6 -> "D";
            default -> "F";
        };
    }
}
