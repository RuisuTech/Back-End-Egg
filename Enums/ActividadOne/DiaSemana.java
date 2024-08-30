public enum DiaSemana {
    LUNES, MARTES, MIÉRCOLES, JUEVES, VIERNES, SÁBADO, DOMINGO;

    // Método para verificar si es día laboral
    public boolean esDiaLaboral() {
        return !(this == SÁBADO || this == DOMINGO);
    }
}