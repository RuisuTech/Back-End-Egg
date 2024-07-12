import java.util.Scanner;

public class ContarOcurrencias {

    public static void main(String[] args) {
        // Creamos un array de 50 caracteres inicializado con la frase elegida
        char[] frase = "aprendiendo java".toCharArray();
        
        try ( // Pedimos al usuario que ingrese un carácter objetivo
                Scanner myScanner = new Scanner(System.in)) {
            System.out.print("Ingrese un carácter objetivo: ");
            char objetivo = myScanner.nextLine().charAt(0); // Tomamos el primer carácter ingresado
            
            // Contamos cuántas veces aparece el carácter objetivo en el array
            int contador = 0;
            for (char c : frase) {
                if (c == objetivo) {
                    contador++;
                }
            }
            
            // Imprimimos el resultado según la cantidad de ocurrencias
            if (contador > 0) {
                System.out.printf("El carácter \"%c\" aparece %d veces.\n", objetivo, contador);
            } else {
                System.out.printf("El carácter \"%c\" no aparece en la frase.\n", objetivo);
            }
        }
    }
}
