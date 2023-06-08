/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nuevo;

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
        
        System.out.println("ingrese el nombre");
        String nombre = leer.next();
        System.out.println("ingrese la edad");
        int edad = leer.nextInt();
        System.out.println("ingrese salario");
        double salario = leer.nextInt();
        
        Empleado obj1 = new Empleado(nombre,edad,salario);
        
        obj1.calcular_aumento();
        System.out.println("el salario con aumento es "+ obj1.getSalario());
        
        
    }
    
}
