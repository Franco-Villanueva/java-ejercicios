
package servicio;

import entidad.Cadena;
import java.util.Scanner;


public class CadenaServicio {
    
    Scanner leer = new Scanner(System.in);
    
    public Cadena ingresarFrase(){
        Cadena str = new Cadena();
        
        System.out.println("ingresar frase");
        str.setFrase(leer.nextLine());
        str.setLongitud(str.getFrase().length());
        
        return str;
    }
    

    public void mostrarVocales(Cadena str){
       int contador = 0;
        
       for(int i = 0; i < str.getLongitud();i++){
        
           String letra = str.getFrase().toLowerCase().substring(i,i+1);
           
           if( letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")){
               contador++;
           }   
       }
        System.out.println("cantidad de vocales son: "+contador);
        System.out.println("===============");
    }
    
    
    public void invertirFrase(Cadena str){
        String invertida = "";
        for (int i = str.getLongitud() - 1; i >= 0; i--) {
            
                invertida += str.getFrase().charAt(i);
	}
        System.out.println(invertida);
        System.out.println("===============");
    }
    
    
    public void vecesRepetir(Cadena str, String caract){
       int contador = 0;
        
       for(int i = 0; i < str.getLongitud();i++){
           
           String letra = str.getFrase().substring(i,i+1);
           
           if( letra.equalsIgnoreCase(caract)){
               contador++;
           }   
       }
        System.out.println("cantidad de veces que se repite: "+contador);
    }
   
    public void unirFrase(Cadena str, String newFrase){
        System.out.println("FRASE CONCATENADA");
        System.out.println(str.getFrase()+" "+newFrase);
        System.out.println("============================");
    }
    
    
    public void compararLongitud(Cadena str, String newLongitud){
        if(str.getLongitud()== newLongitud.length()){
            System.out.println("tienen la misma longitud");
        }else{
            System.out.println("no tienen la misma longitud");
        }
        System.out.println("===============");
    }
    
    
    public void reemplazar(Cadena str, String letra){
        String nuevaFrase = "";
        
        for(int i = 0; i < str.getLongitud();i++){
           
           String nLetra = str.getFrase().substring(i,i+1);
           
           switch(nLetra){
               case "a":
                   nuevaFrase += letra;
                   break;
               default:
                   nuevaFrase += nLetra;
                   break;
           }
           
       }
        System.out.println(nuevaFrase);
        System.out.println("===============");
    }
    
    public void contiene(Cadena str, String letra){
        boolean bandera = false;
        
       for(int i = 0; i < str.getLongitud();i++){
           String nLetra = str.getFrase().substring(i,i+1);
           if(letra.equalsIgnoreCase(nLetra)){
               bandera=true;
               break;
           }   
       }
        if(bandera==true){
            System.out.println("la frase contiene la letra");
        }else{
            System.out.println("la frase no contiene la letra");
        }
        System.out.println("===============");
    }
}
