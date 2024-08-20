package modelos;

public class Rectangulo {
    private double ancho;
    private double alto;

    // Constructor sin parámetros
    public Rectangulo() {
        this.ancho = 0;
        this.alto = 0;
    }

    // Constructor con parámetros
    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    // Getters y Setters
    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    // Métodos para calcular área y perímetro
    public double area() {
        return ancho * alto;
    }

    public double perimetro() {
        return 2 * (ancho + alto);
    }

    // Método para imprimir datos
    public void imprimirDatos() {
        System.out.println("Rectángulo:");
        System.out.println("Ancho: " + ancho);
        System.out.println("Alto: " + alto);
        System.out.println("Área: " + area());
        System.out.println("Perímetro: " + perimetro());
    }
}
