// Clase abstracta Figura
abstract class Figura {
    abstract double calcularArea();
    abstract double calcularPerimetro();
}

// Interfaz Dibujable
interface Dibujable {
    void dibujar();
}

// Clase Círculo
class Circulo extends Figura implements Dibujable {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    double calcularArea() {
        return Math.PI * radio * radio;
    }

    @Override
    double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un círculo.");
    }
}

// Clase Rectángulo
class Rectangulo extends Figura implements Dibujable {
    private double ancho;
    private double alto;

    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    double calcularArea() {
        return ancho * alto;
    }

    @Override
    double calcularPerimetro() {
        return 2 * (ancho + alto);
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un rectángulo.");
    }
}

// Clase Triángulo
class Triangulo extends Figura implements Dibujable {
    private double base;
    private double altura;
    private double lado1;
    private double lado2;
    private double lado3;

    public Triangulo(double base, double altura, double lado1, double lado2, double lado3) {
        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    @Override
    double calcularArea() {
        return (base * altura) / 2;
    }

    @Override
    double calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un triángulo.");
    }
}

// Clase principal para probar las figuras
public class Main {
    public static void main(String[] args) {
        Figura circulo = new Circulo(5);
        Figura rectangulo = new Rectangulo(4, 6);
        Figura triangulo = new Triangulo(3, 4, 5, 5, 5);

        Dibujable dibujableCirculo = (Dibujable) circulo;
        Dibujable dibujableRectangulo = (Dibujable) rectangulo;
        Dibujable dibujableTriangulo = (Dibujable) triangulo;

        System.out.println("Círculo: Área = " + circulo.calcularArea() + ", Perímetro = " + circulo.calcularPerimetro());
        dibujableCirculo.dibujar();

        System.out.println("Rectángulo: Área = " + rectangulo.calcularArea() + ", Perímetro = " + rectangulo.calcularPerimetro());
        dibujableRectangulo.dibujar();

        System.out.println("Triángulo: Área = " + triangulo.calcularArea() + ", Perímetro = " + triangulo.calcularPerimetro());
        dibujableTriangulo.dibujar();
    }
}
