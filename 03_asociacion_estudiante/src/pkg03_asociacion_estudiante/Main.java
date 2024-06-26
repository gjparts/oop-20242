/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg03_asociacion_estudiante;

/**
 *
 * @author Gerardo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Barrio b1 = new Barrio("Jardines del Valle", "Honduras", "Cortes", "San Pedro Sula");
        Barrio elcarmen = new Barrio("El Carmen", "Honduras", "Cortes", "San Pedro Sula");
        
        Direccion dx = new Direccion(elcarmen, "Al centro de Salud", "1", "119");
        
        Empresa em1 = new Empresa("LACTOHSA", "Lacteos", new Direccion(b1, "Blv. Universidad", "", "") ,"7777-7777" );
        Cargo cargo1 = new Cargo("Supervisor", 'M', em1, 25000);
        
        Estudiante ee1 = new Estudiante("20012002049", "Gerardo Portillo", "Ing. en Sistemas", 42, dx, cargo1);
        ee1.imprimir();
        
    }
    
}
