
package principal;

import entidad.CuentaBancaria;
import java.util.Scanner;
import servicio.CuentaBancariaServicio;

public class Main {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        CuentaBancariaServicio serv = new CuentaBancariaServicio();
        
        CuentaBancaria cuenta1 = serv.crearCuenta();
        
        
        String respuesta = "";
        do{
            System.out.println("1- Ingresar dinero");
            System.out.println("2- Retirar dinero");
            System.out.println("3- Extraccion rapida");
            System.out.println("4- Consultar saldo");
            System.out.println("5- Consultar datos");
            System.out.println("6- SALIR");
            int opcion = leer.nextInt();
            switch(opcion){
                case 1:
                    serv.ingresar(cuenta1);
                    break;
                case 2:
                    serv.retirar(cuenta1);
                    break;
                case 3:
                    serv.extraccion(cuenta1);
                    break;
                case 4:
                    serv.consultarSaldo(cuenta1);
                    break;
                case 5:
                    serv.mostrarDatos(cuenta1);
                    break;
                case 6:
                    System.out.println("para salir presione S");
                    respuesta = leer.next();
                    break;
                default:
                    System.out.println("ninguna opcion ingresada");
            }
            
        }while(!respuesta.equalsIgnoreCase("s"));
         
    }
    
}
