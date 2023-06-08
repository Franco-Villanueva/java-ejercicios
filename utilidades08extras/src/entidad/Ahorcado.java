package entidad;
/* Crear una clase Ahorcado (como el juego), la cual deberá contener como
atributos, un vector con la palabra a buscar, la cantidad de letras encontradas
y la cantidad jugadas máximas que puede realizar el usuario.*/

public class Ahorcado {
    private String [] palabraOculta;
    private int letrasEncontradas;
    private int intentos;
    private String [] palabraOcultaCopia;

    public Ahorcado(String[] palabraOculta, int letrasEncontradas, int intentos) {
        this.palabraOculta = palabraOculta;
        this.letrasEncontradas = letrasEncontradas;
        this.intentos = intentos;
    }

    public Ahorcado() {
    }

    public String[] getPalabraOcultaCopia() {
        return palabraOcultaCopia;
    }

    public void setPalabraOcultaCopia(String[] palabraOcultaCopia) {
        this.palabraOcultaCopia = palabraOcultaCopia;
    }
    
    public String[] getPalabraOculta() {
        return palabraOculta;
    }

    public void setPalabraOculta(String[] palabraOculta) {
        this.palabraOculta = palabraOculta;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }
    
    
}
