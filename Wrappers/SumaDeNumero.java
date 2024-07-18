
import java.util.Scanner;

public class SumaDeNumero {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe una cadena numerica: ");
        String num = sc.nextLine();

        try {
            Integer num2 = Integer.valueOf(num);

            System.out.println("Numero convertido a Integer es " + num2);
            System.out.println("Escribe una cadena de texto numerico");

            String num3 = sc.nextLine();

            try {

                Double num4 = Double.valueOf(num3);
                System.out.println("Numero convertido a double es " + num4);
                System.out.println("Suma de ambos es: " + (Double) (num2 + num4));

            } catch (NumberFormatException e) {
                System.out.println("No se puede convertir");
            }

        } catch (NumberFormatException e) {
            System.out.println("No se puede convertir " + e.getMessage());
        }
    }
}
