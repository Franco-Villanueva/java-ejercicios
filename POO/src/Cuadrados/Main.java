/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cuadrados;

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
        Scanner leer = new Scanner(System.in);
        System.out.println("ingresa base y luego la altura");
        Rectangulo pro1 = new Rectangulo(leer.nextInt(),leer.nextInt());
        
        System.out.println("el perimetro de rectangulo es: "+ pro1.sacarPerimetro());
        System.out.println("la superficie de rectangulo es: "+ pro1.sacarSuperficie());
        System.out.println("la base es: "+pro1.getBase()+" y la altura es: "+pro1.getAltura());
        pro1.dibujar();
    }
    
}
