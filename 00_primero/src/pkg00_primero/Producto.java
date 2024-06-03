/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg00_primero;

/**
 *
 * @author Gerardo
 */
public class Producto {
    //atributos
    public String codigo;
    public String nombre;
    public String fabricante;
    public boolean importado;
    public float precio;
    //constructores
    public Producto(String codigo, String nombre,
                    String fabricante, boolean importado, float precio){
        this.codigo = codigo;
        this.nombre = nombre;
        this.fabricante = fabricante;
        this.importado = importado;
        this.precio = precio;
    }
    public Producto(String codigo, String nombre, float precio){
        //reutilizar el constr. de 5 parametros
        this(codigo, nombre, "No tiene", false, precio);
    }
    //metodos
    public void imprimir(){
        System.out.println("******************************");
        System.out.println("Codigo: "+this.codigo);
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Fabricante: "+this.fabricante);
        System.out.println("Importado: "+( this.importado == true ? "Si" : "No" ) );
        
        /*if( this.importado == true )
            System.out.println("Importado: Si");
        else
            System.out.println("Importado: No");*/
        
        System.out.println("Precio: "+this.precio);
    }
}
