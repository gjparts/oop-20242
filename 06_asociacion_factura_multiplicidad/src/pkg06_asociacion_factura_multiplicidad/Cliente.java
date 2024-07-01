package pkg06_asociacion_factura_multiplicidad;
public class Cliente {
    //atributos
    public String nombre;
    public long rtn;
    public int telefono;
    public String correo;
    //constructor
    public Cliente(String nombre, long rtn, int telefono, String correo) {
        this.nombre = nombre;
        this.rtn = rtn;
        this.telefono = telefono;
        this.correo = correo;
    }
}
