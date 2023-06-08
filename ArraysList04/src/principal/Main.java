
package principal;

import entidad.Pais;
import java.util.ArrayList;
import java.util.Scanner;
import servicio.PaisServicio;


public class Main {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        PaisServicio serv = new PaisServicio();
        
        
        ArrayList<Pais> naciones = serv.crearPais();
        char resp = 'a';
        do{
        System.out.println("ingrese pais que desea eliminar de la lista");
        serv.eliminarPais(leer.next());
            System.out.println("eliminar otro");
            resp = leer.next().toLowerCase().charAt(0);
        }while(resp != 's');
    }
    
}
