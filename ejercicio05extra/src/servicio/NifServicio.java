package servicio;

import entidad.Nif;
import java.util.Scanner;

public class NifServicio {
    
    Scanner leer = new Scanner(System.in);
    
    public Nif crearNif(){
        char [] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        Nif creacion = new Nif();
        
        System.out.println("ingresar DNI");
        creacion.setDni(leer.nextLong());
        
        long posicion = creacion.getDni()%23;
        int num = (int)posicion;
        
        creacion.setLetra(letras[num]);
        
        return creacion;
    }
    
    public void mostrar(Nif creacion){
        System.out.println(creacion.getDni()+"-"+creacion.getLetra());
    }
    
}
