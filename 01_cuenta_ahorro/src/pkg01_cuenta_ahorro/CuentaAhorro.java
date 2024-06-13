/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg01_cuenta_ahorro;

/**
 * Clase que describe una cuenta de ahorro
 * @author Gerardo Portillo
 * @since 2024-06-13
 */
public class CuentaAhorro {
    //atributos
    public String nombreCliente;
    public String numeroCuenta;
    private float saldo;
    //constructor
    public CuentaAhorro(String nombreCliente, String numeroCuenta){
        this.nombreCliente = nombreCliente;
        this.numeroCuenta = numeroCuenta;
        this.saldo = 0.00f;
    }
    //metodos
    /**
     * retorna el valor del saldo actual de la cuenta de ahorro
     * @return un valor float
     */
    public float getSaldo(){
        return this.saldo;
    }
    /**
     * aumenta el saldo de la cuenta
     * @param monto el valor a aumentar (float)
     */
    public void depositar(float monto){
        if( monto < 0 )
            throw new IllegalArgumentException("No se permite depositar monto negativo");
        else
            this.saldo = this.saldo + monto; //this.saldo += monto; //se acepta
    }
    /**
     * disminuye el saldo de la cuenta
     * @param monto el valor a disminuir (float)
     */
    public void retirar(float monto){
        if( monto < 0 )
            throw new IllegalArgumentException("No se permite retirar monto negativo");
        else
            if( monto > this.saldo )
                throw new IllegalArgumentException("No se puede retirar mas de lo disponible");
            else
                this.saldo = this.saldo - monto;    //this.saldo -= monto; //se acepta
    }
}
