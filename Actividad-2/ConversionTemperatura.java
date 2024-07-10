import java.util.Scanner;

public class ConversionTemperatura {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

            
        System.out.print("Ingrese la unidad de medida (C/F): ");
        String unidad = scanner.nextLine();

        int temperaturaFinal;
        
        String unidadFinal = unidad.toUpperCase();

        try {

            System.out.print("Ingrese la temperatura: ");
            int temperatura = scanner.nextInt();


            switch (unidadFinal) {
                case "C":

                    temperaturaFinal = (temperatura * 9 / 5) + 32;
                    System.out.println(temperatura + " grados Celsius equivale a " + temperaturaFinal + " grados Fahrenheit.");
                    break;

                case "F":

                    temperaturaFinal = (temperatura - 32) * 5 / 9;
                    System.out.println(temperatura + " grados Celsius equivale a " + temperaturaFinal + " grados Celsius.");
                    break;

                default:
                    System.out.println("Unidad de medida no válida. Ingrese C para Celsius o F para Fahrenheit.");
                    break;
            }
        } catch (Exception e) {
            System.out.println("Temperatura no válida. Ingrese una temperatura numérica.");
        }

        scanner.close();

    }
}