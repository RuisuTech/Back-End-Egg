import java.util.Scanner;

public class CalculoAreas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selecciona la figura geométrica:");
        System.out.println("1. Círculo");
        System.out.println("2. Cuadrado");
        System.out.println("3. Triángulo");

        System.out.print("Ingresa el número de la figura que deseas calcular (1-3): ");
        int opcion = scanner.nextInt();

        double area = 0.0;

        switch (opcion) {
            case 1:
                System.out.print("Ingresa el radio del círculo: ");
                double radio = scanner.nextDouble();
                area = Math.PI * Math.pow(radio, 2);
                break;
            case 2:
                System.out.print("Ingresa el lado del cuadrado: ");
                double lado = scanner.nextDouble();
                area = lado * lado;
                break;
            case 3:
                System.out.print("Ingresa la base del triángulo: ");
                double base = scanner.nextDouble();
                System.out.print("Ingresa la altura del triángulo: ");
                double altura = scanner.nextDouble();
                area = (base * altura) / 2;
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }

        if (opcion >= 1 && opcion <= 3) {
            System.out.println("El área de la figura seleccionada es: " + area);
        }

        scanner.close();
    }
}
