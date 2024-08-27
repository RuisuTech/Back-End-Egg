public class Main {
    public static void main(String[] args) {
        // Crear objetos de Perro
        Perro miPerro1 = new Perro("Rex", 5, "Labrador");
        Perro miPerro2 = new Perro("Rex", 5, "Labrador");
        Perro miPerro3 = new Perro("Max", 4, "Beagle");

        // Probar métodos sobrescritos en Perro
        miPerro1.comer();
        miPerro1.dormir();
        miPerro1.ladrar();
        System.out.println("Mi perro 1 se llama " + miPerro1.getNombre() + " y es de raza " + miPerro1.getRaza());

        // Comparar dos objetos Perro usando equals() y hashCode()
        System.out.println("miPerro1 es igual a miPerro2: " + miPerro1.equals(miPerro2));
        System.out.println("miPerro1 es igual a miPerro3: " + miPerro1.equals(miPerro3));
        System.out.println("HashCode de miPerro1: " + miPerro1.hashCode());
        System.out.println("HashCode de miPerro2: " + miPerro2.hashCode());
        System.out.println("HashCode de miPerro3: " + miPerro3.hashCode());

        // Crear objetos de Gato
        Gato miGato = new Gato("Whiskers", 3, "Gris");

        // Probar métodos sobrescritos en Gato
        miGato.comer();
        miGato.dormir();
        miGato.maullar();
        System.out.println("Mi gato se llama " + miGato.getNombre() + " y su color es " + miGato.getColor());
    }
}
