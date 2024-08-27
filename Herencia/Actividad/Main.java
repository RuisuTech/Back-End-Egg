import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear una lista de animales
        List<Animal> animales = new ArrayList<>();

        // Agregar objetos Perro y Gato a la lista
        animales.add(new Perro("Rex", 5, "Labrador"));
        animales.add(new Gato("Whiskers", 3, "Gris"));
        animales.add(new Perro("Max", 4, "Beagle"));
        animales.add(new Gato("Mittens", 2, "Negro"));
        animales.add(new Perro("Fido", 6, "Poodle"));
        animales.add(new Gato("Shadow", 1, "Blanco"));
        animales.add(new Perro("Buddy", 7, "Boxer"));
        animales.add(new Gato("Ginger", 4, "Naranja"));
        animales.add(new Perro("Oscar", 3, "Dachshund"));
        animales.add(new Gato("Simba", 5, "Atigrado"));

        // Recorrer la lista y usar instanceof para identificar el tipo de objeto
        for (Animal animal : animales) {
            switch (animal) {
                case Perro perro -> {
                    System.out.println("¡Perro encontrado!");
                    perro.comer();
                    perro.dormir();
                    perro.ladrar();
                    System.out.println("Nombre: " + perro.getNombre() + ", Edad: " + perro.getEdad() + ", Raza: " + perro.getRaza());
                }
                case Gato gato -> {
                    System.out.println("¡Gato encontrado!");
                    gato.comer();
                    gato.dormir();
                    gato.maullar();
                    System.out.println("Nombre: " + gato.getNombre() + ", Edad: " + gato.getEdad() + ", Color: " + gato.getColor());
                }
                default -> {
                }
            }
            System.out.println();
        }
    }
}
