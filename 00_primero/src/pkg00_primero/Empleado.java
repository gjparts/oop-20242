/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg00_primero;

/**
 * Define a un Empleado
 * @author Gerardo Portillo
 * @since 2024-06-05
 */
public class Empleado {
    //atributos
    public String nombre;
    private int edad;
    private char genero;
    private float salario;
    private char contrato;
    //constructor
    public Empleado(String nombre, int edad, char genero,
            float salario, char contrato) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.salario = salario;
        this.contrato = contrato;
    }
    //metodos
    /**
     * establece la edad del Empleado
     * @param edad la edad del empleado, debe ser mayor o igual que cero
     */
    public void setEdad(int edad){
        if( edad >= 0 )
            this.edad = edad; //se acepta
        else
            throw new IllegalArgumentException("edad solo permite numeros >= 0");
    }
    /**
     * devuelve la edad del Empleado
     * @return un numero entero
     */
    public int getEdad(){
        return this.edad;
    }
}
