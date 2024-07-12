public class CalculandoPromedio {

    public static void main(String[] args) {
        // Paso 1: Crear el array de 20 elementos de tipo float e inicializarlo
        float[] numeros = { 10.5f, 15.2f, 8.7f, 12.0f, 20.3f,
                            5.1f, 18.9f, 14.6f, 9.8f, 7.2f,
                            16.4f, 11.7f, 13.2f, 6.5f, 19.1f,
                            4.3f, 17.8f, 22.9f, 3.6f, 25.0f };

        // Paso 2: Calcular la suma de todos los elementos del array
        float suma = 0;

        for (float num : numeros) {
            suma += num;
        }

        // Paso 3: Calcular el promedio
        float promedio = suma / numeros.length;

        // Paso 4: Mostrar resultados por consola
        System.out.println("Suma de los elementos: " + suma);
        System.out.println("Promedio de los elementos: " + promedio);
    }
}
