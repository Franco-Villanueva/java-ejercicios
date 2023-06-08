package servicio;

import entidad.ParDeNumeros;


public class ParDeNumerosService {
    /*Realizar una clase llamada ParDeNumeros que tenga como atributos dos números
reales con los cuales se realizarán diferentes operaciones matemáticas. La clase
debe tener un constructor vacío, getters y setters.  En el constructor vacío se 
usará el Math.random para generar los dos números. Crear una clase ParDeNumerosService,
en el paquete Servicios, que deberá además implementar los siguientes métodos:

Método mostrarValores que muestra cuáles son los dos números guardados.
Método devolverMayor para retornar cuál de los dos atributos tiene el mayor valor
Método calcularPotencia para calcular la potencia del mayor valor de la clase
elevado al menor número. Previamente se deben redondear ambos valores.
Método calculaRaiz, para calcular la raíz cuadrada del menor de los dos valores. 
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.*/
    
    public void mostrarValores(ParDeNumeros obj){
        System.out.println("Valor 'A' = "+obj.getA());
        System.out.println("Valor 'B' = "+obj.getB());
    }
    
    public void devolverMayor(ParDeNumeros obj){
        System.out.println(Math.max(obj.getA(),obj.getB()));
    }
    
    public void calcularPotencia(ParDeNumeros obj){
        double mayor = Math.max(obj.getA(), obj.getB());
        double menor = Math.min(obj.getA(), obj.getB());
        mayor = Math.round(mayor);
        menor = Math.round(menor);
        System.out.println(Math.pow(mayor, menor));
    }
    
    public void calcularRaiz(ParDeNumeros obj){
        
        double menor = Math.min(obj.getA(), obj.getB());
        Math.abs(menor);
        System.out.println(Math.sqrt(menor));
    }
}
