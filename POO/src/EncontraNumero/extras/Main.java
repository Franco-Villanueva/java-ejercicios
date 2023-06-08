/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EncontraNumero.extras;

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
        
        Juego obj1 = new Juego ();
        String sino = "";
        
        
        do{
        obj1.iniciar_juego();
        
            System.out.println("desea volver a jugar presione cualquier letra o N para salir");
            sino = leer.next();                                 //SI INGRESA "N" ROMPE EL BUCLE 
        }while(!sino.equalsIgnoreCase("N"));
        
        
        System.out.println(obj1.toString());        //MUESTRA CONTADOR DE VECES GANADAS CADA JUGADOR
    }
    
}
