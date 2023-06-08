package servicio;

import entidad.Juego;
import java.util.Random;
import java.util.Scanner;


public class JuegoServicio {
    Scanner leer = new Scanner(System.in);
    Random random = new Random();
    
    public Juego sorteo(){
        Juego jg1 = new Juego();
        String mes = jg1.getMeses()[random.nextInt(12)];
        jg1.setMesSecreto(mes);
        return jg1;
    }
    
    public void jugar(Juego obj){
        boolean bandera = false;
        
        do{
        System.out.println("=================");
        System.out.print("ingresar mes =>> ");
        String adivinador = leer.next().toLowerCase();
        
        if(adivino(obj,adivinador)){
            System.out.println("adivinaste el mes");
            System.out.println("=================");
            bandera =true;
        } else{
            System.out.println("intenta de nuevo");
            System.out.println("=================");
        }
        }while(bandera == false);
    }
    
    
    public boolean adivino(Juego obj,String adivinador){
        return adivinador.equalsIgnoreCase(obj.getMesSecreto());
    }
}
