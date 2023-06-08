package servicio;

import entidad.Pais;
import java.util.ArrayList;
import java.util.Scanner;

import java.util.TreeSet;


public class PaisServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    TreeSet<String> ordenada = new TreeSet<>();

    public ArrayList<Pais> crearPais() {
        ArrayList<Pais> naciones = new ArrayList<>();
        do {
            Pais p1 = new Pais();
            System.out.println("ingrese nombre de pais");

            p1.setNacion(leer.next());

            naciones.add(p1);
        } while (!confirmador());
        
        pasaConjunto(naciones);
        mostrarPaises();
        
        return naciones;
    }

    public Boolean confirmador() {
        Character resp = 'a';
        while (resp != 'S') {
            System.out.println("Quiere seguir agregando Pais S/N");

            resp = leer.next().toUpperCase().charAt(0);
            if (resp == ('N')) {

                return true;
            }
        }
        return false;
    }

    public void pasaConjunto(ArrayList<Pais> naciones) {

        for (Pais paises : naciones) {
            ordenada.add(paises.getNacion());
        }
        
    }

    public void eliminarPais(String pais) {
        Boolean bandera = false;
        for (String paises : ordenada) {
            if (paises.equalsIgnoreCase(pais)) {
                bandera = true;
                ordenada.remove(paises);
                break;
            }
        }

        if (bandera) {
            System.out.println("*****se elimino el pais de la lista*****");
        } else {
            System.out.println("*****no se encontro el pais*****");
        }

        mostrarPaises();
    }

    public void mostrarPaises() {
        System.out.println("---------ORDEN ALFETICAMENTE----------");
        for (String paises : ordenada) {
            System.out.println(paises);
        }
    }
}
