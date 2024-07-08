import java.util.Scanner;

public class ConversionCalificaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa una calificación numérica del 1 al 5: ");
        int calificacion = scanner.nextInt();

        String calificacionTexto;

        switch (calificacion) {
            case 1:
                calificacionTexto = "Muy deficiente";
                break;
            case 2:
                calificacionTexto = "Deficiente";
                break;
            case 3:
                calificacionTexto = "Suficiente";
                break;
            case 4:
                calificacionTexto = "Notable";
                break;
            case 5:
                calificacionTexto = "Sobresaliente";
                break;
            default:
                calificacionTexto = "Calificación no válida";
                break;
        }

        System.out.println("La calificación " + calificacion + " es equivalente a: " + calificacionTexto);

        scanner.close();
    }
}
