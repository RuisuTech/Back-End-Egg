import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

    private static final List<Producto> productos = new ArrayList<>();
    private static final Cliente cliente = new Cliente();
    
    public static void main(String[] args) {
        // Inicializar algunos productos
        productos.add(new ProductoElectronico("Laptop", 1200.00, 10, "Laptop de alta gama", "MarcaX", 24));
        productos.add(new ProductoRopa("Camisa", 30.00, 50, "Camisa de algodón", "L", "Algodón"));

        try (Scanner scanner = new Scanner(System.in)) {
            boolean salir = false;
            
            while (!salir) {
                System.out.println("\nMenu:");
                System.out.println("1. Agregar producto al carrito");
                System.out.println("2. Ver el carrito");
                System.out.println("3. Realizar la compra");
                System.out.println("4. Salir");
                System.out.print("Selecciona una opción: ");
                int opcion = scanner.nextInt();
                scanner.nextLine(); // Consumir el salto de línea
                
                switch (opcion) {
                    case 1 -> agregarProductoAlCarrito(scanner);
                    case 2 -> verCarrito();
                    case 3 -> realizarCompra();
                    case 4 -> {
                        salir = true;
                        System.out.println("Saliendo del sistema.");
                    }
                    default -> System.out.println("Opción no válida. Intenta de nuevo.");
                }
            }
        }
    }

    private static void agregarProductoAlCarrito(Scanner scanner) {
        System.out.println("Selecciona un producto:");
        for (int i = 0; i < productos.size(); i++) {
            Producto p = productos.get(i);
            System.out.println((i + 1) + ". " + p.getNombre() + " - " + p.getPrecio() + " (Stock: " + p.getCantidadEnStock() + ")");
        }

        int opcion = scanner.nextInt() - 1;
        scanner.nextLine(); // Consumir el salto de línea

        if (opcion >= 0 && opcion < productos.size()) {
            Producto producto = productos.get(opcion);
            System.out.print("Cantidad a agregar: ");
            int cantidad = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            try {
                cliente.agregarAlCarrito(producto, cantidad);
                System.out.println("Producto(s) agregado(s) al carrito.");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        } else {
            System.out.println("Opción no válida.");
        }
    }

    private static void verCarrito() {
        List<Producto> carrito = cliente.getCarrito();
        if (carrito.isEmpty()) {
            System.out.println("El carrito está vacío.");
        } else {
            System.out.println("Carrito:");
            for (Producto p : carrito) {
                System.out.println(p.getNombre() + " - " + p.getPrecio());
            }
            System.out.println("Total: " + cliente.calcularTotal());
        }
    }

    private static void realizarCompra() {
        double total = cliente.calcularTotal();
        System.out.println("Total a pagar: " + total);
        cliente.vaciarCarrito();
        System.out.println("Compra realizada con éxito. El carrito ha sido vaciado.");
    }
}
