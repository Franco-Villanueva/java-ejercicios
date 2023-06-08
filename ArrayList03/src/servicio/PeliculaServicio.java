package servicio;

import entidad.Pelicula;
import java.util.ArrayList;
import java.util.Scanner;

/* En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:

• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.*/
public class PeliculaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    

    public Boolean confirmador() {
        String resp = "a";
        while (!resp.equalsIgnoreCase("S")) {
            System.out.println("Quiere seguir agregando peliculas S/N");

            resp = leer.next();
            if (resp.equalsIgnoreCase("N")) {

                return true;
            }
        }
        return false;
    }

    public ArrayList<Pelicula> subirPelicula() {
        ArrayList<Pelicula> lista = new ArrayList<>();
        do{
        Pelicula peli = new Pelicula();

        System.out.println("ingrese nombre de pelicula");
        peli.setTitulo(leer.next());
        System.out.println("ingrese nombre del director");
        peli.setDirector(leer.next());
        System.out.println("Ingrese duracion de pelicula(en hora)");
        peli.setDuracion(leer.nextInt());

        lista.add(peli);
        }while(!confirmador());
        return lista;
    }

    public void mostrar(ArrayList<Pelicula> lista) {
        for (Pelicula pelicula : lista) {
            System.out.println(pelicula.toString());
        }
    }

    public void mayor_Hora(ArrayList<Pelicula> lista) {

        for (Pelicula pelicula : lista) {
            if (pelicula.getDuracion() > 1) {
                System.out.println(pelicula.toString());
            }
        }
    }

    public void de_Mayor_Menor(ArrayList<Pelicula> lista) {
        lista.sort(Pelicula.orden_Mayor_Menor);
        mostrar(lista);
    }

    public void de_Menor_Mayor(ArrayList<Pelicula> lista) {
        lista.sort(Pelicula.orden_Menor_Mayor);

        mostrar(lista);
    }

    public void orden_Titulo(ArrayList<Pelicula> lista) {
        lista.sort(Pelicula.orden_Titulo);

        mostrar(lista);
    }

    public void orden_Director(ArrayList<Pelicula> lista){
        lista.sort(Pelicula.orden_Director);
        
        mostrar(lista);
    }
}
