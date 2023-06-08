
package servicio;

import entidad.CuentaBancaria;
import java.util.Scanner;

public class CuentaBancariaServicio {
    
    Scanner leer = new Scanner(System.in);
    
    //metodo para crear cuenta y retorna un objeto rellenado
    public CuentaBancaria crearCuenta(){
        CuentaBancaria cuenta = new CuentaBancaria();
        
        System.out.println("ingrese numero de cuenta");
        cuenta.setNumCuenta(leer.nextInt());
        
        System.out.println("ingrese DNI");
        cuenta.setDni(leer.nextLong());
        
        System.out.println("ingrese Saldo");
        cuenta.setSaldoActual(leer.nextInt());
        
        return cuenta;
    }
    
    public void ingresar(CuentaBancaria cuenta){
        System.out.println("cuanto dinero desea ingresar");
        double ingreso = leer.nextDouble();
        if(ingreso < 1){
            System.out.println("Error");
        }else{
            cuenta.setSaldoActual(ingreso + cuenta.getSaldoActual());
        }
    }
    
    public void retirar(CuentaBancaria cuenta){
        System.out.println("ingrese cantidad a retirar");
        double retiro = leer.nextDouble();
        if(retiro > cuenta.getSaldoActual()){
            System.out.println("Saldo insuficiente se retiro: "+cuenta.getSaldoActual());
            cuenta.setSaldoActual(0);
           
        }else {
            cuenta.setSaldoActual(cuenta.getSaldoActual()- retiro);
        }
    }
    
    public void extraccion(CuentaBancaria cuenta){
        
        System.out.println("la extraccion fue de: "+cuenta.getSaldoActual()*0.20);
        cuenta.setSaldoActual(cuenta.getSaldoActual()*0.80);
        
    }
    
    public void consultarSaldo(CuentaBancaria cuenta){
        
        System.out.println("Su saldo es de: "+cuenta.getSaldoActual());
        
    }
    
    public void mostrarDatos(CuentaBancaria cuenta){
        System.out.println("N* de cuenta: "+cuenta.getNumCuenta());
        System.out.println("DNI de cuenta: "+cuenta.getDni());
        System.out.println("Su SALDO: "+cuenta.getSaldoActual());
    }
    
}
