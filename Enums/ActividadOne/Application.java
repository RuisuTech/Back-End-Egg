public class Application {
    public static void main(String[] args) {
       
        // Arreglo de objetos DiaSemana con 10 días generados al azar
        DiaSemana[] semana = generarSemanaAleatoria(10);

        // Imprimir si cada día de la semana es laboral o no
        for (DiaSemana dia : semana) {
            imprimirDiaLaboral(dia);
        }
    }
    
    // Método para generar un arreglo de días de la semana aleatorios
    private static DiaSemana[] generarSemanaAleatoria(int cantidadDias) {
        DiaSemana[] semana = new DiaSemana[cantidadDias];
        for (int i = 0; i < cantidadDias; i++) {
            semana[i] = DiaSemana.values()[(int) (Math.random() *

                    DiaSemana.values().length)];
        }
        return semana;
    }

    // Método para imprimir si un día es laboral o no
    private static void imprimirDiaLaboral(DiaSemana dia) {
        if (dia.esDiaLaboral()) {
            System.out.println(dia + " es día laboral.");
        } else {
            System.out.println(dia + " no es día laboral.");
        }
    }

}
