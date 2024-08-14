public class SumaArray {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};
        int suma = 0;

        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
            // Punto de interrupción aquí
        }

        System.out.println("La suma de todos los números es: " + suma);
    }
}
