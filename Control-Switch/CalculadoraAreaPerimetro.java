import java.util.Scanner;

public class CalculadoraAreaPerimetro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selecciona una figura geométrica:");
        System.out.println("1. Círculo");
        System.out.println("2. Rectángulo");

        System.out.print("Ingresa el número de la figura que deseas calcular (1-2): ");
        int opcionFigura = scanner.nextInt();

        switch (opcionFigura) {
            case 1: // Círculo
                System.out.print("Ingresa el radio del círculo: ");
                double radio = scanner.nextDouble();

                System.out.println("Selecciona qué deseas calcular:");
                System.out.println("1. Área");
                System.out.println("2. Perímetro");
                int opcionCirculo = scanner.nextInt();

                switch (opcionCirculo) {
                    case 1: // Área del círculo
                        double areaCirculo = Math.PI * Math.pow(radio, 2);
                        System.out.println("El área del círculo es: " + areaCirculo);
                        break;
                    case 2: // Perímetro del círculo
                        double perimetroCirculo = 2 * Math.PI * radio;
                        System.out.println("El perímetro del círculo es: " + perimetroCirculo);
                        break;
                    default:
                        System.out.println("Opción no válida para círculo");
                        break;
                }
                break;
            case 2: // Rectángulo
                System.out.print("Ingresa la base del rectángulo: ");
                double baseRectangulo = scanner.nextDouble();
                System.out.print("Ingresa la altura del rectángulo: ");
                double alturaRectangulo = scanner.nextDouble();

                System.out.println("Selecciona qué deseas calcular:");
                System.out.println("1. Área");
                System.out.println("2. Perímetro");
                int opcionRectangulo = scanner.nextInt();

                switch (opcionRectangulo) {
                    case 1: // Área del rectángulo
                        double areaRectangulo = baseRectangulo * alturaRectangulo;
                        System.out.println("El área del rectángulo es: " + areaRectangulo);
                        break;
                    case 2: // Perímetro del rectángulo
                        double perimetroRectangulo = 2 * (baseRectangulo + alturaRectangulo);
                        System.out.println("El perímetro del rectángulo es: " + perimetroRectangulo);
                        break;
                    default:
                        System.out.println("Opción no válida para rectángulo");
                        break;
                }
                break;
            default:
                System.out.println("Opción de figura no válida");
                break;
        }

        scanner.close();
    }
}

