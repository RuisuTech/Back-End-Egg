import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Biblioteca {
    private final List<Libro> catalogo;
    private final Map<String, Persona> personas; // Mapa para almacenar personas por nombre completo

    // Constructor
    public Biblioteca() {
        catalogo = new ArrayList<>();
        personas = new HashMap<>();
    }

    // Método para agregar libros al catálogo
    public void agregarLibro(Libro libro) {
        catalogo.add(libro);
    }

    // Método para mostrar todos los libros en el catálogo
    public void mostrarCatalogo() {
        if (catalogo.isEmpty()) {
            System.out.println("No hay libros en el catálogo.");
        } else {
            for (Libro libro : catalogo) {
                libro.mostrarInformacion();
                System.out.println();
            }
        }
    }

    // Método para registrar una persona
    public void registrarPersona(Persona persona) {
        personas.put(persona.getNombre() + " " + persona.getApellido(), persona);
    }

    // Método para prestar un libro a una persona
    public void prestarLibro(String nombreCompleto, String tituloLibro) {
        Persona persona = personas.get(nombreCompleto);
        if (persona == null) {
            System.out.println("Persona no registrada.");
            return;
        }

        for (Libro libro : catalogo) {
            if (libro.getTitulo().equalsIgnoreCase(tituloLibro)) {
                if (libro.isPrestado()) {
                    System.out.println("El libro ya está prestado.");
                } else {
                    libro.setPrestado(true);
                    persona.agregarLibroPrestado(libro);
                    System.out.println("Libro prestado exitosamente.");
                }
                return;
            }
        }
        System.out.println("El libro no se encuentra en el catálogo.");
    }

    // Método para devolver un libro
    public void devolverLibro(String nombreCompleto, String tituloLibro) {
        Persona persona = personas.get(nombreCompleto);
        if (persona == null) {
            System.out.println("Persona no registrada.");
            return;
        }

        for (Libro libro : persona.getLibrosPrestados()) {
            if (libro.getTitulo().equalsIgnoreCase(tituloLibro)) {
                libro.setPrestado(false);
                persona.removerLibroPrestado(libro);
                System.out.println("Libro devuelto exitosamente.");
                return;
            }
        }
        System.out.println("El libro no está prestado a esta persona.");
    }
}
