package Entidades;


public class Rutina {
    
    private int id;
    private String nombre;
    private int duracion;
    private int nivelDificultad;
    private String descripcion;

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDuracion() {
        return duracion;
    }

    public int getNivelDificultad() {
        return nivelDificultad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public void setNivelDificultad(int nivelDificultad) {
        this.nivelDificultad = nivelDificultad;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Rutina(int id, String nombre, int duracion, int nivelDificultad, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.duracion = duracion;
        this.nivelDificultad = nivelDificultad;
        this.descripcion = descripcion;
    }

    public Rutina() {
    }

    @Override
    public String toString() {
        return "Rutina{" + "id=" + id + ", nombre=" + nombre + ", duracion=" + duracion + ", nivelDificultad=" + nivelDificultad + ", descripcion=" + descripcion + '}';
    }
    
    
}