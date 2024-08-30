import java.util.Arrays;

public class Pedido {
    private int numeroDePedido;
    private String cliente;
    private String[] listaDeProductos;
    private EstadoPedido estadoDelPedido;

    public Pedido(int numeroDePedido, String cliente, String[] listaDeProductos, EstadoPedido estadoDelPedido) {
        this.numeroDePedido = numeroDePedido;
        this.cliente = cliente;
        this.listaDeProductos = listaDeProductos;
        this.estadoDelPedido = estadoDelPedido;
    }

    // Getters y Setters
    public int getNumeroDePedido() {
        return numeroDePedido;
    }

    public void setNumeroDePedido(int numeroDePedido) {
        this.numeroDePedido = numeroDePedido;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String[] getListaDeProductos() {
        return listaDeProductos;
    }

    public void setListaDeProductos(String[] listaDeProductos) {
        this.listaDeProductos = listaDeProductos;
    }

    public EstadoPedido getEstadoDelPedido() {
        return estadoDelPedido;
    }

    public void setEstadoDelPedido(EstadoPedido estadoDelPedido) {
        this.estadoDelPedido = estadoDelPedido;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "numeroDePedido=" + numeroDePedido +
                ", cliente='" + cliente + '\'' +
                ", listaDeProductos=" + Arrays.toString(listaDeProductos) +
                ", estadoDelPedido=" + estadoDelPedido +
                '}';
    }
}
