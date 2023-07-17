/*
Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener como atributos,
un vector con la palabra a buscar, la cantidad de letras encontradas y la cantidad de jugadas máximas 
que puede realizar el usuario. 
 */
package Entidades;

public class Ahorcado {

    private String[] vectorBuscar;
    private int cantLetrasEncontradas;
    private int cantJugadasMaximas;
    private String[] letrasUsadas;

    public Ahorcado(String[] vectorBuscar, int cantLetrasEncontradas, int cantJugadasMaximas) {
        this.vectorBuscar = vectorBuscar;
        this.cantLetrasEncontradas = cantLetrasEncontradas;
        this.cantJugadasMaximas = cantJugadasMaximas;
    }

    public Ahorcado() {
    }

    public String[] getVectorBuscar() {
        return vectorBuscar;
    }

    public int getCantLetrasEncontradas() {
        return cantLetrasEncontradas;
    }

    public int getCantJugadasMaximas() {
        return cantJugadasMaximas;
    }

    public void setVectorBuscar(String[] vectorBuscar) {
        this.vectorBuscar = vectorBuscar;
    }

    public void setCantLetrasEncontradas(int cantLetrasEncontradas) {
        this.cantLetrasEncontradas = cantLetrasEncontradas;
    }

    public void setCantJugadasMaximas(int cantJugadasMaximas) {
        this.cantJugadasMaximas = cantJugadasMaximas;
    }

    public String[] getLetrasUsadas() {
        return letrasUsadas;
    }

    public void setLetrasUsadas(String[] letrasUsadas) {
        this.letrasUsadas = letrasUsadas;
    }

}
