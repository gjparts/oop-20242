package pkg05_asociacion_factura;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.text.DecimalFormat;
public class Factura {
    //atributos
    public int numero;
    public Calendar fecha;
    public Cliente cliente;
    private Producto producto1;
    public Producto producto2;
    public Producto producto3;
    public Producto producto4;
    //constructor
    public Factura(int numero, Calendar fecha, Cliente cliente, Producto producto1) {
        this.numero = numero;
        this.fecha = fecha;
        this.cliente = cliente;
        this.setProducto1(producto1);
    }
    //metodos
    public void setProducto1(Producto producto) {
        if( producto != null )
            this.producto1 = producto; //se acepta
        else
            throw new IllegalArgumentException("Factura: producto1 es obligatorio");
    }
    public Producto getProducto1() {
        return this.producto1;
    }
    public Producto getProducto2() {
        return this.producto2;
    }
    public Producto getProducto3() {
        return this.producto3;
    }
    public Producto getProducto4() {
        return this.producto4;
    }
    public void imprimir(){
        System.out.println("*** Factura ***");
        System.out.println("Numero: "+this.numero);
        SimpleDateFormat f = new SimpleDateFormat("YYYY/MM/dd");
        System.out.println("Fecha: "+f.format( this.fecha.getTime() ));
        //si el cliente es null se imprime como consumidor final
        System.out.print("Cliente: ");
        if( this.cliente == null )
            System.out.println("Consumidor Final");
        else
        {
            System.out.println(this.cliente.nombre);
            System.out.println("RTN: "+this.cliente.rtn);
        }
        System.out.println("producto\tprecio");
        float subtotal = 0.00f;
        //por como esta diseñada la clase, producto1 no puede venir null asi que
        //no es necesario validarlo
        System.out.print(this.producto1.nombre+"\t");
        System.out.println(this.producto1.precioVenta);
        subtotal += producto1.precioVenta;
        //producto2 a producto4 tiene probabilidad de venir null, se validan:
        if( this.producto2 != null ){
            System.out.print(this.producto2.nombre+"\t");
            System.out.println(this.producto2.precioVenta);
            subtotal += producto2.precioVenta;
        }
        if( this.producto3 != null ){
            System.out.print(this.producto3.nombre+"\t");
            System.out.println(this.producto3.precioVenta);
            subtotal += producto3.precioVenta;
        }
        if( this.producto4 != null ){
            System.out.print(this.producto4.nombre+"\t");
            System.out.println(this.producto4.precioVenta);
            subtotal += producto4.precioVenta;
        }
        DecimalFormat formato = new DecimalFormat();
        formato.setMaximumFractionDigits(2);
        formato.setMinimumFractionDigits(2);
        System.out.println("Subtotal: "+formato.format(subtotal));
        System.out.println("ISV 15%: "+formato.format(subtotal*0.15f));
        System.out.println("Total: "+formato.format(subtotal*1.15f));
        
    }
}