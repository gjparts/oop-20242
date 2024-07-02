package pkg06_asociacion_factura_multiplicidad;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.text.DecimalFormat;
public class Factura {
    //atributos
    public int numero;
    public Calendar fecha;
    public Cliente cliente;
    private Producto[] productos; //multiplicidad: coleccion de elementos repetitivos
    //constructor
    public Factura(int numero, Calendar fecha, Cliente cliente, Producto[] productos) {
        this.numero = numero;
        this.fecha = fecha;
        this.cliente = cliente;
        //al menos debe haber un elemento en productos y el primer elemento no puede ser null
        if( productos == null )
            throw new IllegalArgumentException("Factura: arreglo productos no debe ser null.");
        else
            if( productos.length == 0 )
                throw new IllegalArgumentException("Factura: arreglo productos debe tener al menos 1 elemento.");
            else
                if( productos[0] == null )
                    throw new IllegalArgumentException("Factura: arreglo productos primer elemento no puede ser null");
                else
                    this.productos = productos; //se acepta
    }
    //metodos
    public void imprimir(){
        System.out.println("*** Factura ***");
        System.out.println("Numero: "+this.numero);
                
        //fecha puede venir null, si es asi no la imprimo
        if( this.fecha != null ){
            SimpleDateFormat f = new SimpleDateFormat("YYYY/MM/dd");
            System.out.println("Fecha: "+f.format( this.fecha.getTime() ));
        }

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
        //por como esta diseñada la clase, productos no puede venir null asi que
        //no es necesario validar
        //recorro la coleccion productos, si encuentro un
        //elemento null lo ignoro
        for( int i = 0; i < productos.length; i++ ){
            if( this.productos[i] != null ){
                System.out.print(this.productos[i].nombre+"\t");
                System.out.println(this.productos[i].precioVenta);
                subtotal += productos[i].precioVenta;
            }
        }
        
        DecimalFormat formato = new DecimalFormat();
        formato.setMaximumFractionDigits(2);
        formato.setMinimumFractionDigits(2);
        System.out.println("Subtotal: "+formato.format(subtotal));
        System.out.println("ISV 15%: "+formato.format(subtotal*0.15f));
        System.out.println("Total: "+formato.format(subtotal*1.15f));   
    }
    //devolver la coleccion de productos
    public Producto[] getProductos(){
        return this.productos;
    }
}