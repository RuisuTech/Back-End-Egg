public class ImprimirArray {

    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};
        String[] palabras = {"Hola", "Mundo"};
        int[][] numeros2D = {{1, 2, 3}, {4, 5, 6}};
        String[][] palabras2D = {{"Hello", "World"}, {"Java", "Rocks"}};

        imprimirArray(numeros);
        imprimirArray(palabras);
        imprimirArray(numeros2D);
        imprimirArray(palabras2D);
    }

    public static void imprimirArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void imprimirArray(String[] array) {
        for (String s : array) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    public static void imprimirArray(int[][] array) {
        for (int[] fila : array) {
            for (int i : fila) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void imprimirArray(String[][] array) {
        for (String[] fila : array) {
            for (String s : fila) {
                System.out.print(s + " ");
            }
            System.out.println();
        }
    }
}
