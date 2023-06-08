package servicio;

import entidad.Curso;
import java.util.Scanner;


public class CursoServicio {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    /*Método cargarAlumnos(): este método le permitirá al usuario ingresar
    los alumnos que asisten a las clases. Nosotros nos encargaremos de almacenar 
    esta información en un arreglo e iterar con un bucle, solicitando en cada 
    repetición que se ingrese el nombre de cada alumno.*/
    public String [] cargarAlumnos(){
        String [] alumnos = new String[5];
        for (int i = 0; i < alumnos.length; i++) {
            System.out.println("ingresar nombre del alumno "+(i+1));
            alumnos[i]= leer.next();
        }
        return alumnos;
    }
    
    /*Método crearCurso(): el método crear curso, le pide los valores de los
    atributos al usuario y después se le asignan a sus respectivos atributos para
    llenar el objeto Curso. En este método invocamos al método cargarAlumnos() 
    para asignarle valor al atributo alumnos */
    public Curso crearCurso(){
        
        Curso obj = new Curso();
        System.out.println("ingresar nombre del curso");
        obj.setNombreCurso(leer.next());
        System.out.println("ingrese cantidad de horas por dia");
        obj.setCantidadHorasPorDia(leer.nextInt());
        System.out.println("ingrese cantidad de dias por semana");
        obj.setCantidadDiasPorSemana(leer.nextInt());
        System.out.println("ingreser turno(MANANA O TARDE)");
        obj.setTurno(leer.next());
        System.out.println("ingrese precio por hora");
        obj.setPrecioPorHora(leer.nextInt());
        
        obj.setAlumnos(cargarAlumnos());
        
        return obj;
    }
    
    /*Método calcularGananciaSemanal(): este método se encarga de calcular la
    ganancia en una semana por curso. Para ello, se deben multiplicar la cantidad 
    de horas por día, el precio por hora, la cantidad de alumnos y la cantidad de
    días a la semana que se repite el encuentro. */
    public void calcularGananciaSemanal(Curso obj){
        obj.setGananciaSemanal(obj.getCantidadHorasPorDia() *obj.getPrecioPorHora()* obj.getAlumnos().length * obj.getCantidadDiasPorSemana());
        
    }
    public void mostrarGananciaSemanal(Curso [] obj){
        for (int i = 0; i < obj.length; i++) {
            System.out.println("Por el curso "+(i+1)+" de "+obj[i].getNombreCurso()+", cobra semalmente $"+obj[i].getGananciaSemanal());
        }
        
        
    }

}
