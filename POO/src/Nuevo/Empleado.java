/*
 * Crea una clase "Empleado" que tenga atributos como "nombre",
"edad" y "salario". Luego, crea un método "calcular_aumento" 
que calcule el aumento salarial de un empleado en función de
su edad y salario actual. El aumento salarial debe ser del 10%
si el empleado tiene más de 30 años o del 5% si tiene menos de 30 años.
 */
package Nuevo;

/**
 *
 * @author franco
 */
public class Empleado {
    private String nombre;
    private int edad;
    private double salario;

    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }
  
    
    public void calcular_aumento(){
        if(edad > 30){
            salario = salario * 1.10;
        }else{
            salario = salario * 1.05;
        }
        
    }
}
