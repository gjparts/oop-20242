/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg02_asociacion_clases;

/**
 * Describe una bateria para dispositivos electronicos
 * @author Gerardo Portillo
 * @since 2024-06-17
 */
public class Bateria {
    //atributos
    private Fabricante marca;
    public float miliamperios;
    //constructor
    public Bateria(Fabricante marca, float miliamperios) {
        /*en Bateria: el fabricante solo se podra inicializar por el constructor,
        es obligatrio (composicion) y solo hagale el get*/
        //si marca es null entonces no permitimos construir la Bateria
        if( marca == null )
            throw new IllegalArgumentException("Bateria: la marca no debe ser null");
        else
            this.marca = marca; //se acepta
        
        this.miliamperios = miliamperios;
    }
    //metodos
    public Fabricante getMarca() {
        return this.marca;
    }
    
}
