/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import entidad.Cadena;

import java.util.Scanner;
import servicio.CadenaServicio;

/**
 *
 * @author franco
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        CadenaServicio serv = new CadenaServicio();
        
        
        Cadena cadena1 = serv.ingresarFrase();
        
        String letra ;
        String respuesta = "";
        do{
            System.out.println("1- Leer cantidad de vocales");
            System.out.println("2- Invertir Frase");
            System.out.println("3- Cuantas veces se repite la letra");
            System.out.println("4- Comparar longitud");
            System.out.println("5- Unir frases");
            System.out.println("6- Cambiar letra 'A'");
            System.out.println("7- Contiene la letra");
            System.out.println("8- SALIR");
            int opcion = leer.nextInt();
            switch(opcion){
                case 1:
                    serv.mostrarVocales(cadena1);
                    break;
                case 2:
                    serv.invertirFrase(cadena1);
                    break;
                case 3:
                    System.out.println("ingrese letra a buscar");
                    letra = leer.next();
                    serv.vecesRepetir(cadena1, letra);
                    break;
                case 4:
                    System.out.println("ingresar frase a comparar");
                    letra = leer.next();
                    serv.compararLongitud(cadena1,letra );
                    break;
                case 5:
                    System.out.println("ingresar frase a unir");
                    letra = leer.next();
                    serv.unirFrase(cadena1, letra);
                    break;
                case 6:
                    System.out.print("Cambiar letra a de la frase con la letra =>");
                    letra= leer.next();
                    serv.reemplazar(cadena1, letra);
                    break;
                case 7:
                    System.out.println("ingresar letra a buscar");
                    letra = leer.next();
                    serv.contiene(cadena1, letra);
                    break;
                case 8:
                    System.out.println("para salir presione S");
                    respuesta = leer.next();
                    break;
                default:
                    System.out.println("ninguna opcion ingresada");
            }
            
        }while(!respuesta.equalsIgnoreCase("s"));
         
    }
    
}
