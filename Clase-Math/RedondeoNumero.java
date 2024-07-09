import java.util.Scanner;

public class RedondeoNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Coloca un numero decimal: ");
        
        String numero = scanner.nextLine();

        // Reemplazamos la coma por el punto para asegurarnos de que esté en el formato adecuado
        String decimal = numero.replace(",", ".");

        // Convertimos el String a double para poder redondearlo
        double numeroDouble = Double.parseDouble(decimal);

        // Redondeamos el número al entero más cercano
        long enteroNum = Math.round(numeroDouble);

        System.out.println("El valor entero de su numero es: " + enteroNum);

        scanner.close();
    }
}
