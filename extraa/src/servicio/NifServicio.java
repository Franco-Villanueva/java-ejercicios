package servicio;

import entidad.Nif;
import java.util.Scanner;

/*Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la letra que le corresponderá.
* Una vez calculado, le asigna la letra que le corresponde según
Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion y la letra 
* en mayúscula; por ejemplo: 00395469-F).
que funciona de la siguiente manera: Para calcular la letra se toma
el resto de dividir el número de DNI por 23 (el resultado debe ser un número entre 0 y 22)*/
public class NifServicio {
    
    Scanner leer = new Scanner(System.in);
    
    public Nif crearNif(){
        char [] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        Nif creacion = new Nif();
        System.out.println("ingrese DNI");
        creacion.setDni(leer.nextInt());
        
        int posicion = creacion.getDni() % 23;
        creacion.setLetra(letras[posicion]);
        
        
        return creacion;
        
    }
    
    public void mostrar(Nif creacion){
        System.out.println("el codigo NIF es "+creacion.getDni()+"-"+creacion.getLetra());
    }
    
}
