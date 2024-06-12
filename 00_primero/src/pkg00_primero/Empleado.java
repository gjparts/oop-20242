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
        //los atributos privados se inicializaran por medio de los set
        this.setEdad(edad);
        this.setGenero(genero);
        this.setSalario(salario);
        this.setContrato(contrato);
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
    /**
     * establece el genero del Empleado
     * @param genero un valor char solo se acepta M para masculino,
     *               F para femenino y X para otros
     */
    public void setGenero(char genero){
        if( genero == 'M' || genero == 'F' || genero == 'X' )
            this.genero = genero; //se acepta
        else
            throw new IllegalArgumentException("genero solo permite M, F o X (en mayusculas)");
    }
    /**
     * devuelve el genero del Empleado
     * @return un valor char
     */
    public char getGenero(){
        return this.genero;
    }
    /**
     * devuelve la descripcion del genero del Empleado
     * @return un valor String
     */
    public String getGeneroDescripcion(){
        if( this.genero == 'M' ) return "Masculino";
        if( this.genero == 'F' ) return "Femenino";
        if( this.genero == 'X' ) return "Otros";
        return "No establecido";
    }
    /**
     * Establece el salario del Empleado
     * @param salario un numero float >= 0
     */
    public void setSalario(float salario){
        if( salario >= 0 )
            this.salario = salario; //se acepta
        else
            throw new IllegalArgumentException("Salario debe de ser >= 0");
    }
    /**
     * devuelve el valor del salario de un Empleado
     * @return un valor float
     */
    public float getSalario(){
        return this.salario;
    }
    /**
     * Establece el tipo de contrato laboral del Empleado
     * @param contrato nu valor char que puede ser T para Temporal, P para Permanente
     */
    public void setContrato(char contrato){
        if( contrato == 'T' || contrato == 'P' )
            this.contrato = contrato; //se acepta
        else
            throw new IllegalArgumentException("Contrato debe ser T ó P (en mayusculas)");
    }
    /**
     * devuelve el valor del tipo de contrato del Empleado
     * @return un valor char
     */
    public char getContrato(){
        return this.contrato;
    }
    /**
     * devuelve la descripcion del tipo de contrato del Empleado
     * @return un valor String
     */
    public String getContratoDescripcion(){
        if( this.contrato == 'T' ) return "Temporal";
        if( this.contrato == 'P' ) return "Permanente";
        return "No establecido";
    }
}
