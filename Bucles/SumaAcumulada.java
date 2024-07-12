public class SumaAcumulada {
    public static void main(String[] args) {
        // Definimos un array de ejemplo
        int[] array = {3, 1, 7, 4, 2};
        
        // Imprimimos el array original
        System.out.println("Array original:");
        imprimirArray(array);
        
        // Calculamos la suma acumulada y reemplazamos en el array
        int sumaAcumulada = 0;
        for (int i = 0; i < array.length; i++) {
            sumaAcumulada += array[i];
            array[i] = sumaAcumulada;
        }
        
        // Imprimimos el array con la suma acumulada
        System.out.println("\nArray con suma acumulada:");
        imprimirArray(array);
    }
    
    // Método para imprimir un array
    public static void imprimirArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); // Salto de línea al final
    }
}
