package principal;

import entidad.Estudiante;
import servicio.EstudianteServicio;

public class Main {

    public static void main(String[] args) {
        
        EstudianteServicio serv = new EstudianteServicio();
        Estudiante[] escuela1 = new Estudiante[8];
        
        escuela1 = serv.crearCurso();
        
        
        int aprobados = serv.superaronPromedio(escuela1);
        
        Estudiante[] pasaronDeAnio = new Estudiante[aprobados];
        
        pasaronDeAnio = serv.mayorPromedio(escuela1);
        
        serv.mostrarAprobados(pasaronDeAnio);

    }

}
