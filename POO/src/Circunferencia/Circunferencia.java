
package Circunferencia;

import java.util.Scanner;

/**
 
   Método constructor que inicialice el radio pasado como parámetro.
   Métodos get y set para el atributo radio de la clase Circunferencia.
   Método para crearCircunferencia(): que le pide el radio y lo guarda  en el atributo del objeto.
   Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2).
   Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).

 */
public class Circunferencia {
   private double radio;

   /**
    * metodo contructor
    * @param radio 
    */
    public Circunferencia(double radio) {
        this.radio = radio;
    }
    /**
     * metodo get y set
     * 
     * @return
     */
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
   
    /**
     * pide el radio y lo guarda el valor
     */
   public void crearCircunferencia(){
       Scanner leer = new Scanner (System.in);
       System.out.println("ingresar radio");
       radio = leer.nextDouble();
       setRadio(radio);
}

   /**
    * metodo para sacar area, usando el radio ingresado en crearCircunferencia.
    * 
    * @return area
    */
   public double sacarArea(){
       double area = Math.pow((3.14 * radio), 2);
   
      return area;
   }
   
   /**
    * metodo para sacar perimetro, usando el radio ingresado en crearCircunferencia.
    * 
    * @return perimetro
    */
   public double sacarPerimetro(){
      double perimetro = 2*3.14*radio; 
      return perimetro;
   }
}

