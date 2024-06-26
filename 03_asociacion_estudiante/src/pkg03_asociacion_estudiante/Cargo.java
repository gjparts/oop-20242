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
public class Cargo {
    //atributos
    public String descripcion;
    private char jornada;
    private Empresa empresa;
    private float salario;
    //constructor
    public Cargo(String descripcion, char jornada, Empresa empresa, float salario) {
        if( empresa != null )
            this.empresa = empresa; //se acepta
        else
            throw new IllegalArgumentException("Cargo: empresa no debe ser null");
        
        this.descripcion = descripcion;
        this.setJornada(jornada);
        this.setSalario(salario);
    }
    //metodos
    /**
     * Establece la jornada laboral
     * @param jornada valor char, puede ser: M = mañana, T = Tarde, N = Noche.
     */
    public void setJornada(char jornada) {
        if( jornada == 'M' || jornada == 'T' || jornada == 'N' )
            this.jornada = jornada; //se acepta
        else
            throw new IllegalArgumentException("Cargo: jornada solo acepta M T N");
    }
    /**
     * Establece el salario para un cargo laboral
     * @param salario valor float >= 0
     */
    public void setSalario(float salario) {
        if( salario >= 0 )
            this.salario = salario; //se acepta
        else
            throw new IllegalArgumentException("Cargo: salario debe ser >= 0");
    }
    public char getJornada() {
        return this.jornada;
    }
    public String getJornadaDescripcion(){
        //en una estructura switch si usa return ya no es necesario poner break en cada caso
        switch(this.jornada){
            case 'M': return "Mañana";
            case 'T': return "Tarde";
            case 'N': return "Noche";
            default: return "No valido";
        }
    }
    public float getSalario() {
        return this.salario;
    }
    public Empresa getEmpresa() {
        return this.empresa;
    }
    
}
