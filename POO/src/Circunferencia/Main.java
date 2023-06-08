/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Circunferencia;

import java.util.Scanner;

/**
 *
 * @author franco
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner (System.in);
        
        Circunferencia c1 = new Circunferencia(leer.nextDouble());
        
        System.out.println("el radio es: "+ c1.getRadio());
        System.out.println("el area es: "+ c1.sacarArea());
        System.out.println("el perimetro es: "+c1.sacarPerimetro());
        
        
        Circunferencia c2 = new Circunferencia(0);
        
        c2.crearCircunferencia();
        
        System.out.println("el radio es: "+ c2.getRadio());
        System.out.println("el area es: "+ c2.sacarArea());
        System.out.println("el perimetro es: "+c2.sacarPerimetro());
    }
    
}
