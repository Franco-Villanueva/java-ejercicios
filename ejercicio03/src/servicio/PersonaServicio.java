
package servicio;

import entidad.Persona;
import java.util.Scanner;


public class PersonaServicio {
       Scanner leer = new Scanner(System.in);
    
    public Persona crearPersona(){
    Persona humano = new Persona();
    
        
        System.out.println("ingresar nombre");
        humano.setNombre(leer.next());
        System.out.println("ingresar edad");
        humano.setEdad(leer.nextInt());
        
        System.out.println("ingresar sexo('M'hombre, 'F'mujer, 'O'otro)");
        humano.setSexo(leer.next().toUpperCase().charAt(0));
        
        while(humano.getSexo()!='M'&& humano.getSexo()!='F'&& humano.getSexo()!='O'){
            System.out.println("ingrese nuevamente el sexo ('M', 'F', 'O')");
            humano.setSexo(leer.next().toUpperCase().charAt(0));
        }
        
        System.out.println("ingresar peso(kg)");
        humano.setPeso(leer.nextDouble());
        System.out.println("ingresar altura(CON COMA ','EJ:1,60)");
        humano.setAltura(leer.nextDouble());
     
      return humano;
    }
    
    
    public int esMayorDeEdad(Persona humano){
        if(humano.getEdad()>=18){
            System.out.println("es mayor de edad");
            return 1;
        }else{
            System.out.println("es menor de edad");
            return 0;
        }
        
    }
    
    public int calcularIMC(Persona humano){
        //(peso en kg/(altura^2 en mt2))
    double imc = humano.getPeso() / (humano.getAltura() * humano.getAltura());

    if (imc < 20) {
        return -1;
    } else if (imc >= 20 && imc <= 25) {
        return 0;
    } else  {
        return 1;
    }
    }
    
    public void porcentaje(Persona personas[], double mayores){
        double menores = personas.length-mayores;
        
        double porcentaje = (menores*100)/personas.length;
        double porcentajeM = (mayores*100)/personas.length;
        System.out.println("el porcentaje de personas mayores es: "+ porcentajeM );
        System.out.println("el porcentaje de personas menores es: "+ porcentaje);
    }
    
    public void porcentajePeso(Persona personas[],double pesoM,double pesoI, double sobrePeso){
        double porcentajeM = (pesoM * 100)/personas.length;
        double porcentajeI = (pesoI * 100)/personas.length;
        double porcentajeS = (sobrePeso * 100)/personas.length;
        
        
        System.out.println("el porcentaje de personas con sobrepeso es: "+porcentajeS);
        System.out.println("el porcentaje de personas con peso ideal es: "+porcentajeI);
        System.out.println("el porcentaje de personas con peso por debajo es: "+porcentajeM);
    }
    
}
