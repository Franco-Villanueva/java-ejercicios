/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //instanciacion utilizando el contructor vacio
        Libro libro1 = new Libro ();
        
        libro1.ingresarDatos();
        libro1.info();
        
        System.out.println(libro1);
        
    }
    
}
