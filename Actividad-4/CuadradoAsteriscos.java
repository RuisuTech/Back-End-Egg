import java.util.Scanner;

public class CuadradoAsteriscos {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese el tamaño del cuadrado (número de asteriscos por lado): ");
            int tamaño = scanner.nextInt();
            
            if (tamaño <= 0) {
                System.out.println("Ingrese un tamaño válido mayor que cero.");
            } else {
                for (int i = 0; i < tamaño; i++) {
                    for (int j = 0; j < tamaño; j++) {
                        if (i == 0 || i == tamaño - 1 || j == 0 || j == tamaño - 1) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
            }
        }
    }
}
