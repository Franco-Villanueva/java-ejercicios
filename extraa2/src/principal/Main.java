/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import entidad.Raices;
import servicio.RaicesServicio;

/**
 *
 * @author franco
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RaicesServicio serv = new RaicesServicio();
        
        Raices ecuacion1 = serv.llenarCoeficiente();
        
        serv.calcular(ecuacion1);
        
        
        
        
    }
    
}
