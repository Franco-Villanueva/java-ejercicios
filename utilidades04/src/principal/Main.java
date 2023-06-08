
package principal;

import java.util.Date;
import servicio.DateServicio;


public class Main {

    
    public static void main(String[] args) {
       
        DateServicio serv = new DateServicio();
        
        Date fechaNacimiento = serv.fechaDeNacimiento();
        System.out.println("Fecha de nacimiento: " + fechaNacimiento);
        
        
        Date fechaActual = serv.obtenerFechaActual();
        System.out.println("Fecha actual: " + fechaActual);

        int edad = serv.diferenciaDeFechas(fechaNacimiento, fechaActual);
        System.out.println("Edad del usuario: " + edad + " años");
    }
    
}
