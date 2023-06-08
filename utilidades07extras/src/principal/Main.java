
package principal;

import entidad.Juego;
import java.util.Scanner;
import servicio.JuegoServicio;


public class Main {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        JuegoServicio serv = new JuegoServicio();
        
        String volverJugar;
        
        do{
        Juego juego1 = serv.sorteo();
        
        serv.jugar(juego1);
        
        
        
        System.out.println("Para salir presione 'S'");
        
        volverJugar = leer.next();
        
        }while(!volverJugar.equalsIgnoreCase("s"));
    }
    
}
