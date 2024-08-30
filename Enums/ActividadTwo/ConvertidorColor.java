// Clase para convertir valores hexadecimales a colores
public class ConvertidorColor {
    
    // Método para convertir un valor hexadecimal a un color del enum Color
    public static Color convertirHexadecimal(String valorHexadecimal) {
        for (Color color : Color.values()) {

            if (color.getValorHexadecimal().equalsIgnoreCase(valorHexadecimal)) {
                return color;
            }
        }

        // Si no se encuentra el color, se retorna null
        return null;
    }
}