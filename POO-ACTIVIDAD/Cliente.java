import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private final List<Producto> carrito = new ArrayList<>();

    public void agregarAlCarrito(Producto producto, int cantidad) {
        if (cantidad <= producto.getCantidadEnStock()) {
            producto.reducirStock(cantidad);
            for (int i = 0; i < cantidad; i++) {
                carrito.add(producto);
            }
        } else {
            throw new IllegalArgumentException("Cantidad solicitada supera el stock disponible.");
        }
    }

    public List<Producto> getCarrito() {
        return carrito;
    }

    public void vaciarCarrito() {
        carrito.clear();
    }

    public double calcularTotal() {
        double total = 0;
        for (Producto p : carrito) {
            total += p.getPrecio();
        }
        return total;
    }
}
