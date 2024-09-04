public class ProductoRopa extends Producto {
    private final String talla;
    private final String material;

    public ProductoRopa(String nombre, double precio, int cantidadEnStock, String descripcion, String talla, String material) {
        super(nombre, precio, cantidadEnStock, descripcion);
        this.talla = talla;
        this.material = material;
    }

    public String getTalla() {
        return talla;
    }

    public String getMaterial() {
        return material;
    }
}