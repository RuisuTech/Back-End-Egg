import java.util.Scanner;

public class GraficoBarras {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int[] numeros = new int[4];
            
            // Pedir al usuario que ingrese 4 números
            for (int i = 0; i < 4; i++) {
                System.out.print("Ingrese el número " + (i+1) + " (entre 1 y 20): ");
                numeros[i] = scanner.nextInt();
                if (numeros[i] < 1 || numeros[i] > 20) {
                    System.out.println("Número fuera del rango. Ingrese nuevamente.");
                    i--;  // Volver a pedir el mismo número
                }
            }
            
            // Imprimir el gráfico de barras
            for (int i = 0; i < 4; i++) {
                System.out.print(numeros[i] + ": ");
                for (int j = 0; j < numeros[i]; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
