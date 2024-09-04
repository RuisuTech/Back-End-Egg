public class ProductoElectronico extends Producto {
    private final String marca;
    private final int garantiaMeses;

    public ProductoElectronico(String nombre, double precio, int cantidadEnStock, String descripcion, String marca, int garantiaMeses) {
        super(nombre, precio, cantidadEnStock, descripcion);
        this.marca = marca;
        this.garantiaMeses = garantiaMeses;
    }

    public String getMarca() {
        return marca;
    }

    public int getGarantiaMeses() {
        return garantiaMeses;
    }
}
