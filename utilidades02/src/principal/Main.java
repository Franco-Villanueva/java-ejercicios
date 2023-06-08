package principal;


import entidad.ParDeNumeros;
import java.util.Scanner;
import servicio.ParDeNumerosService;


public class Main {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ParDeNumerosService serv = new ParDeNumerosService();
        
        ParDeNumeros obj1 = new ParDeNumeros();
        
        String respuesta = "";
        do{
            System.out.println("1- Mostrar valores");
            System.out.println("2- Devolver mayor");
            System.out.println("3- Calcular Potencia");
            System.out.println("4- Calcular raiz");
            System.out.println("5- SALIR");
            int opcion = leer.nextInt();
            switch(opcion){
                case 1:
                    serv.mostrarValores(obj1);
                    break;
                case 2:
                    serv.devolverMayor(obj1);
                    break;
                case 3:
                   serv.calcularPotencia(obj1);
                    break;
                case 4:
                    serv.calcularRaiz(obj1);
                    break;
                case 5:
                    System.out.println("para salir presione S");
                    respuesta = leer.next();
                    break;
                default:
                    System.out.println("ninguna opcion ingresada");
            }
            
        }while(!respuesta.equalsIgnoreCase("s"));
        
    }
    
}
