/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop10;

/**
 *
 * @author brayan
 */
public class Cajero {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria();
        
        try{
            cuenta.depositar(2000);
            cuenta.retirar(1000);
            cuenta.getSaldo();
            cuenta.retirar(1000);
            cuenta.getSaldo();
            cuenta.depositar(200);
            cuenta.retirar(300);
        } catch (SaldoInsuficienteException e){
            e.printStackTrace(); //Imprime la taza de error, es decir, el metodo donde se genero el problema y los metodos que se invocaron antes de este
        }
    }
}
