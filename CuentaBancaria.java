/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop10;

/**
 *
 * @author brayan
 */
public class CuentaBancaria {
    private double saldo; 
    
    public CuentaBancaria(){
        saldo=0;
    }
    
    public void depositar(double monto){
        System.out.println("Depositando " + monto);
        saldo += monto;
    }
    
    //throws-Indica que un metodo puede lanzar una excepcion 
    public void retirar(double monto) throws SaldoInsuficienteException {
        System.out.println("Retirando " + monto);
        if(saldo < monto)
            //throw-Una excepcion lanzada de manera explicita, la arroja
            throw new SaldoInsuficienteException();
        else
            saldo -= monto;
    }
    
    public double getSaldo(){
        return saldo;
    }
}
