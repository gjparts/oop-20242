/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg03_asociacion_estudiante;

/**
 * Define una direccion geografica
 * @author Gerardo Portillo
 */
public class Direccion {
    //atributos
    private Barrio barrio;
    public String calle;
    public String ave;
    public String casa;
    //constructores
    public Direccion(Barrio barrio, String calle, String ave, String casa) {
        //relacion entre Barrio y Direccion es por composicion
        if( barrio != null )
            this.barrio = barrio; //se acepta
        else
            throw new IllegalArgumentException("Direccion: barrio no se permite null.");
        
        this.calle = calle;
        this.ave = ave;
        this.casa = casa;
    }
    public Barrio getBarrio() {
        return this.barrio;
    }
    
}
