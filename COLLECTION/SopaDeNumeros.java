import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class SopaDeNumeros {
    public static void main(String[] args) {
        // Leer los valores ingresados por el usuario
        ArrayList<Integer> valores = leerValores();
        
        // Calcular la suma de los valores
        int suma = calcularSuma(valores);
        
        // Calcular la media de los valores
        double promedio = calcularPromedio(valores);
        
        // Mostrar los resultados
        mostrarResultados(valores, suma, promedio);
    }
    
    // Método para leer valores del usuario
    public static ArrayList<Integer> leerValores() {
        ArrayList<Integer> lista = new ArrayList<>();
        try (Scanner scanner = new Scanner(System.in)) {
            int valor;
            
            System.out.println("Ingrese los números enteros (finalice con -99):");
            
            while (true) {
                valor = scanner.nextInt();
                if (valor == -99) {
                    break;
                }
                lista.add(valor);
            }
        }
        return lista;
    }
    
    // Método para calcular la suma de los valores
    public static int calcularSuma(ArrayList<Integer> lista) {
        int suma = 0;
        Iterator<Integer> iterator = lista.iterator();
        
        while (iterator.hasNext()) {
            suma += iterator.next();
        }
        
        return suma;
    }
    
    // Método para calcular la media de los valores
    public static double calcularPromedio(ArrayList<Integer> lista) {
        if (lista.isEmpty()) {
            return 0;
        }
        
        int suma = calcularSuma(lista);
        return (double) suma / lista.size();
    }
    
    // Método para mostrar los resultados
    public static void mostrarResultados(ArrayList<Integer> lista, int suma, double promedio) {
        int contadorMayoresQuePromedio = 0;
        
        System.out.println("\nValores ingresados:");
        for (int valor : lista) {
            System.out.println(valor);
        }
        
        System.out.println("\nNúmero total de valores: " + lista.size());
        System.out.println("Suma de los valores: " + suma);
        System.out.println("Media de los valores: " + promedio);
        
        // Contar cuántos valores son mayores que la media
        for (int valor : lista) {
            if (valor > promedio) {
                contadorMayoresQuePromedio++;
            }
        }
        
        System.out.println("Número de valores mayores que la media: " + contadorMayoresQuePromedio);
    }
}
