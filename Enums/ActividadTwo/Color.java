public enum Color {
    ROJO("#FF0000"),
    AMARILLO("#FFFF00"),
    AZUL("#0000FF");

    // Propiedad adicional para el valor hexadecimal del color
    private final String valorHexadecimal;

    // Constructor privado para inicializar el valor hexadecimal
    Color(String valorHexadecimal) {
        this.valorHexadecimal = valorHexadecimal;
    }

    // Método para obtener el valor hexadecimal del color
    public String getValorHexadecimal() {
        return valorHexadecimal;
    }

    
}