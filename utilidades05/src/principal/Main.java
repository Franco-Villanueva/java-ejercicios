
package principal;

import entidad.Persona;
import java.util.Scanner;
import servicio.PersonaServicio;


public class Main {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        PersonaServicio serv = new PersonaServicio();
        
        
        Persona persona1 = serv.crearPersona();
        
         String respuesta = "";
        do{
            
            System.out.println("1- es MAYOR DE EDAD");
            System.out.println("2- Comparar con otra edad");
            System.out.println("3- Fecha de Actual");
            System.out.println("4- info");
            System.out.println("5- SALIR");
            int opcion = leer.nextInt();
            switch(opcion){
                case 1:
                    System.out.println(serv.mayorDeEdad(persona1));
                    System.out.println("=========================");
                    break;
                case 2:
                    System.out.println("ingresar EDAD a comparar");
                    int edad = leer.nextInt();
                    boolean resp = serv.menorQue(persona1, edad);
                    System.out.println(resp);
                    System.out.println("=========================");
                    break;
                case 3:
                    System.out.println(serv.obtenerFechaActual());
                    System.out.println("=========================");
                    break;
                case 4:
                    serv.mostrarInfo(persona1);
                    System.out.println("=========================");
                    break;
                case 5:
                    System.out.println("para salir presione S");
                    respuesta = leer.next();
                    System.out.println("=========================");
                    break;
                default:
                    System.out.println("ninguna opcion ingresada");
                    System.out.println("=========================");
            }
            
        }while(!respuesta.equalsIgnoreCase("s"));
        
    }
    
}
