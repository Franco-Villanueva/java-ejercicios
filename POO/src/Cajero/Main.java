/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cajero;

import java.util.Random;
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
        Random rnd = new Random();
        Scanner leer = new Scanner(System.in);
        
        System.out.println("ingrese cuenta");
        String cuenta = leer.next();
        int saldo = rnd.nextInt(10000);
        
        Cuenta persona1 = new Cuenta(cuenta, saldo);
        
        persona1.retirarDinero();
        System.out.println(persona1.toString());
        
    }
    
}
