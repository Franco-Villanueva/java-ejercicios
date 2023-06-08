/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cajero;

import java.util.Scanner;

/**
 *
 * @author franco
 */
public class Cuenta {
    String titular;
    int saldo;

    public Cuenta(String titular, int saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }
    
    
    
    public void retirarDinero(){
        int retiro;
        Scanner leer = new Scanner(System.in);
        System.out.println("cuanto dinero desea retirar. Su saldo:$"+saldo);
        retiro = leer.nextInt();
        
        if(retiro > saldo){
            System.out.println("saldo insuficiente");
        }else {
            System.out.println("retirando dinero...");
            saldo = saldo - retiro;
        }
        
    }

    @Override
    public String toString() {
        return "Cuenta{" + " titular= " + titular + ", saldo= $" + saldo + " }";
    }
    
    
    
}
