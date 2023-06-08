package principal;

import entidad.Curso;
import java.util.Scanner;
import servicio.CursoServicio;


public class Main {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        CursoServicio serv = new CursoServicio();
        
        
        System.out.println("cantidad de curso para agregar");
        int cursoCantidad = leer.nextInt();
        
        Curso [] cantidad = new Curso[cursoCantidad];
        
        for (int i = 0; i < cantidad.length ; i++) {
            
            Curso crs = serv.crearCurso();
            
            serv.calcularGananciaSemanal(crs);
            cantidad[i] = crs;
            
        }
        
        serv.mostrarGananciaSemanal(cantidad);
        }
    
}
