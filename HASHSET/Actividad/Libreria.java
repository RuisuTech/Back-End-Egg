import java.util.HashSet;

public class Libreria {
    private final HashSet<Libro> catalogo;

    public Libreria() {
        catalogo = new HashSet<>();
    }

    public void agregarLibro(Libro libro) {
        if (catalogo.add(libro)) {
            System.out.println("Libro agregado al catálogo: " + libro);
        } else {
            System.out.println("El libro ya está en el catálogo: " + libro);
        }
    }

    public void eliminarLibro(String isbn) {
        Libro libroEliminar = new Libro("", "", isbn); // Crear un libro con el ISBN para buscar
        if (catalogo.remove(libroEliminar)) {
            System.out.println("Libro eliminado del catálogo con ISBN: " + isbn);
        } else {
            System.out.println("No se encontró un libro con el ISBN: " + isbn);
        }
    }

    public void mostrarCatalogo() {
        if (catalogo.isEmpty()) {
            System.out.println("El catálogo está vacío.");
        } else {
            System.out.println("Catálogo de libros:");
            for (Libro libro : catalogo) {
                System.out.println(libro);
            }
        }
    }
}
