package modelos;

public class Circulo {
    private double radio;
    private static final double PI = 3.14159;

    // Constructor sin parámetros
    public Circulo() {
        this.radio = 0;
    }

    // Constructor con parámetros
    public Circulo(double radio) {
        this.radio = radio;
    }

    // Getters y Setters
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    // Métodos para calcular área y perímetro
    public double area() {
        return PI * radio * radio;
    }

    public double perimetro() {
        return 2 * PI * radio;
    }

    // Método para imprimir datos
    public void imprimirDatos() {
        System.out.println("Círculo:");
        System.out.println("Radio: " + radio);
        System.out.println("Área: " + area());
        System.out.println("Perímetro: " + perimetro());
    }
}
