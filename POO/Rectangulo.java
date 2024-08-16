// Archivo: Rectangulo.java
public class Rectangulo {
    // Atributos
    private double ancho;
    private double alto;
    private static int contadorRectangulos = 0;

    // Constructor con argumentos
    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
        contadorRectangulos++; // Incrementa el contador al crear una nueva instancia
    }

    // Método para calcular el área
    public double area() {
        return ancho * alto;
    }

    // Método para calcular el perímetro
    public double perimetro() {
        return 2 * (ancho + alto);
    }

    // Método para imprimir el área
    public void imprimirArea() {
        System.out.println("Área: " + area());
    }

    // Método para imprimir el perímetro
    public void imprimirPerimetro() {
        System.out.println("Perímetro: " + perimetro());
    }

    // Método estático para obtener el número total de rectángulos
    public static int obtenerNumeroDeRectangulos() {
        return contadorRectangulos;
    }
}
