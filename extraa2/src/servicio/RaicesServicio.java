package servicio;

import entidad.Raices;
import java.util.Scanner;

/*Vamos a realizar una clase llamada Raices, donde representaremos los valores 
de una ecuación de 2º grado. Tendremos los 3 coeficientes como atributos, 
llamémosles a, b y c. Hay que insertar estos 3 valores para construir el 
objeto a través de un método constructor. Luego, en RaicesServicio las 
operaciones que se podrán realizar son las siguientes:

Método getDiscriminante(): devuelve el valor del discriminante (double). 
El discriminante tiene la siguiente fórmula: (b^2)-4*a*c
Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, 
para que esto ocurra, el discriminante debe ser mayor que 0.
Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución,
para que esto ocurra, el discriminante debe ser igual que 0.
Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime 
las 2 posibles soluciones.
Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz.
Es en el caso en que se tenga una única solución posible.
Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará 
por pantalla las posibles soluciones que tiene nuestra ecuación con los métodos obtenerRaices()
o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso de no existir solución, se mostrará un mensaje.

Nota: Fórmula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varía el signo delante de -b
*/

public class RaicesServicio {
    Scanner leer = new Scanner(System.in);
    
    public Raices llenarCoeficiente(){
        Raices ecuacion = new Raices();
        
        System.out.println("ingrese coeficiente A");
        ecuacion.setA(leer.nextDouble());
        System.out.println("ingrese coefiente B");
        ecuacion.setB(leer.nextDouble());
        System.out.println("ingrese coeficiente C");
        ecuacion.setC(leer.nextDouble());
        
        return ecuacion;
    }
    
    
    public double discriminante(Raices ecuacion){
        return (ecuacion.getB()*ecuacion.getB())-4*ecuacion.getA()*ecuacion.getC();
    }
    
    public boolean tieneRaices(Raices ecuacion){
        //(-b±√((b^2)-(4*a*c)))/(2*a)
        if(discriminante(ecuacion)> 0){
            
            return true;
        }else{
            return false;
        }
        
    }
    public boolean tieneRaiz(Raices ecuacion){
        //(-b±√((b^2)-(4*a*c)))/(2*a)
        if(discriminante(ecuacion) == 0){
            
            return true;
        }else{
            return false;
        }
        
    }
    
    public void obtenerRaices(Raices ecuacion){
        if(tieneRaices(ecuacion)==true){
            double x1 = (-(ecuacion.getB()) + Math.sqrt(discriminante(ecuacion))) / (2 * ecuacion.getA());
            double x2 = (-(ecuacion.getB()) - Math.sqrt(discriminante(ecuacion))) / (2 * ecuacion.getA());
            System.out.println("la raiz x1 es "+x1+" la raiz x2 es "+x2);
        }
    }
    
     public void obtenerRaiz(Raices ecuacion){
        if(tieneRaiz(ecuacion)==true){
            double x1 = (-ecuacion.getB()+ Math.sqrt((discriminante(ecuacion)))/(2*ecuacion.getA()));
            
            System.out.println("la raiz unica es "+x1);
        }
    }
     
     public void calcular (Raices ecuacion){
         if(tieneRaices(ecuacion)){
             
             obtenerRaices(ecuacion);
             
         }else if(tieneRaiz(ecuacion)){
             
             obtenerRaiz(ecuacion);
             
         }else{
             
             System.out.println("no tiene solucion");
         }
     }
}
