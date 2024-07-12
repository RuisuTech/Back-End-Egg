public class OrdenInverso {
    public static void main(String[] args) {
        // Definimos un array de enteros
        int[] numeros = { 8, 4, 12, 6, 10 };

        // Recorremos el array en orden inverso e imprimimos cada elemento
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println(numeros[i]);
        }
    }
}
