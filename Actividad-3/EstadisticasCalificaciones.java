
import java.util.Random;

public class EstadisticasCalificaciones {

    public static void main(String[] args) {
        // Generar arreglo de calificaciones aleatorias
        String[] calificacionesStr = generarCalificaciones(20);  // Generamos 20 calificaciones aleatorias

        // Mostrar el arreglo original de calificaciones
        System.out.println("Calificaciones originales:");
        mostrarCalificaciones(calificacionesStr);

        // Convertir calificaciones originales a double
        double[] calificaciones = convertirADouble(calificacionesStr);

        // Separar las calificaciones en diferentes arreglos
        double[] desaprobados = separarCalificaciones(calificaciones, "< 4");
        double[] aprobados = separarCalificaciones(calificaciones, ">= 4");
        double[] excelentes = separarCalificaciones(calificaciones, ">= 10");

        // Calcular promedios
        double promedioGeneral = calcularPromedio(calificaciones);
        double promedioDesaprobados = calcularPromedio(desaprobados);
        double promedioAprobados = calcularPromedio(aprobados);
        double promedioExcelentes = calcularPromedio(excelentes);

        // Mostrar resultados
        System.out.println("\nEstadísticas:");
        System.out.println("Promedio general de todas las calificaciones: " + promedioGeneral);
        System.out.println("Promedio de calificaciones desaprobadas: " + promedioDesaprobados);
        System.out.println("Promedio de calificaciones aprobadas: " + promedioAprobados);
        System.out.println("Promedio de calificaciones excelentes: " + promedioExcelentes);
    }

    // Método para generar calificaciones aleatorias (representadas como Strings)
    public static String[] generarCalificaciones(int cantidad) {
        String[] calificaciones = new String[cantidad];
        Random random = new Random();

        for (int i = 0; i < cantidad; i++) {
            // Generamos una calificación aleatoria entre 1 y 20
            double calificacion = random.nextDouble() * 20 + 1;
            calificaciones[i] = String.format("%.1f", calificacion);  // Convertimos el double a String
        }

        return calificaciones;
    }

    // Método para mostrar las calificaciones en consola
    public static void mostrarCalificaciones(String[] calificaciones) {
        for (String calificacion : calificaciones) {
            System.out.print(calificacion + " ");
        }
        System.out.println();
    }

    // Método para convertir un arreglo de Strings a un arreglo de doubles
    public static double[] convertirADouble(String[] calificaciones) {
        double[] resultado = new double[calificaciones.length];
        for (int i = 0; i < calificaciones.length; i++) {
            resultado[i] = Double.parseDouble(calificaciones[i]);
        }
        return resultado;
    }

    // Método para separar calificaciones según el criterio (desaprobado, aprobado, excelente)
    public static double[] separarCalificaciones(double[] calificaciones, String criterio) {
        double[] resultado;

        resultado = switch (criterio) {
            case "< 4" ->
                calificacionesMenoresA(calificaciones, 4.0);
            case ">= 4" ->
                calificacionesMayoresIgualA(calificaciones, 4.0);
            case ">= 10" ->
                calificacionesMayoresIgualA(calificaciones, 10.0);
            default ->
                new double[0];
        };

        return resultado;
    }

    // Método para calcular el promedio de un arreglo de calificaciones (como doubles)
    public static double calcularPromedio(double[] calificaciones) {
        if (calificaciones.length == 0) {
            return 0.0;
        }

        double suma = 0.0;
        for (double calificacion : calificaciones) {
            suma += calificacion;
        }
        return suma / calificaciones.length;
    }

    // Método auxiliar para obtener las calificaciones menores a un valor específico
    public static double[] calificacionesMenoresA(double[] calificaciones, double valor) {
        return filtrarCalificaciones(calificaciones, "<", valor);
    }

    // Método auxiliar para obtener las calificaciones mayores o iguales a un valor específico
    public static double[] calificacionesMayoresIgualA(double[] calificaciones, double valor) {
        return filtrarCalificaciones(calificaciones, ">=", valor);
    }

    // Método auxiliar para filtrar calificaciones según el operador y valor
    public static double[] filtrarCalificaciones(double[] calificaciones, String operador, double valor) {
        // Filtramos las calificaciones según el criterio especificado
        return java.util.Arrays.stream(calificaciones)
                .filter(calificacion -> {
                    return switch (operador) {
                        case "<" ->
                            calificacion < valor;
                        case ">=" ->
                            calificacion >= valor;
                        default ->
                            false;
                    };
                })
                .toArray();
    }
}
