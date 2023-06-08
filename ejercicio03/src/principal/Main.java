
package principal;

import entidad.Persona;
import java.util.Scanner;
import servicio.PersonaServicio;


public class Main {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        PersonaServicio serv = new PersonaServicio();
        
        double mayores= 0;
        
        double pesoM = 0;
        double pesoI = 0;
        double sobrePeso = 0;
        
        Persona [] personas;
        
        System.out.println("ingrese el cantidad de personas");
        
        personas = new Persona[leer.nextInt()];
        
        for (int i = 0; i < personas.length; i++) {
            Persona inicio = serv.crearPersona();
            
            int contador = serv.esMayorDeEdad(inicio);
            if(contador==1){
                mayores++;
            }
            
            int ps = serv.calcularIMC(inicio);
            if(ps == 1){
                System.out.println("persona tiene sobrepeso");
                sobrePeso++;
            }else if(ps == 0){
                System.out.println("persona tiene el peso ideal");
                pesoI++;
            }else {
                System.out.println("persona esta por debajo de su peso ideal");
                pesoM++;
            }
             System.out.println("=========================");
            personas[i]= inicio;
        }
        
        serv.porcentaje(personas, mayores);
        System.out.println("==========================");
        serv.porcentajePeso(personas, pesoM, pesoI, sobrePeso);
    }
    
    
}
