/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg03_asociacion_estudiante;

/**
 * Define a un barrio geografico
 * @author Gerardo Portillo
 */
public class Barrio {
    //atributos
    public String nombre;
    public String pais;
    public String departamento;
    public String ciudad;
    //constructores
    public Barrio(String nombre, String pais, String municipio, String ciudad) {
        this.nombre = nombre;
        this.pais = pais;
        this.departamento = municipio;
        this.ciudad = ciudad;
    }
}
