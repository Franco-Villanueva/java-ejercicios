
package servicio;

import entidad.Cafetera;
import java.util.Scanner;

public class CafeteraServicio {
    
    Scanner leer = new Scanner(System.in);
    
    public void info(Cafetera obj){
        System.out.println("se mide en mililitros");
        System.out.println("la cafetera contiene max "+obj.getCapacidadMaxima());
        System.out.println("la cafetera contiene :"+ obj.getCantidadActual());
        
    }
    
    public Cafetera llenarCafetera(){
        Cafetera obj = new Cafetera();
        System.out.println("ingresar capacidad de cafetera a llenar");
        
        obj.setCantidadActual(leer.nextInt());
        
        obj.setCapacidadMaxima(obj.getCantidadActual());
        System.out.println("se lleno la cafetera");
        
        
        return obj;
    }
    
    public void servirTaza(Cafetera obj){
        System.out.println("ingrese capacidad de la taza");
        int taza = leer.nextInt();
        if(taza > obj.getCantidadActual()){
             
            System.out.println("la taza no se lleno, se agrego lo que habia: "+obj.getCantidadActual());
            
            obj.setCantidadActual(0);
            
           
        }else{
            System.out.println("la taza se lleno");
            obj.setCantidadActual(obj.getCantidadActual()-taza);
            
            
        }
        
    }
    
    public void vaciarCafetera(Cafetera obj){
        System.out.println("Se vacio la Cafetera, tenia: "+obj.getCantidadActual());
        obj.setCantidadActual(0);
        
    }
    
    public void agregarCafe(Cafetera obj){
        System.out.println("ingrese cantidad de cafe para agregar, la capacidad es de "+(obj.getCapacidadMaxima()- obj.getCantidadActual()));
        int cafe = leer.nextInt();
        if(cafe > (obj.getCapacidadMaxima()-obj.getCantidadActual())){
            
            System.out.println("ERROR: no puedes ingresar mas que la capacidad");
            
        }else{
            System.out.println("Se agrego a la cafetera");
            obj.setCantidadActual(cafe+obj.getCantidadActual());
            
        }
    }
    
}
