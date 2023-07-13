package Alquiler_De_Peliculas;


import PeliculaServices.PeliculaServices;

public class Alquiler_De_Peliculas {

    public static void main(String[] args) {
        
        PeliculaServices ps = new PeliculaServices();
        
        PeliculaServices.cargarPeliculas();
        ps.menuPeliculas();
        //PeliculaServices.crearPelicula();
        //ps.mostrarPeliculas(listaPeliculas);
    }

}
