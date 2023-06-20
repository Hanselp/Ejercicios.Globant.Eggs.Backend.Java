
package Ejercicio_1;

public class Libro {
    
    public String ISBN;
    public String titulo;
    public String autor;
    public String nPaginas;

    //Metodo Constructor
    public Libro(String ISBN, String titulo, String autor, String nPaginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.nPaginas = nPaginas;
    }
    
   //Constructor vacio
    public Libro(){
        
    }
    //Getters

    public String getISBN() {
        return ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getnPaginas() {
        return nPaginas;
    }
    
    
    //Setters

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setnPaginas(String nPaginas) {
        this.nPaginas = nPaginas;
    }
    
    //TO_STRING

    @Override
    public String toString() {
        return "Datos de los Libros {" + "ISBN=" + ISBN + ", titulo=" + titulo + ", autor=" + autor + ", nPaginas=" + nPaginas + '}';
    }
    
}
