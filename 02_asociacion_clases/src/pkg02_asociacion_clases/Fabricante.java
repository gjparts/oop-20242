/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg02_asociacion_clases;

/**
 * Define un fabricante de productos tencologicos
 * @author Gerardo Portillo
 * @since 2024-06-17
 */
public class Fabricante {
    //atributos
    public String nombre;
    public String pais;
    public String contacto;
    //constructor
    public Fabricante(String nombre, String pais, String contacto) {
        this.nombre = nombre;
        this.pais = pais;
        this.contacto = contacto;
    }
    
}
