package Servicios;

import Entidades.Rutina;
import java.util.ArrayList;
import java.util.Scanner;


public class ServicioRutina {
    
    Rutina rutina = new Rutina();
    Scanner read = new Scanner(System.in).useDelimiter("\n");
    ArrayList <Rutina> arregloRutinas = new ArrayList<>();
    
    public void crearRutina() {

        System.out.println("Ingrese el id:");
        rutina.setId(read.nextInt());

        System.out.println("Ingrese el nombre del cliente:");
        rutina.setNombre(read.next());

        System.out.println("Ingrese duración del ejercicio:");
        rutina.setDuracion(read.nextInt());

        System.out.println("Ingrese nivel de dificultad:");
        rutina.setNivelDificultad(read.nextInt());

        System.out.println("Ingrese una descripcion:");
        rutina.setDescripcion(read.next());

        arregloRutinas.add(rutina);

    }

    public void obtenerRutinas() {

        System.out.println(arregloRutinas);
    }

    public void actualizarRutina() {

        System.out.println("Ingrese el id de la rutina a actualizar:");
        int id2 = read.nextInt();

        //este "for" te recorre el arreglo elemento por elemento en lugar de los indices
        for (Rutina arregloRutina : arregloRutinas) {

            if (arregloRutina.getId() == id2) {

                System.out.println("Ingrese el nombre del cliente:");
                arregloRutina.setNombre(read.next());

            
                System.out.println("Ingrese duración del ejercicio:");
                arregloRutina.setDuracion(read.nextInt());

                System.out.println("Ingrese nivel de dificultad:");
                arregloRutina.setNivelDificultad(read.nextInt());

                System.out.println("Ingrese una descripcion:");
                arregloRutina.setDescripcion(read.next());

            }

        }

    }
    
    
    public void eliminarRutina(){
        
     System.out.println("Ingrese el id de la rutina a eliminar:");
        int id2 = read.nextInt();

        for (Rutina arregloRutina : arregloRutinas) {

            if (arregloRutina.getId() == id2) {

                arregloRutinas.remove(arregloRutinas.indexOf(arregloRutina));
            }

        }
    
    
    }
    
    
    
    
    
}
