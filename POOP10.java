/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop10;

/**
 *
 * @author brayan
 */
public class POOP10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hola mundo.");
        
        //Manejo de excepciones
        try{
            String mensajes[] = {"Primero", "Segundo", "Tercero"};
            for (int i=0; i<=3; i++) 
                System.out.println(mensajes[i]);
        //ArrayIndexOutOfBoundsException-Indica que se ha accedido a una matriz con índice ilegal
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage()); //Devuelve la cadena de mensaje detallada de este arrojable
            System.out.println("Error: apuntador fuera del rango del arreglo.");    
        }
        
        
        System.out.println("Hola mundo dos.");
        
        try {
            double x; 
            x = 0/0; 
            System.out.println(x); 
        //ArithmeticException-Se lanza cuando se ha producido una condición aritmética excepcional
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());//Regresa el atributo, mesaje tipo cadena
            System.out.println("Error: division entre cero.");
        }
        
        try {
            double x; 
            x = 0/0; 
            System.out.println(x); 
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());//Regresa el atributo, cadena que se envia al objeto cuando se construye
            System.out.println("Error: division entre cero. ");
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
            System.out.println("Error: division entre cero. ");
        //Exception-Indica condiciones que una aplicación razonable podría querer detectar.
        } catch (Exception e){
            System.out.println(e.getMessage());
        } 
        
        try {
            double x; 
            x = 0/0; 
            System.out.println(x); 
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());//Regresa el atributo, mesaje tipo cadena
            e.printStackTrace();
        }
        
        
        System.out.println("Hola Mundo 3");
        
        try {
            double division = division(4f,6.0); 
        //UnsupportedOperationException-Se lanza para indicar que la operación solicitada no es compatible.
        } catch (UnsupportedOperationException e){
            System.out.println(e.getMessage());
        }
        
    }

    private static double division(float f, double d) {
        throw new UnsupportedOperationException("Operacion no soportada."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    //Throwable: La clase Throwable es la superclase de todos los errores y excepciones en el lenguaje Java.
}
