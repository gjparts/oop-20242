/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10_polimorfismo1;

/**
 *
 * @author Gerardo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal a1 = new Animal("Hipopotamo","Hipopotámido",4,true);
        a1.imprimir();
        a1.hablar();
        
        Gato g1 = new Gato("Mandarino",true,4,true);
        g1.imprimir();
        g1.ronronear();
        g1.hablar();
    }
    
}
