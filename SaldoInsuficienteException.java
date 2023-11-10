/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop10;

/**
 *
 * @author brayan
 */
//Clase que se comporta como excepcion puesto que es una clase que se hereda de Exception aunque también se puede heredar de Throwable
public class SaldoInsuficienteException extends Exception {
    private String message; 
    
    public SaldoInsuficienteException(){
    }
    
    public SaldoInsuficienteException(String message){
        super("Saldo insuficiente.");
    }
}
