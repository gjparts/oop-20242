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
        
        Perro p1 = new Perro("Killer", "Doberman", 4, false);
        p1.imprimir();
        p1.hablar();
        p1.jugar();
        
        //se puede aplicar polimorfismo en el momento de inicializar
        //el objeto, quedando el override funcional solo para el objeto
        //sin alterar a la clase
        Animal a2 = new Animal("Gallina", "Gallus gallus", 2, true){
            //Adentro de aqui estamos en la definicion de Animal
            //para el objeto a2
            //el polimorfismo aqui se aplicara al objeto a2
            @Override
            public void hablar(){
                System.out.println("Co co co co coco");
            }
        };
        a2.imprimir();
        a2.hablar();
        
        Animal a3 = new Animal("Gallo","Gallus gallus", 2, true);
        a3.imprimir();
        a3.hablar();
    }
    
}
