/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadora;

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
         
         //OPERACION "CAL1" PASANDO NUMEROS POR PARAMETROS
         Operacion cal1 = new Operacion(leer.nextInt(),leer.nextInt());
         
         System.out.println("la suma es: "+cal1.sumar());
         System.out.println("la resta es: "+cal1.restar());
        
         
         if(cal1.multiplicar() == 0){
             System.out.println("ERROR: no multiplica por 0");
             System.out.println(cal1.multiplicar());
         } else{
             System.out.println("la multiplicacion es: "+ cal1.multiplicar());
         }
         
         double retornoD = cal1.dividir();
         if(retornoD == 0){
             System.out.println("ERROR: no divide por 0");
             System.out.println(retornoD);
         }else{
             System.out.println("la division es: "+ retornoD);
         }
         
         
         
         //OPERACION "CAL2" SIN PASAR NUMEROS Y ENVIANDOS POR crearOperacion
         Operacion cal2 = new Operacion();
         
         cal2.crearOperacion();
         System.out.println("la suma es: "+cal2.sumar());
         System.out.println("la resta es: "+cal2.restar());
         
         if(cal2.multiplicar() == 0){
             System.out.println("ERROR: no multiplica por 0");
             System.out.println(cal2.multiplicar());
         } else{
             System.out.println("la multiplicacion es: "+ cal2.multiplicar());
         }
         
         if(cal2.dividir() == 0){
             System.out.println("ERROR: no divide por 0");
             System.out.println(cal2.dividir());
         }else{
             System.out.println("la division es: "+ cal2.dividir());
         }
        
        
        
    }
    
}
