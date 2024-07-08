/**
 * TiposDeDatos
 */
public class TiposDeDatos {

    public static void main(String[] args) {
         // 1. Declaración de variables
         boolean esEstudiante = true;
         char inicial = 'A';
         String saludo = "¡Hola, mundo!";
         int numero = 42;
         long numeroGrande = 123456789L;
         float decimal = 3.14f;
 
         // 2. Imprimir en consola el contenido de al menos tres variables
         System.out.println(esEstudiante);
         System.out.println(inicial);
         System.out.println(saludo);
 
         // 3. Declaración de nuevas variables para almacenar edad y nombre
         int edad = 19;
         String nombre = "Luis";
 
         // Imprimir en pantalla el texto con nombre y edad
         System.out.println("Mi nombre es " + nombre + ", y tengo " + edad + " años.");
    }
}