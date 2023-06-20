
package LibroService;

import Ejercicio_1.Libro;
import java.util.Scanner;


public class LibroService {
    Scanner read = new Scanner(System.in);
    
    public Libro cargarLibro(){
        
        System.out.println("Introducir ISBN:");
        String ISBN = read.next();
        
        System.out.println("Introducir titulo:");
        String titulo = read.next();
        
        System.out.println("Introducir autor:");
        String autor = read.next();
        
        System.out.println("Introducir numero de paginas:");
        String nPaginas = read.next();
        
        Libro l2 = new Libro(ISBN, titulo, autor, nPaginas);
        
        
        return l2;
        
    }
    
    public void mostrarLibro(Libro libro){
        
        System.out.println(libro.toString());
    }
}
