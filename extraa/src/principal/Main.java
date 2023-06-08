/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import entidad.Nif;
import servicio.NifServicio;

/**
 *
 * @author franco
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NifServicio serv = new NifServicio();
        
        Nif persona1 = serv.crearNif();
        
        serv.mostrar(persona1);
        
    }
    
}
