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
public class Carro {
    //atributos
    public String marca;
    public String modelo;
    public String color;
    public int anio;
    //constructores
    //si la clase solo tiene un constructor CON PARAMETROS; entonces
    //JAVA no le va a crear el constructor sin parametros.
    public Carro(String marca, String modelo, String color, int anio){
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.anio = anio;
    }
}
