public class ConcatenandoElementos {

    public static void main(String[] args) {
        // Paso 1: Crear un array de cadenas con elementos de tipo String
        String[] palabras = { "Hola", "qué", "tal", "todo", "bien", "por", "ahí" };

        // Paso 2: Concatenar los elementos del array en una sola cadena separados por espacios
        StringBuilder resultado = new StringBuilder();
        
        for (String palabra : palabras) {
            resultado.append(palabra).append(" ");
        }
        
        // Convertir el StringBuilder a String y eliminar el último espacio adicional
        String cadenaConcatenada = resultado.toString().trim();

        // Paso 3: Mostrar el resultado por consola
        System.out.println("Cadena concatenada: " + cadenaConcatenada);
    }
}
