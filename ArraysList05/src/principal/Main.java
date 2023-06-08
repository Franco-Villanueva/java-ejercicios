
package principal;

import java.util.HashMap;
import java.util.Scanner;
import servicio.ProductoServicio;


public class Main {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ProductoServicio serv = new ProductoServicio();
        Character resp = 'a';
        HashMap<String,Integer> productos = serv.crearProducto();
        do{
            System.out.println("MENU");
            System.out.println("1-AGREGAR UN PRODUCTO");
            System.out.println("2-MODIFICAR VALOR");
            System.out.println("3-MOSTRAR PRODUCTOS");
            System.out.println("4-ELIMINAR PRODUCTO");
            System.out.println("5-SALIR");
            Integer op = leer.nextInt();
            switch(op){
                case 1:
                    serv.agregarProducto(productos);
                    break;
                case 2:
                    serv.modificarValor(productos);
                    break;
                case 3:
                    serv.mostrar(productos);
                    break;
                case 4:
                    serv.elimnarProducto(productos);
                    break;
                case 5:
                    System.out.println("SEGURO: PARA SALIR PRESIONE 'S'");
                    resp = leer.next().toLowerCase().charAt(0);
                    break;
                default:
                    System.out.println("NO SE ELIGIO UN OPCION");
            }
            
        }while(resp != 's');
    }
    
}
