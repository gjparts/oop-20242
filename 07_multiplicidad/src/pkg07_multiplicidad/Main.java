/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg07_multiplicidad;

/**
 *
 * @author Gerardo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Barrio carmen = new Barrio("El Carmen","Este","21101");
        
        Direccion dir1 = new Direccion(carmen);
        dir1.calle = "Principal";
        Direccion dir2 = new Direccion(carmen);
        dir2.calle = "Por el centro de Salud";
        dir2.avenida = "2";
        
        Persona per1 = new Persona("1401198201055", "Gerardo Portillo", 77777777);
        per1.direccion = dir1;
        per1.empresaLabora = new Empresa("2G", dir2, 77777777);
        
        Mascota m1 = new Mascota("Firulais", "Perro");
        Mascota m2 = new Mascota("Mandarino", "Gato");
        Mascota arr1[] = {m1, null, m2, new Mascota("Paquito", "Loro")};
        per1.mascotas = arr1;
        
        Diploma di1 = new Diploma("New Horizons","SAP R3");
        per1.diplomas.push( new Diploma("INFOP", "Reparacion de maquinas de coser") );
        per1.diplomas.push(di1);
        
        per1.imprimir();
    }
    
}
