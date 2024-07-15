/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg08_herencia1;

/**
 *
 * @author Gerardo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estudiante es1 = new Estudiante("Gerardo", "20012002049", "Ing. Industrial");
        es1.edad=42;
        es1.saludar();
        es1.estudiar();
        
        Persona per1 = new Persona("Filomeno Colinas", 78, 'M');
        per1.saludar();
        
        Empleado em1 = new Empleado("Kurko Bain", 28, 'M', "Guitarrista/Vocalista", 300000);
        em1.saludar();
        em1.trabajar();
        System.out.println(em1.genero);
        System.out.println(em1.edad);
        System.out.println(em1.salario);
        
        Empleado em2 = new Empleado();
        em2.saludar();
        em2.trabajar();
        System.out.println(em2.genero);
        System.out.println(em2.edad);
        System.out.println(em2.salario);
        
        Practicante prac1 = new Practicante("Bob Patiño", 40, 6);
        prac1.saludar();
        prac1.trabajar();
        System.out.println(prac1.genero);
        System.out.println(prac1.salario);
        System.out.println(prac1.meses);
        System.out.println(prac1.cargo);
        
        Catedratico cat1 = new Catedratico("Gerardo", 42, 'M', "Programador", 12000);
        cat1.saludar();
        cat1.trabajar();
        System.out.println(cat1.genero);
        System.out.println(cat1.salario);
        System.out.println(cat1.cargo);
        
    }
    
}
