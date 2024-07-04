package pkg07_multiplicidad;
public class Empresa {
    //atributos
    public String nombre;
    private Direccion direccion;
    public int telefono;
    //constructor
    public Empresa(String nombre, Direccion direccion, int telefono) {
        this.setDireccion(direccion);
        this.nombre = nombre;
        this.telefono = telefono;
    }
    //metodos
    public void setDireccion(Direccion direccion) {
        if( direccion != null )
            this.direccion = direccion; //se acepta
        else
            throw new IllegalArgumentException("Empresa: direccion obligatoria");
    }
    public Direccion getDireccion() {
        return direccion;
    }
    
}
