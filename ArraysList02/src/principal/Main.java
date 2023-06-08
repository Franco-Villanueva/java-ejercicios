
package principal;

import entidad.Alumno;
import java.util.ArrayList;
import java.util.Scanner;
import servicio.AlumnoServicio;


public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        AlumnoServicio serv = new AlumnoServicio();
        
        ArrayList<Alumno> curso = serv.crearCurso();
        
        serv.mostraAlumnos(curso);
        
        System.out.println("ingrese el nombre de alumno para calcular nota final");
        double valor = serv.calcularNotaFinal(leer.next(), curso);
        
        if(valor >= 0){
            System.out.println("la nota final es :"+valor);
        }else{
            System.out.println("el alumno no existe");
        }
        
    }
    
}
