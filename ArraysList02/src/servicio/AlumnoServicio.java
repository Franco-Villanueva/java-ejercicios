package servicio;

import entidad.Alumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AlumnoServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public ArrayList<Alumno> crearCurso() {
        
        ArrayList<Alumno> curso = new ArrayList<>();
        do{
        Alumno persona = new Alumno();
        
        System.out.println("ingrese el nombre");
        persona.setNombre(leer.next());
        
        ArrayList<Integer> notas = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            System.out.println("ingrese nota " + (i + 1));
            notas.add(leer.nextInt());
        }
        persona.setNotas(notas);
        curso.add(persona);
        
        }while(!confirmador());
        
        return curso;
    }

    public Boolean confirmador() {
        Character resp = 'a';
        
        while (resp != 'S') {
            System.out.println("Quiere seguir agregando Alumnos S/N");

            resp = leer.next().toUpperCase().charAt(0);
            if (resp==('N')) {

                return true;
            }
        }
        return false;
    }
    
    
    public double calcularNotaFinal(String nombre, ArrayList<Alumno>curso) {
        
        for (Alumno valor : curso) {
            
            if (valor.getNombre().equalsIgnoreCase(nombre)) {
                
                Iterator<Integer> itera = valor.getNotas().iterator();
                
                double suma = 0;
                int contador = 0;
                
                while (itera.hasNext()) { 
                    suma += itera.next();
                    contador++;
                }
                
                return suma / contador;
            }
        }
        return -1;
    }

    public void mostraAlumnos(ArrayList<Alumno>curso) {
        System.out.println("=======================");
         for (Alumno var : curso) {
             System.out.println("nombre :"+var.getNombre());
             System.out.println("=======================");
        }
    }
}
