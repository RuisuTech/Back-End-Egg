public class Fibonacci {

    public static void main(String[] args) {
        int n = 8; // Número de términos que queremos imprimir
        int a = 0, b = 1;
        int contador = 0;

        System.out.println("Los primeros " + n + " términos de la serie de Fibonacci:");

        // Imprimir los primeros n términos de la serie de Fibonacci
        while (contador < n) {
            System.out.print(a + " ");

            int suma = a + b;
            a = b;
            b = suma;

            contador++;
        }
    }
}
