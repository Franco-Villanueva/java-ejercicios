/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.Arreglo;
import java.util.Arrays;



/**Crear en el Main dos arreglos. El arreglo A de 50 números reales
 * y el arreglo B de 20 números reales. Crear la clase ArregloService, 
 * en el paquete servicio, con los siguientes métodos:
 * 
Método inicializarA recibe un arreglo por parámetro y lo inicializa con números aleatorios.
Método mostrar recibe un arreglo por parámetro y lo muestra por pantalla.
Método ordenar recibe un arreglo por parámetro y lo ordena de mayor a menor.
Método inicializarB copia los primeros 10 números del arreglo A en el arreglo B.
* Luego llenar las últimas 10 posiciones del arreglo B con 0.5.
En el Main nuevamente: inicializar A, mostrar A, ordenar A, inicializar B, mostrar A y B.

 */
public class ArreglosServicio {
    
    public void inicializarA(Arreglo obj){
        
        for (int i = 0; i < obj.getArray1().length; i++) {
            
            obj.getArray1()[i]= (Math.random() * 10) + 1;
            
        }
    }
    
    public void mostrarArreglo(Arreglo obj){
        System.out.println("MOSTRANDO ARREGLO A");
        System.out.println(Arrays.toString(obj.getArray1()));
    }
    
    public void ordernarArreglo(Arreglo obj){
        System.out.println("ARREGLO ORDENADO DE MAYOR A MENOR");
        
        double [] newArray = new double[50];
        for (int i = 0; i < obj.getArray1().length/2; i++) {
            newArray[i]=obj.getArray1()[obj.getArray1().length-1-i];
        }
        System.out.println(Arrays.toString(newArray));
    }
    
    public void inicializarB(Arreglo obj){
        double [] newArray= new double[20];
        
        for (int i = 0; i < obj.getArray2().length/2; i++) {
            newArray[i] = obj.getArray1()[i];
        }
        Arrays.fill(newArray,10,20,0.50);
        obj.setArray2(newArray);
    }
    
    public void mostraAyB(Arreglo obj){
        System.out.println("MOSTRANDO ARREGLO A");
        System.out.println(Arrays.toString(obj.getArray1()));
        
        System.out.println("MOSTRANDO ARREGLO B");
        System.out.println(Arrays.toString(obj.getArray2()));
    }
   
}
