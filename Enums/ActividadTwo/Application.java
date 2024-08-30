public class Application {
    public static void main(String[] args) {
        
        // Pruebas con 5 colores ingresados
        pruebaConvertidorColor("#FF0000"); // ROJO
        pruebaConvertidorColor("#FFFF00"); // AMARILLO
        pruebaConvertidorColor("#0000FF"); // AZUL
        pruebaConvertidorColor("#00FF00"); // Otro color (no existente en el enum)
        pruebaConvertidorColor("#FFFFFF"); // Otro color (no existente en el enum)
    }

    // Método para probar el convertidor de color
    private static void pruebaConvertidorColor(String valorHexadecimal) {

        Color color = ConvertidorColor.convertirHexadecimal(valorHexadecimal);
        if (color != null) {

            System.out.println("El valor hexadecimal " + valorHexadecimal + " corresponde al color " + color);
        } else {
            System.out.println("No se encontró un color primario correspondiente para el valor hexadecimal " + valorHexadecimal);
        }
    }
}
