public class InvertirArray {
    public static void main(String[] args) {
        // Definimos un array de ejemplo
        int[] array = {1, 2, 3, 4, 5};
        
        // Imprimimos el array original
        System.out.println("Array original:");
        imprimirArray(array);
        
        // Invertimos el array directamente sobre el array original
        int temp;
        for (int i = 0; i < array.length / 2; i++) {
            temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        
        // Imprimimos el array invertido
        System.out.println("\nArray invertido:");
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
