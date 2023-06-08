package servicio;

import entidad.Ahorcado;
import java.util.Arrays;
import java.util.Scanner;

public class AhorcadoServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    /*Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas
    máxima. Con la palabra del usuario, pone la longitud de la palabra, como la 
    longitud del vector. Después ingresa la palabra en el vector, letra por letra,
    quedando cada letra de la palabra en un índice del vector. Y también, guarda 
    la cantidad de jugadas máximas y el valor que ingresó el usuario.*/
    public Ahorcado crearJuego() {

        Ahorcado juego = new Ahorcado();
        
        System.out.println("ingrese palabra");
        String palabra = leer.next().toUpperCase();
        String palabraSinEspacio = palabra.replaceAll("\\s+", "");
        
        String[] arrayPalabra = new String[palabraSinEspacio.length()];
        String[] arrayCopia = new String[palabraSinEspacio.length()];

        for (int i = 0; i < palabraSinEspacio.length(); i++) {
            String letra = palabraSinEspacio.substring(i, i + 1);
             
                arrayPalabra[i] = letra;
                arrayCopia[i] = "_";
            
        }

        

        juego.setPalabraOculta(arrayPalabra);
        juego.setPalabraOcultaCopia(arrayCopia);

        System.out.println("ingrese cantidad de intentos");
        juego.setIntentos(leer.nextInt());

        return juego;
    }

    /*Método longitud(): muestra la longitud de la palabra que se debe encontrar.
    Nota: buscar como se usa el vector.length. */
    public void longitud(Ahorcado juego) {
        System.out.println("la longitud de la palabra oculta es: " + juego.getPalabraOculta().length);
    }

    /*Método buscar(letra):  este método recibe una letra dada por el usuario 
    y busca si la letra ingresada es parte de la palabra o no. También informará 
    si la letra estaba o no. */
    public boolean buscarLetra(Ahorcado juego, String letra) {
        boolean aux = false;
        for (int i = 0; i < juego.getPalabraOculta().length; i++) {

            String contiene = juego.getPalabraOculta()[i];

            if (contiene.equalsIgnoreCase(letra)) {

                System.out.println("Mensaje: La letra pertenece a la palabra");

                return aux = true;
            }
        }

        System.out.println("Mensaje: La letra NOO pertenece a la palabra");

        return aux;

    }

    /*Método encontradas(letra):  que reciba una letra ingresada por el usuario
    y muestre cuantas letras han sido encontradas y cuántas le faltan. Este método 
    además deberá devolver true si la letra estaba y false si la letra no estaba,
    ya que, cada vez que se busque una letra que no esté, se le restará uno a sus
    oportunidades. */
    public void encontradas(Ahorcado juego, String letra) {

        boolean analisis = buscarLetra(juego, letra);

        if (analisis == true) {
            copiador(juego, letra);
            System.out.println(Arrays.toString(juego.getPalabraOcultaCopia()));
        } else {
            juego.setIntentos(juego.getIntentos() - 1);
            System.out.println(Arrays.toString(juego.getPalabraOcultaCopia()));
        }
    }

    /*Método intentos(): para mostrar cuántas oportunidades le queda al jugador. */
    public void mostrarIntento(Ahorcado juego) {
        System.out.println("intentos restantes : " + juego.getIntentos());
    }

    public void copiador(Ahorcado juego, String letra) {
        String[] copiador = juego.getPalabraOcultaCopia();

        for (int i = 0; i < juego.getPalabraOculta().length; i++) {

            if (juego.getPalabraOculta()[i].equalsIgnoreCase(letra)) {

                copiador[i] = juego.getPalabraOculta()[i].toUpperCase();
            }
        }
        juego.setPalabraOcultaCopia(copiador);
    }

    /*Método juego(): el método juego se encargará de llamar todos los métodos 
    previamente mencionados e informará cuando el usuario descubra toda la palabra
    o se quede sin intentos. Este método se llamará en el main. */
    public void jugar() {
        Ahorcado j1 = crearJuego();

        do {
            System.out.println("======================");
            System.out.println("ingrese letra");
            String letra = leer.next().toLowerCase();

            longitud(j1);
            encontradas(j1, letra);
            mostrarIntento(j1);
        } while (j1.getIntentos() != 0 && !Arrays.equals(j1.getPalabraOculta(), j1.getPalabraOcultaCopia()));
    }

}
