/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg06_asociacion_factura_multiplicidad;

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
        //cuando use tipo de dato long colocar una L al final del numero (rtn del cliente)
        Cliente cli1 = new Cliente("Filomeno Colinas", 14011982010554L, 777777, "c@c.com");
        Calendar fecha1 = Calendar.getInstance();
        fecha1.set(2024, 1, 5); //5 feb 2024
        CategoriaProducto pc1 = new CategoriaProducto("Bebidas", "36");
        CategoriaProducto pc2 = new CategoriaProducto("Botanas", "35");
        
        Producto cocacola = new Producto("Coca Cola",pc1,55);
        Producto botana1 = new Producto("Churro",pc2,8);
        Producto hielo = new Producto("Hielo",pc1,20);
        
        //arreglo de productos para f1
        Producto arr1[] = {botana1, cocacola, botana1, botana1, botana1, cocacola};
        Factura f1 = new Factura(1, fecha1, cli1, arr1);
        f1.imprimir();
        //en f2, la fecha a usar es la del PC, no tiene cliente identificado y
        //los productos son un arreglo creado en el momento de la instanciacion
        Factura f2 = new Factura(2, Calendar.getInstance(),null, new Producto[]{ hielo, cocacola } );
        f2.imprimir();
        
        //acceder a determinado elemento de una coleccion dentro de una clase
        System.out.println("El tercer producto de f1 es "+f1.getProductos()[2].nombre);
        
        /*
        //hacer private una coleccion no protege a sus elementos hijos
        Producto arr2[] = f1.getProductos();
        arr2[0] = null;
        f1.imprimir();
        */
    }
    
}
