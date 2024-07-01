package pkg06_asociacion_factura_multiplicidad;
public class Producto {
    public String nombre;
    private CategoriaProducto categoria;
    public float precioVenta;
    //constructor
    public Producto(String nombre, CategoriaProducto categoria, float precioVenta) {
        this.nombre = nombre;
        this.setCategoria(categoria);
        this.precioVenta = precioVenta;
    }
    //metodos
    public void setCategoria(CategoriaProducto categoria) {
        if( categoria != null )
            this.categoria = categoria; //se acepta
        else
            throw new IllegalArgumentException("Producto: categoria no puede ser null");
    }
    public CategoriaProducto getCategoria() {
        return this.categoria;
    }
}
