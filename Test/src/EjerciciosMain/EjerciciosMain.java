
package EjerciciosMain;

import Ejercicio_1.Libro;
import LibroService.LibroService;

public class EjerciciosMain {
    public static void main(String[] args) {
        
        //Instancia de clase LibroService, para poder acceder a los metedos de la clase
        LibroService verLibro = new LibroService();
        
        //Objeto de la clase libro
        Libro l1 = new Libro("L100E", "Principito", "Hansel", "1000");
        
        //Metodo de la clase 
        Libro l2 = verLibro.cargarLibro();
        
        Libro l3 = verLibro.cargarLibro();
        
        verLibro.mostrarLibro(l3);
        verLibro.mostrarLibro(l2);
        
        
        
    }
}
