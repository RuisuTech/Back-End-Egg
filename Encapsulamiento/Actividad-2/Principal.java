public class Principal {
    // Variable global para almacenar los puntos
    private static Punto[] puntos;

    public static void main(String[] args) {
        // Inicialización del arreglo de puntos
        puntos = new Punto[3];
        
        // Creación de instancias de Punto
        puntos[0] = new Punto(1.0, 2.0);
        puntos[1] = new Punto(4.0, 6.0);
        puntos[2] = new Punto(7.0, 10.0);

        // Calcular y mostrar la distancia desde el origen para el primer punto
        System.out.println("Distancia del punto 0 desde el origen: " + puntos[0].distanciaDesdeOrigen());

        // Calcular y mostrar la distancia entre el primer y el segundo punto
        System.out.println("Distancia entre punto 0 y punto 1: " + Punto.calcularDistancia(puntos[0], puntos[1]));

        // Verificar si los tres puntos están alineados
        boolean alineados = Punto.estanAlineados(puntos[0], puntos[1], puntos[2]);
        System.out.println("¿Están alineados los puntos 0, 1 y 2? " + alineados);
    }
}
