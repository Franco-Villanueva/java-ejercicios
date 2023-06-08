package servicio;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProductoServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public HashMap<String, Integer> crearProducto() {
        HashMap<String, Integer> supermarket = new HashMap<>();

        do {
            System.out.println("ingresar nombre del producto");
            String nombre = leer.next();
            if (revision(supermarket, nombre)) {
                System.out.println("ingresar precio");
                Integer precio = leer.nextInt();
                supermarket.put(nombre, precio);
            }else{
                System.out.println("EL PRODUCTO SE ENCUENTRA EN LA LISTA");
            }
        } while (!confirmador());

        return supermarket;
    }

    public Boolean confirmador() {
        Character resp = 'a';
        while (resp != 'S') {
            System.out.println("Quiere seguir agregando producto S/N");

            resp = leer.next().toUpperCase().charAt(0);
            if (resp == ('N')) {

                return true;
            }
        }
        return false;
    }

    public void agregarProducto(HashMap<String, Integer> supermarket) {

        System.out.println("ingrese nombre del producto");
        String name = leer.next();
        if (revision(supermarket, name)) {
            System.out.println("ingrese el precio");
            Integer price = leer.nextInt();
            supermarket.put(name, price);
        } else {
            System.out.println("EL PRODUCTO SE ENCUENTRA EN LA LISTA");
        }
    }

    public Boolean revision(HashMap<String, Integer> supermarket, String name) {
        for (Map.Entry<String, Integer> entry : supermarket.entrySet()) {
            String key = entry.getKey();
            if (key.equalsIgnoreCase(name)) {
                return false;
            }

        }
        return true;
    }

    public Integer modificarValor(HashMap<String, Integer> supermarket) {
        mostrar(supermarket);
        System.out.println("que producto quiere modificar");
        String keyModificadora = leer.next();
        for (Map.Entry<String, Integer> entry : supermarket.entrySet()) {
            String key = entry.getKey();

            if (key.equalsIgnoreCase(keyModificadora)) {
                System.out.println("ingrese nuevo valor");
                Integer nuevoValor = leer.nextInt();
                supermarket.put(key, nuevoValor);
                System.out.println("se modifico el valor");
                return null;
            }
        }
        System.out.println("no se encontro el producto");
        return null;
    }

    public void mostrar(HashMap<String, Integer> supermarket) {

        for (Map.Entry<String, Integer> product : supermarket.entrySet()) {
            String key = product.getKey();
            Integer value = product.getValue();

            System.out.println("name: " + key + " price: $" + value);

        }

    }

    public Integer elimnarProducto(HashMap<String, Integer> supermarket) {
        System.out.println("ingrese el nombre del producto a eliminar");
        String name = leer.next();
        for (Map.Entry<String, Integer> entry : supermarket.entrySet()) {
            String key = entry.getKey();

            if (key.equalsIgnoreCase(name)) {
                supermarket.remove(name);
                System.out.println("*****se elimino " + key + " de la lista*****");
                System.out.println("---------PRODUCTOS---------");
                mostrar(supermarket);
                return null;
            }
        }
        System.out.println("***NO SE ENCONTRO " + name + " EN LA LISTA***");
        return null;
    }

}
