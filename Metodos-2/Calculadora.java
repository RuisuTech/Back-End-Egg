import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        try (Scanner sc = new Scanner(System.in)) {
            int opcion;
            do {
                System.out.println("Seleccione una operación:");
                System.out.println("1. Sumar");
                System.out.println("2. Restar");
                System.out.println("3. Multiplicar");
                System.out.println("4. Dividir");
                System.out.println("5. Salir");
                opcion = sc.nextInt();

                if (opcion >= 1 && opcion <= 4) {
                    System.out.println("Ingrese el primer número:");
                    double num1 = sc.nextDouble();
                    System.out.println("Ingrese el segundo número:");
                    double num2 = sc.nextDouble();

                    switch (opcion) {
                        case 1 -> System.out.println("Resultado: " + (num1 + num2));
                        case 2 -> System.out.println("Resultado: " + (num1 - num2));
                        case 3 -> System.out.println("Resultado: " + (num1 * num2));
                        case 4 -> {
                            if (num2 != 0) {
                                System.out.println("Resultado: " + (num1 / num2));
                            } else {
                                System.out.println("Error: División por cero.");
                            }
                        }
                    }
                } else if (opcion != 5) {
                    System.out.println("Opción no válida, intente nuevamente.");
                }
            } while (opcion != 5);
        }
        System.out.println("¡Hasta luego!");
    }
}
