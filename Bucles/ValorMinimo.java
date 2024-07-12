public class ValorMinimo {
    public static void main(String[] args) {
        // Definimos un array de enteros
        int[] numeros = { 15, 7, 20, 3, 11, 9 };

        // Inicializamos la variable min con el primer elemento del array
        int min = numeros[0];

        // Recorremos el array para encontrar el valor mínimo
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] < min) {
                min = numeros[i];
            }
        }

        // Mostramos el valor mínimo encontrado
        System.out.println("El valor mínimo en el array es: " + min);
    }
}
