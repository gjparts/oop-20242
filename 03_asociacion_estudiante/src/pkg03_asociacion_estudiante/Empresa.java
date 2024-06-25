/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg03_asociacion_estudiante;

/**
 * Describe a una empresa/negocio
 * @author Gerardo Portillo
 */
public class Empresa {
    //atributos
    public String nombre;
    public String rubro;
    private Direccion direccion;
    public String telefono;
    //constructor
    public Empresa(String nombre, String rubro, Direccion direccion, String telefono) {
        this.nombre = nombre;
        this.rubro = rubro;
        this.setDireccion(direccion); //la asignacion de direccion se hace por set
        this.telefono = telefono;
    }
    //metodos
    //una Empresa puede cambiar su domicilio aunque ya este creada, entonces
    //es util ponerle set para hacer dicho cambio en cualquier momento
    public void setDireccion(Direccion direccion) {
        if( direccion != null )
            this.direccion = direccion; //se acepta
        else
            throw new IllegalArgumentException("Empresa: direccion no puede ser null");
    }
    //ofrecer la posibilidad de leer la direccion de la Empresa desde fuera de la clase
    public Direccion getDireccion() {
        return direccion;
    }
}
