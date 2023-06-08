
package servicio;

import entidad.Persona;
import java.util.Date;
import java.util.Scanner;


public class PersonaServicio {
    
/*Implemente la clase Persona en el paquete entidades. Una persona tiene un nombre
y una fecha de nacimiento (Tipo Date), constructor vacío, constructor parametrizado,
get y set. Crear una clase PersonaService, en el paquete servicio, con los siguientes métodos:

Método crearPersona que pida al usuario Nombre y fecha de nacimiento de la persona a crear.
Retornar el objeto Persona creado.
    
Método calcularEdad que calcule la edad del usuario utilizando el atributo 
de fecha de nacimiento y la fecha actual.

Método menorQue recibe como parámetro una Persona y una edad. Retorna true
si la persona es menor que la edad consultada o false en caso contrario.

Método mostrarPersona que muestra la información de la persona deseada.
*/
    Scanner leer = new Scanner(System.in);
    
    public Persona crearPersona(){
        Persona p1 = new Persona();
        
        System.out.println("ingrese nombre");
        p1.setNombre(leer.next());
        System.out.println("INGRESE FECHA DE NACIMIENTO");
        System.out.print("ingrese dia ==> ");
        int dia = leer.nextInt();
        System.out.print("ingrese mes ==> ");
        int mes = leer.nextInt()-1;
        System.out.print("ingrese anio ==> ");
        int anio = leer.nextInt()-1900;
        Date fecha = new Date(anio, mes, dia);
        p1.setFechaNacimiento(fecha);
        
        return p1;
        
    }
    
    //metodo retorna TRUE si la edad de la persona es mayor o = que 18
    public boolean mayorDeEdad(Persona p1){
        return calcularEdad(p1)>=18;
    }
    
    //metodo obtener fecha actual
    public Date obtenerFechaActual(){
        Date fechaActual = new Date();
        return fechaActual;
    }
    
    //metodo saca la edad de la persona y retorna el numero
    public int calcularEdad(Persona p1) {
    Date fechaActual = obtenerFechaActual();
    
    int anioNacido = p1.getFechaNacimiento().getYear();
    int anioActual = fechaActual.getYear();
    int mesNacido = p1.getFechaNacimiento().getMonth();
    int mesActual = fechaActual.getMonth();
    int diaNacido = p1.getFechaNacimiento().getDate();
    int diaActual = fechaActual.getDate();

    int edad = anioActual - anioNacido;

    if (mesActual < mesNacido || (mesActual == mesNacido && diaActual < diaNacido)) {
        edad--;
    }

    return edad;
}

    
    //retorna un TRUE si la persona es menor que la edad enviada por parametros.En caso contrario FALSE.
    public boolean menorQue(Persona p1, int edad){
        return calcularEdad(p1)< edad;
    }
    
    //MUESTRA EL NOMBRE DE LA PERSONA, EDAD Y SI ES MAYOR.
    public void mostrarInfo(Persona p1){
        System.out.println("el NOMBRE es: "+p1.getNombre());
        System.out.println("Es mayor de edad: "+mayorDeEdad(p1));
        System.out.println("La edad de la persona es: "+calcularEdad(p1));
        
    }
    
    }
