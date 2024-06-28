/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg05_asociacion_factura;

import java.util.Calendar;

/**
 *
 * @author Gerardo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente cli1 = new Cliente("Filomeno Colinas", "14011982010554", 777777, "c@c.com");
        Calendar fecha1 = Calendar.getInstance();
        fecha1.set(2024, 1, 5); //5 feb 2024
        CategoriaProducto pc1 = new CategoriaProducto("Bebidas", "36");
        CategoriaProducto pc2 = new CategoriaProducto("Botanas", "35");
        
        Producto cocacola = new Producto("Coca Cola",pc1,55);
        Producto botana1 = new Producto("Churro",pc2,8);
        Producto hielo = new Producto("Hielo",pc1,20);
        
        Factura f1 = new Factura(1, fecha1, cli1, cocacola);
        f1.producto2 = cocacola;
        f1.producto3 = botana1;
        f1.producto4 = hielo;
        
        f1.imprimir();
    }
    
}
