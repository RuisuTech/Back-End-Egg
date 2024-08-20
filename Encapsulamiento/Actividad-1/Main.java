
import java.util.Scanner;
import modelos.Circulo;
import modelos.Rectangulo;
import modelos.Triangulo;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int opcion;
            
            do {
                System.out.println("Seleccione una figura geométrica:");
                System.out.println("1. Rectángulo");
                System.out.println("2. Triángulo");
                System.out.println("3. Círculo");
                System.out.println("0. Salir");
                System.out.print("Opción: ");
                opcion = scanner.nextInt();
                
                switch (opcion) {
                    case 1 -> {
                        System.out.print("Ingrese el ancho del rectángulo: ");
                        double ancho = scanner.nextDouble();
                        System.out.print("Ingrese el alto del rectángulo: ");
                        double alto = scanner.nextDouble();
                        Rectangulo rectangulo = new Rectangulo(ancho, alto);
                        rectangulo.imprimirDatos();
                    }
                        
                    case 2 -> {
                        System.out.print("Ingrese la base del triángulo: ");
                        double base = scanner.nextDouble();
                        System.out.print("Ingrese la altura del triángulo: ");
                        double altura = scanner.nextDouble();
                        Triangulo triangulo = new Triangulo(base, altura);
                        triangulo.imprimirDatos();
                    }
                        
                    case 3 -> {
                        System.out.print("Ingrese el radio del círculo: ");
                        double radio = scanner.nextDouble();
                        Circulo circulo = new Circulo(radio);
                        circulo.imprimirDatos();
                    }
                        
                    case 0 -> System.out.println("Saliendo del programa...");
                        
                    default -> System.out.println("Opción no válida. Inténtelo de nuevo.");
                }
            } while (opcion != 0);
        }
    }
}
