
package principal;

import entidad.Pelicula;
import java.util.ArrayList;
import java.util.Scanner;
import servicio.PeliculaServicio;

public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        PeliculaServicio serv = new PeliculaServicio();
        
        ArrayList<Pelicula> lista = serv.subirPelicula();
        
        System.out.println("----------MOSTRAR PELICULA----------");
        serv.mostrar(lista);
        System.out.println("----------ORDEN MAYOR A 1(HORA)----------");
        serv.mayor_Hora(lista);
        System.out.println("----------ORDEN DE MAYOR A MENOR----------");
        serv.de_Mayor_Menor(lista);
        System.out.println("----------ORDEN DE MENOR A MAYOR----------");
        serv.de_Menor_Mayor(lista);
        System.out.println("----------ORDEN ALFABETICO(TITULO)----------");
        serv.orden_Titulo(lista);
        System.out.println("----------ORDEN ALFABETICO(DIRECTOR)----------");
        serv.orden_Director(lista);
    }
    
}
