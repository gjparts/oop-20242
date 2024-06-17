/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg02_asociacion_clases;

/**
 * Describe una Sim Card para conectar a un operador de servicios telefonicos
 * @author Gerardo Portillo
 * @since 2024-06-17
 */
/*en Chip: en el operador necesito que se pueda inicializar/cambiar por
el constructor y por medio de un metodo set, hacerle el metodo get.
No olvide que la relacion entre Operador y Chip es por composicion.*/
public class Chip {
    //atributos
    private Operador proveedor;
    public int numeroTelefonico;
    //constructor
    public Chip(Operador proveedor, int numeroTelefonico) {
        this.setProveedor(proveedor); //inicializar el proveedor a traves de su metodo set
        this.numeroTelefonico = numeroTelefonico;
    }
    //metodos
    public Operador getProveedor() {
        return this.proveedor;
    }
    public void setProveedor(Operador proveedor) {
        //operador no puede ser null ya que su relacion con Chip es por composicion
        if( proveedor == null )
            throw new IllegalArgumentException("Chip: el operador no se permite null");
        else
            this.proveedor = proveedor; //se acepta
    }
    
}
