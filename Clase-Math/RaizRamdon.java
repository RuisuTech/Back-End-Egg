import java.util.Scanner;

public class RaizRamdon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Coloca un comienzo del 1 al 30: ");
        double numeroLimite = scanner.nextDouble();

        if (numeroLimite <= 30) {

            double randomNum = Math.random() * numeroLimite;
            double flooredNum = Math.floor(randomNum);
            double raizNum = Math.sqrt(flooredNum);
            double raizNumRedondeo = Math.floor(raizNum);

            String valor = "";
            
            for (int i = 2; i < numeroLimite; i++) {
                if (numeroLimite % i == 0) {
                    valor = "no es primo ";
                    break;
                } else {
                    valor = "es primo ";
                }
            }

            System.out.println("El número " + valor);
            System.out.println("El numero aleatorio es: " + flooredNum);
            System.out.println("La raiz cuadrada del numero aleatorio es: " + raizNumRedondeo);

        } else {
            System.out.println("Este no es un numero del 1 al 30");
        }

        scanner.close();
    }
}
