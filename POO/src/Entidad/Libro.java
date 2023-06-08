/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;
import javax.swing.JOptionPane;


 //import.entindad.libro;
 
public class Libro {
    public int isbn;
    public String autor;
    public int numPaginas;

    public Libro(int isbn, String autor, int numPaginas) {
        this.isbn = isbn;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }

    public Libro() {
    }
    
     public void ingresarDatos(){
         Scanner leer = new Scanner(System.in);
         System.out.println("ingrese autor");
        autor = leer.next();
         System.out.println("ingresar numeros de paginas");
        numPaginas = leer.nextInt();
         System.out.println("ingresar isbn");
        isbn = leer.nextInt();
        
        
}
     
     public void info(){
         System.out.println("el auto es "+ autor);
         System.out.println("el numero de paginas es "+ numPaginas);
         System.out.println("el numero de ISBN del libro es "+isbn);
     }

    @Override
    public String toString() {
        return "Libro{" + "isbn=" + isbn + ", autor=" + autor + ", numPaginas=" + numPaginas + '}';
    }
     
 
}
 