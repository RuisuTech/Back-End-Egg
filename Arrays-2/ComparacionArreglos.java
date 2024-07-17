import java.util.Arrays;

public class ComparacionArreglos {

    public static void main(String[] args) {
        // Definir dos arreglos de enteros
        int[] arreglo1 = {1, 2, 3, 4, 5};
        int[] arreglo2 = {1, 2, 3, 4, 5};
        
        // Comparar los arreglos utilizando Arrays.equals()
        boolean sonIguales = Arrays.equals(arreglo1, arreglo2);
        
        // Imprimir el resultado
        if (sonIguales) {
            System.out.println("Los arreglos son iguales.");
        } else {
            System.out.println("Los arreglos son diferentes.");
        }
    }
}
