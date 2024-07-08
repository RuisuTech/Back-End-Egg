import java.util.Scanner;

public class VerificacionDiaHabil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número del 1 al 7 para verificar si es día hábil: ");
        int dia = scanner.nextInt();

        String mensaje;

        switch (dia) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                mensaje = "Es un día hábil";
                break;
            case 7:
                mensaje = "No es un día hábil";
                break;
            default:
                mensaje = "Número de día inválido";
                break;
        }

        System.out.println(mensaje);

        scanner.close();
    }
}
