package principal;

import entidad.Arreglo;
import servicio.ArreglosServicio;


public class Main {

    
    public static void main(String[] args) {
        ArreglosServicio serv = new ArreglosServicio();
        Arreglo obj1 = new Arreglo();
        
        serv.inicializarA(obj1);
        
        serv.mostrarArreglo(obj1);
        
        serv.ordernarArreglo(obj1);
        
        serv.inicializarB(obj1);
        
        serv.mostraAyB(obj1);
    }
    
}
