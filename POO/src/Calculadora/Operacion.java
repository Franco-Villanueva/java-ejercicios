
package Calculadora;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class Operacion {
    //ATRIBUTOS
    private int num1;
    private int num2;
    
    //METODO CONSTRUCTOR PARA PASAR NUMEROS POR PARAMETROS DESDE EL MAIN
    public Operacion(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    
    
    //METODO CONSTRUCTOR PARA ACTIVAR || crearOperacion ||
    public Operacion() {
    }
    
    //GET Y SET DE LOS ATRIBUTOS EN PRIVATE
    public int getNum1() {
        return num1;
    }
    public void setNum1(int num1) {
        this.num1 = num1;
    }
    public int getNum2() {
        return num2;
    }
    public void setNum2(int num2) {
        this.num2 = num2;
    }
    
    //METODO PARA INGRESAR LOS NUMEROS
    public void crearOperacion(){
         Scanner leer = new Scanner (System.in);
         System.out.println("ingrese un numero");
        num1 = leer.nextInt();
                
         System.out.println("ingrese otro numero");
        num2 = leer.nextInt();
    }
    
    //METODO PARA SUMAR NUMEROS
    public int sumar(){
        return num1 + num2; // num3 = num1 + num2
    }
    
    //METODO PARA RESTAR NUMEROS
    public int restar(){
        return num1 - num2;
    }
     
    //METODO PARA MULTIPLICAR NUMEROS
    public int multiplicar(){
        if(num1 > 0 && num2 > 0){
        return num1 * num2;
        }else{
            return 0;
        }
    }
    
    //METODO PARA DIVIDIR NUMEROS
    public double dividir(){
        if(num1 > 0 && num2 > 0){
            double num1d = num1;
            double num2d = num2;
        return num1d / num2d;
        }else{
            return 0;
        }
    }
}
/**
Método para crearOperacion(): que le pide al usuario los dos números y los guarda en los atributos del objeto.
Método sumar(): calcular la suma de los números y devolver el resultado al main.
Método restar(): calcular la resta de los números y devolver el resultado al main
Método multiplicar(): primero valida que no se haga una multiplicación por cero, si fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error. Si no, se hace la multiplicación y se devuelve el resultado al main
Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar una división por cero, el método devuelve 0 y se le informa al usuario el error se le informa al usuario. Si no, se hace la división y se devuelve el resultado al main.
**/