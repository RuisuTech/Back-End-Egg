public class Punto {
    // Atributos privados
    private double x;
    private double y;

    // Constructor
    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Métodos getter y setter para x
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    // Métodos getter y setter para y
    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    // Método de instancia para calcular la distancia desde el origen (0,0)
    public double distanciaDesdeOrigen() {
        return Math.sqrt(x * x + y * y);
    }

    // Método estático para calcular la distancia entre dos puntos
    public static double calcularDistancia(Punto p1, Punto p2) {
        double dx = p1.x - p2.x;
        double dy = p1.y - p2.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    // Método estático para verificar si tres puntos están alineados
    public static boolean estanAlineados(Punto p1, Punto p2, Punto p3) {
        // Verificar si el área del triángulo formado por los tres puntos es 0
        return (p1.x * (p2.y - p3.y) + p2.x * (p3.y - p1.y) + p3.x * (p1.y - p2.y)) == 0;
    }
}
