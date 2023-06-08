/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import java.util.Date;
import java.util.Scanner;

/**
 *Método fechaNacimiento que pregunte al usuario día, mes y año de su nacimiento.
Luego los pase por parámetro a un nuevo objeto Date. El método debe retornar el
objeto Date. Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
*
Método fechaActual que cree un objeto fecha con el día actual. Para esto usaremos
el constructor vacío de la clase Date. Ejemplo: Date fechaActual = new  Date();
El método debe retornar el objeto Date.
* 
Método diferencia que reciba las dos fechas por parámetro y retorna la diferencia
de años entre una y otra (edad del usuario).
Si necesiten acá tienen más información en clase Date: Documentacion Oracle

 */
public class DateServicio {
    
    Scanner leer = new Scanner(System.in);
    
    public Date fechaDeNacimiento(){
        System.out.println("INGRESE 'FECHA DE NACIMIENTO'");
        System.out.println("ingrese dia");
        int dia = leer.nextInt();
        System.out.println("ingrese mes");
        int mes = leer.nextInt()- 1;
        System.out.println("ingrese anio");
        int anio = leer.nextInt() - 1900;
        return new Date(anio, mes, dia);
    }
    
    public Date obtenerFechaActual(){
        Date fechaActual = new Date();
        return fechaActual;
    }
    
   public int diferenciaDeFechas(Date fechaNacido, Date fechaActual) {
        int anionacido = fechaNacido.getYear();
        int anioActual = fechaActual.getYear();
        int mesNacido = fechaNacido.getMonth();
        int mesActual = fechaActual.getMonth();
        int diaNacido = fechaNacido.getDate();
        int diaActual = fechaActual.getDate();

        int edad = anioActual - anionacido;

        if (mesActual < mesNacido || (mesActual == mesNacido && diaActual < diaNacido)) {
            edad--;
        }

        return edad;
    }
}

