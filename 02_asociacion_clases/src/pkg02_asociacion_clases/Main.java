/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg02_asociacion_clases;

/**
 *
 * @author Gerardo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Operador tigo = new Operador("TIGO","Honduras");
        Operador claro = new Operador("Claro C.A.","Honduras");
        
        Fabricante samsung = new Fabricante("SAMSUNG", "Korea", "No se");
        Fabricante apple = new Fabricante("Apple", "USA", "Tim Cook");
        Fabricante huawei = new Fabricante("Huawei Int.", "China", "");
        
        Bateria bat1 = new Bateria(samsung,6500);
        Bateria bat2 = new Bateria(huawei,4500);
        //se puede crear un objeto para asignarlo a un atributo
        //solo en el momento que lo va a necesitar
        //IMPORTANTE: haga esto siemore y cuando no necesite reutilizar dicho objeto.
        Bateria bat3 = new Bateria( new Fabricante("LG","Korea",""), 6000 );
        Bateria bat4 = new Bateria(samsung,3500);
        Bateria bat5 = new Bateria(huawei,9000);
        
        Chip sim1 = new Chip(tigo, 99152959);
        Chip sim2 = new Chip(tigo, 12341234);
        Chip sim3 = new Chip(claro, 33223322);
        Chip sim4 = new Chip( new Operador("AT&T","USA") , 1234567897);
        
        SmartPhone sm1 = new SmartPhone(samsung, "S90", 1024, 16, bat5, sim1, null);
        sm1.imprimir();
    }
    
}
