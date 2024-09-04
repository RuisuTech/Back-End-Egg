public class Producto {
    private final String nombre;
    private final double precio;
    private int cantidadEnStock;
    private final String descripcion;

    public Producto(String nombre, double precio, int cantidadEnStock, String descripcion) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadEnStock = cantidadEnStock;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidadEnStock() {
        return cantidadEnStock;
    }

    public void reducirStock(int cantidad) {
        if (cantidad <= cantidadEnStock) {
            cantidadEnStock -= cantidad;
        } else {
            throw new IllegalArgumentException("No hay suficiente stock disponible.");
        }
    }

    public String getDescripcion() {
        return descripcion;
    }
}
