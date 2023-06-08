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
public class Juego {
    private int jugador1;
    private int jugador2;
    private int intentos;
    private int ganador1;
    private int ganador2;

    public Juego() {    //CONSTRUCTOR VACIO, YA QUE INICIAMOS ATRIBUTOS EN iniciar_juego
    }
    
    public void iniciar_juego(){
        Scanner leer = new Scanner(System.in);
        
        
        
        ganador1 = ganador1 + 0;    //CONTADORES PARA SABER CUANTAS VECES GANO CADA UNO
        ganador2 = ganador2 + 0;   
        
        boolean bandera = false;    //BANDERA PARA SABER SI ADIVINO
        int vueltas = 0;
        
      
        System.out.println("ingrese cantidad de intentos");
        intentos = leer.nextInt();
         System.out.println("jugador 1 ingrese el numero a buscar");
        jugador1 = leer.nextInt();
        
        //BUCLE QUE SE ROMPE CUANDO VUELTAS SEAN MAYOR O IGUAL
        while(intentos > vueltas){
        
        System.out.println("====================================");
        System.out.println("jugador 2 adivine el numero");
        
        
        jugador2 = leer.nextInt(); //PIDE A LA PERSONA QUE ADIVINE Y SE SUMA UN INTENTO
        vueltas++;
        
         
        if(jugador1 == jugador2){
            System.out.println("ADIVINASTE");// PRIMER CONDICION QUE SI ADIVINA SE ROMPE EL BUCLE
            bandera = true;//BANDERA QUE UTILIZO AL FINAL
            break;
            
        }else if(vueltas== intentos){
            
            System.out.println("perdiste"); //EN CASO DE QUE SEA EL ULTIMO INTENTO Y FALLE 
            
        }else {
            
            if(jugador1 > jugador2){ // CONDICIONAL QUE AVISA SI EL NUMERO1 ES MENOR O MAYOR QUE EL NUMERO2
                System.out.println("el numero es mas grande");
                 System.out.println("sigue intentando...");
                                                                 //EN CASO DE QUE LE QUEDEN INTENTOS
            }else  {
                System.out.println("el numero es mas chico");
                System.out.println("sigue intentando...");
            }
           
            
            
           
        }
        }
        //CONDICIONAL DE QUIEN GANO
        if(bandera == false){
            System.out.println("jugador1 gano y jugador2 perdio");
            ganador1++;
        }else {                                                     //CONDINCION QUE DICE QUIEN GANO Y SUMA UN PUNTO
            System.out.println("jugador2 gano y jugador1 perdio");
            ganador2++;
        }
           
    }                                                                                                                                                                                                                                       
    
                            //RETORNA LOS CONTADORES DE VECES GANADAS CADA JUGADOR
    @Override
    public String toString() {
        
        return "Juego{ jugador1 gano =" +ganador1+ " jugador2 gano ="+ ganador2+"}";
        
}
}