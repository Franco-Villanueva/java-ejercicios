/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Puntos.extras;

import java.util.Scanner;

/**
 *
 * @author franco
 */
public class Puntos {
    public double puntoX1;
    public double puntoX2;
    public double puntoY1;
    public double puntoY2;


    public void crearPunto(){
        Scanner leer = new Scanner(System.in);
            System.out.println("ingresar puntoA");
            System.out.print("ejeX: ");
            puntoX1 = leer.nextDouble();
            System.out.print("ejeY: ");
            puntoY1 = leer.nextDouble();
            System.out.println("===============");
            
            System.out.println("ingresar puntoB");
            System.out.print("ejeX: ");
            puntoX2 = leer.nextDouble();
            System.out.print("ejeY: ");
            puntoY2 = leer.nextDouble();
          
    }
    
    public void sacarDistancia(){
        double num1 = Math.pow((puntoX2 - puntoX1),2);
        double num2 = Math.pow((puntoX2-puntoY1),2);
        double d = Math.sqrt((num1+num2));
        System.out.println("la distancia es "+ d);
    }
    
}
