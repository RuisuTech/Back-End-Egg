import java.util.List;
import java.util.Scanner;

public class MenuServicio {
    private final PedidoServicio pedidoServicio;
    private final Scanner scanner;

    public MenuServicio() {
        this.pedidoServicio = new PedidoServicio();
        this.scanner = new Scanner(System.in);
    }

    public void iniciarMenu() {
        try (scanner) {
            boolean salir = false;
            while (!salir) {
                System.out.println("Menu:");
                System.out.println("1. Crear nuevo pedido");
                System.out.println("2. Actualizar estado de pedido");
                System.out.println("3. Buscar pedidos por estado");
                System.out.println("4. Mostrar lista de pedidos");
                System.out.println("5. Salir");
                
                int opcion = scanner.nextInt();
                scanner.nextLine(); // Limpiar el buffer
                
                switch (opcion) {
                    case 1 -> crearNuevoPedido();
                    case 2 -> actualizarEstadoPedido();
                    case 3 -> buscarPedidosPorEstado();
                    case 4 -> mostrarListaDePedidos();
                    case 5 -> {
                        salir = true;
                        System.out.println("Saliendo...");
                    }
                    default -> System.out.println("Opción inválida. Por favor, elija una opción entre 1 y 5.");
                }
            }
        }
    }

    private void crearNuevoPedido() {
        System.out.print("Ingrese el nombre del cliente: ");
        String cliente = scanner.nextLine();

        System.out.print("Ingrese la lista de productos (separados por comas): ");
        String[] productos = scanner.nextLine().split(",");

        Pedido pedido = pedidoServicio.crearPedido(cliente, productos);
        System.out.println("Pedido creado: " + pedido);
    }

    private void actualizarEstadoPedido() {
        System.out.print("Ingrese el número del pedido: ");
        int numeroDePedido = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        System.out.print("Ingrese el nuevo estado del pedido (PENDIENTE, ENVIADO, ENTREGADO): ");
        String estado = scanner.nextLine().toUpperCase();
        EstadoPedido nuevoEstado = EstadoPedido.valueOf(estado);

        boolean actualizado = pedidoServicio.actualizarEstadoPedido(numeroDePedido, nuevoEstado);
        if (actualizado) {
            System.out.println("Estado actualizado con éxito.");
        } else {
            System.out.println("No se encontró el pedido con el número especificado.");
        }
    }

    private void buscarPedidosPorEstado() {
        System.out.print("Ingrese el estado a buscar (PENDIENTE, ENVIADO, ENTREGADO): ");
        String estado = scanner.nextLine().toUpperCase();
        EstadoPedido estadoBusqueda = EstadoPedido.valueOf(estado);

        List<Pedido> pedidos = pedidoServicio.buscarPedidosPorEstado(estadoBusqueda);
        System.out.println("Pedidos en estado " + estado + ":");
        for (Pedido pedido : pedidos) {
            System.out.println(pedido);
        }
    }

    private void mostrarListaDePedidos() {
        List<Pedido> pedidos = pedidoServicio.obtenerListaCompletaPedidos();
        System.out.println("Lista completa de pedidos:");
        for (Pedido pedido : pedidos) {
            System.out.println(pedido);
        }
    }
}
