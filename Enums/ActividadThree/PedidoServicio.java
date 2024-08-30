import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PedidoServicio {
    private final List<Pedido> pedidos;
    private int siguienteNumeroDePedido;

    public PedidoServicio() {
        this.pedidos = new ArrayList<>();
        this.siguienteNumeroDePedido = 1;
    }

    public Pedido crearPedido(String cliente, String[] listaDeProductos) {
        Pedido pedido = new Pedido(siguienteNumeroDePedido++, cliente, listaDeProductos, EstadoPedido.PENDIENTE);
        pedidos.add(pedido);
        return pedido;
    }

    public boolean actualizarEstadoPedido(int numeroDePedido, EstadoPedido nuevoEstado) {
        for (Pedido pedido : pedidos) {
            if (pedido.getNumeroDePedido() == numeroDePedido) {
                pedido.setEstadoDelPedido(nuevoEstado);
                return true;
            }
        }
        return false;
    }

    public List<Pedido> buscarPedidosPorEstado(EstadoPedido estado) {
        return pedidos.stream()
                      .filter(pedido -> pedido.getEstadoDelPedido() == estado)
                      .collect(Collectors.toList());
    }

    public List<Pedido> obtenerListaCompletaPedidos() {
        return new ArrayList<>(pedidos);
    }
}
