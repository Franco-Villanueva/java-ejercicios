package principal;

import entidad.Nif;
import servicio.NifServicio;


public class Main {

    
    public static void main(String[] args) {
        NifServicio serv = new NifServicio();
        
        Nif obj = serv.crearNif();
        
        serv.mostrar(obj);
        
        
        
        
    }
    
}
