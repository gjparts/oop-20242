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
public class Estudiante {
    //atributos
    public String cuenta;
    public String nombre;
    public String carrera;
    private int edad;
    private Direccion direccion;
    public Cargo trabajo;
    //consturctor
    public Estudiante(String cuenta, String nombre, String carrera, int edad, Direccion direccion, Cargo trabajo) {
        this.cuenta = cuenta;
        this.nombre = nombre;
        this.carrera = carrera;
        this.setEdad(edad);
        this.setDireccion(direccion);
        this.trabajo = trabajo;
    }
    //metodos
    public void setEdad(int edad) {
        if( edad >= 0 )
            this.edad = edad; //se acepta
        else
            throw new IllegalArgumentException("Estudiante: edad debe ser >= 0");
    }
    public int getEdad() {
        return this.edad;
    }
    //un Estudiante se puede cambiar de direccion aun despues de creado
    public void setDireccion(Direccion direccion) {
        if( direccion != null )
            this.direccion = direccion; //se acepta
        else
            throw new IllegalArgumentException("Estudiante: direccion no puede ser null");
    }
    public Direccion getDireccion() {
        return this.direccion;
    }
    public void imprimir(){
        System.out.println("************* Estudiante *************");
        System.out.println("Cuenta: "+this.cuenta);
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Carrera: "+this.carrera);
        System.out.println("Edad: "+this.edad+" años");
        //asi como esta diseñada esta clase estoy seguro que direccion no podrá
        //ser null por lo que no es tan necesario validarlo
        System.out.println("Direccion:");
        System.out.println("\tCalle: "+this.direccion.calle);
        System.out.println("\tAvenida: "+this.direccion.ave);
        System.out.println("\tCasa: "+this.direccion.casa);
        //asi como esta diseñada esta clase estoy seguro que barrio dentro de direccion
        //no podrá ser null por lo que no es tan necesario validarlo
        System.out.println("\tBarrio: "+this.direccion.getBarrio().nombre);
        System.out.println("\tCiudad: "+this.direccion.getBarrio().ciudad);
        System.out.println("\tMunicipio: "+this.direccion.getBarrio().municipio);
        System.out.println("\tPais: "+this.direccion.getBarrio().pais);
        //el trabajo si tiene el peligro de venir null, debemos validarlo antes de leerlo
        if( this.trabajo != null ){
            //imprimir toda la informacion del trabajo del Estudiante
        }
    }
}
