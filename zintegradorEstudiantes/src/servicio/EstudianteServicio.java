package servicio;

import entidad.Estudiante;

import java.util.Scanner;

public class EstudianteServicio {

    Scanner leer = new Scanner(System.in);

    /*Calcular y mostrar el promedio de notas de todo el curso
    Retornar otro arreglo con los nombre de los alumnos que recibieron una nota mayor al promedio del curso
    Por último, deberemos mostrar todos los estudiantes con una nota mayor al promedio.*/
    public Estudiante[] crearCurso() {

        Estudiante[] curso;

        System.out.println("ingrese cantidad de alumnos");
        curso = new Estudiante[leer.nextInt()];

        for (int i = 0; i < curso.length; i++) {
            System.out.println("ingresar nombre de alumno " + (i + 1));
            String nombre = leer.next();
            System.out.println("ingresar nota final de " + nombre);
            double nota = leer.nextDouble();
            curso[i] = new Estudiante(nombre, nota);
        }

        return curso;
    }

    public int superaronPromedio(Estudiante[] curso) {
        double promedio = notaPromedio(curso);
        int aprobados = 0;
        for (int i = 0; i < curso.length; i++) {
            if (curso[i].getNota() > promedio) {
                aprobados++;
            }
        }
        return aprobados;
    }

    public Estudiante[] mayorPromedio(Estudiante[] curso) {

        double promedio = notaPromedio(curso);

        Estudiante[] aprobado = new Estudiante[superaronPromedio(curso)];
        int aux = 0;

        for (int i = 0; i < curso.length; i++) {
            if (curso[i].getNota() > promedio) {

                aprobado[aux] = curso[i];
                aux++;
            }
        }
        return aprobado;

    }

    public double notaPromedio(Estudiante[] curso) {
        double sumador = 0;

        for (int i = 0; i < curso.length; i++) {
            sumador += curso[i].getNota();
        }

        return sumador / curso.length;
    }

    public void mostrarAprobados(Estudiante[] curso) {
        for (int i = 0; i < curso.length; i++) {
            System.out.println("el alumno: "+curso[i].getNombre());
            System.out.println("NOTA FINAL: "+curso[i].getNota());
            System.out.println("=======================");
        }
        
    }
}
