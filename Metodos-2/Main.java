import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int numero = solicitarNumero();
        if (esPar(numero)) {
            System.out.println("El " + numero + " es par");
        } else {
            System.out.println("El " + numero + " no es par");
        }
    }

    public static int solicitarNumero() {
        try (Scanner pepe = new Scanner(System.in)) {
            Integer numero = null;
            System.out.println("Por favor ingrese un número:");
            do {
                try {
                    numero = pepe.nextInt();
                } catch (Exception e) {
                    pepe.nextLine();
                    System.out.println("No ingresó un número, intente nuevamente:");
                }
            } while (numero == null);
            return numero;
        }
    }

    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }
}
