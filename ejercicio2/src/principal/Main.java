
package principal;

import entidad.Cafetera;
import java.util.Scanner;
import servicio.CafeteraServicio;


public class Main {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        CafeteraServicio serv = new CafeteraServicio();
        
        Cafetera cafetera1 = serv.llenarCafetera();
        
        
        String respuesta = "";
        do{
            
            System.out.println("1- Servir Taza");
            System.out.println("2- Vaciar cafetera");
            System.out.println("3- Agregar cafe");
            System.out.println("4- info");
            System.out.println("5- SALIR");
            int opcion = leer.nextInt();
            switch(opcion){
                case 1:
                    serv.servirTaza(cafetera1);
                    break;
                case 2:
                    serv.vaciarCafetera(cafetera1);
                    break;
                case 3:
                    serv.agregarCafe(cafetera1);
                    break;
                case 4:
                    serv.info(cafetera1);
                    break;
                case 5:
                    System.out.println("para salir presione S");
                    respuesta = leer.next();
                    break;
                default:
                    System.out.println("ninguna opcion ingresada");
            }
            
        }while(!respuesta.equalsIgnoreCase("s"));
        
    }
    
}
