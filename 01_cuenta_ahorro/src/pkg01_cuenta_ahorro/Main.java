/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg01_cuenta_ahorro;

/**
 *
 * @author Gerardo Portillo
 */
import java.util.Scanner;
public class Main {
    public static void depositar(CuentaAhorro c){
        Scanner s = new Scanner(System.in);
        System.out.print("Digite monto a depositar: ");
        try{
            c.depositar( s.nextFloat() );
        }catch(Exception ex){
            System.out.println( ex.getMessage() );
        }
    }
    
    public static void retirar(CuentaAhorro c){
        Scanner s = new Scanner(System.in);
        System.out.print("Digite monto a retirar: ");
        try{
            c.retirar( s.nextFloat() );
        }catch(Exception ex){
            System.out.println( ex.getMessage() );
        }
    }
    
    public static void main(String[] args) {
        CuentaAhorro c1 = new CuentaAhorro("Gerardo", "101010101");
        CuentaAhorro c2 = new CuentaAhorro("Gerardo", "101010102");
        CuentaAhorro c3 = new CuentaAhorro("Gerardo", "101010103");
        CuentaAhorro cuentaActual = c1; //cuenta que estamos manipulando
        Scanner s = new Scanner(System.in);
        
        int opcion, opcionCuenta;
        do{
            System.out.println("Bienvenido "+cuentaActual.nombreCliente);
            System.out.println("Cuenta Actual"+cuentaActual.numeroCuenta);
            System.out.println("************ MENU ************");
            System.out.println("1) Consultar Saldo");
            System.out.println("2) Depositar");
            System.out.println("3) Retirar");
            System.out.println("4) Elegir cuenta de ahorro");
            System.out.println("5) Salir");
            System.out.print("Digitar una opcion: ");
            opcion = s.nextInt();
            switch (opcion) {
                case 1: System.out.println("Saldo Actual: "+cuentaActual.getSaldo()); break;
                case 2: depositar(cuentaActual); break;
                case 3: retirar(cuentaActual); break;
                case 4:
                    System.out.println("1) "+c1.numeroCuenta);
                    System.out.println("2) "+c2.numeroCuenta);
                    System.out.println("3) "+c3.numeroCuenta);
                    System.out.print("Digitar numero de item: ");
                    opcionCuenta = s.nextInt();
                    if( opcionCuenta == 1 ) cuentaActual = c1;
                    if( opcionCuenta == 2 ) cuentaActual = c2;
                    if( opcionCuenta == 3 ) cuentaActual = c3;
                    if( opcionCuenta < 1 || opcionCuenta > 3 ) System.out.println("Cuenta no valida");
                break;
                case 5: System.out.println("Adios"); break;
                default: System.out.println("Opcion no valida.");
            }
        }while(opcion != 5);
        
                /*
        System.out.println( c1.getSaldo() );
        //c1.retirar(100);
        c1.depositar(1000);
        System.out.println( c1.getSaldo() );
        c1.retirar(1000f);
        System.out.println( c1.getSaldo() );*/
    }
    
}
