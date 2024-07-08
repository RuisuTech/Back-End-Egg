import java.util.Scanner;

public class CalculoDescuento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario que ingrese el precio del producto
        System.out.println("Ingresa el precio del producto:");
        double precio = scanner.nextDouble();
        
        // Verificar si aplica descuento y calcular el nuevo precio
        if (precio >= 100) {
            double descuento = precio * 0.10;
            double precioConDescuento = precio - descuento;
            System.out.println("Precio con descuento aplicado: $" + precioConDescuento);
        } else {
            System.out.println("Precio original sin descuento: $" + precio);
        }
        
        // Cerrar el scanner
        scanner.close();
    }
}
