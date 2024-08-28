// Clase abstracta ItemBiblioteca
abstract class ItemBiblioteca {
    abstract void prestar();
    abstract void devolver();
    abstract double calcularMultas();
}

// Interfaz Catalogable
interface Catalogable {
    void obtenerInformacion();
}

// Clase Revista
class Revista extends ItemBiblioteca implements Catalogable {
    private String nombreRevista;
    private int nroEdicion;
    private int cantidadEjemplares;

    public Revista(String nombreRevista, int nroEdicion, int cantidadEjemplares) {
        this.nombreRevista = nombreRevista;
        this.nroEdicion = nroEdicion;
        this.cantidadEjemplares = cantidadEjemplares;
    }

    public String getNombreRevista() {
        return nombreRevista;
    }

    public void setNombreRevista(String nombreRevista) {
        this.nombreRevista = nombreRevista;
    }

    public int getNroEdicion() {
        return nroEdicion;
    }

    public void setNroEdicion(int nroEdicion) {
        this.nroEdicion = nroEdicion;
    }

    public int getCantidadEjemplares() {
        return cantidadEjemplares;
    }

    public void setCantidadEjemplares(int cantidadEjemplares) {
        this.cantidadEjemplares = cantidadEjemplares;
    }

    @Override
    public void prestar() {
        if (cantidadEjemplares > 0) {
            cantidadEjemplares--;
            System.out.println("Revista prestada. Ejemplares restantes: " + cantidadEjemplares);
        } else {
            System.out.println("No hay ejemplares disponibles para prestar.");
        }
    }

    @Override
    public void devolver() {
        cantidadEjemplares++;
        System.out.println("Revista devuelta. Ejemplares disponibles: " + cantidadEjemplares);
    }

    @Override
    public double calcularMultas() {
        // Implementar lógica para calcular multas si fuera necesario
        return 0.0;
    }

    @Override
    public void obtenerInformacion() {
        System.out.println("Nombre de la Revista: " + nombreRevista);
        System.out.println("Número de Edición: " + nroEdicion);
        System.out.println("Cantidad de Ejemplares: " + cantidadEjemplares);
    }
}

// Clase Libro
class Libro extends ItemBiblioteca implements Catalogable {
    private String titulo;
    private String autor;

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public void prestar() {
        System.out.println("Libro prestado: " + titulo);
    }

    @Override
    public void devolver() {
        System.out.println("Libro devuelto: " + titulo);
    }

    @Override
    public double calcularMultas() {
        // Implementar lógica para calcular multas si fuera necesario
        return 0.0;
    }

    @Override
    public void obtenerInformacion() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
    }
}

// Clase Pelicula
class Pelicula extends ItemBiblioteca implements Catalogable {
    private String titulo;
    private String director;

    public Pelicula(String titulo, String director) {
        this.titulo = titulo;
        this.director = director;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public void prestar() {
        System.out.println("Película prestada: " + titulo);
    }

    @Override
    public void devolver() {
        System.out.println("Película devuelta: " + titulo);
    }

    @Override
    public double calcularMultas() {
        // Implementar lógica para calcular multas si fuera necesario
        return 0.0;
    }

    @Override
    public void obtenerInformacion() {
        System.out.println("Título: " + titulo);
        System.out.println("Director: " + director);
    }
}

// Clase principal para probar las clases
public class Main {
    public static void main(String[] args) {
        // Crear objetos de la clase Revista
        Revista revista1 = new Revista("Revista Tech", 12, 5);
        Revista revista2 = new Revista("Revista Ciencia", 34, 3);
        Revista revista3 = new Revista("Revista Arte", 56, 0);

        // Crear un arreglo de revistas
        Revista[] revistas = {revista1, revista2, revista3};

        // Probar los métodos
        for (Revista revista : revistas) {
            revista.obtenerInformacion();
            revista.prestar();
            revista.devolver();
            System.out.println("Multa: " + revista.calcularMultas());
            System.out.println();
        }
    }
}
