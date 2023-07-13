package AlquilerServices;

import Entity.Alquiler;
import Entity.Pelicula;
import PeliculaServices.PeliculaServices;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

public class AlquilerServices {

    public static List<Alquiler> peliculaAlquilada = new ArrayList<>();

    Alquiler a = new Alquiler();
    Calendar fCalendar = Calendar.getInstance();
    Date d = fCalendar.getTime();

    public void peliculaAlquilada() {

        d = fCalendar.getTime(); // Llamo la hora de seleccion.
        a.setFechaInicio(d); // Capturo la hora en el atributo
        fCalendar.add(Calendar.DAY_OF_MONTH, 30); // Agrego el mes de plazo para entrega
        Date fechaFinal = fCalendar.getTime(); //Llamo la fecha de un mes despues
        a.setFechaFin(fechaFinal);//Capturo en el atributo la fecha de entrega.

        JOptionPane.showMessageDialog(null, "Pelicula seleccionada alquilada. Fecha inicial: "
                + a.getFechaInicio() + " Fecha de entrega: " + a.getFechaFin());
    }

    public static void mostrarAlquiladas() {
        //Arreglo para almacenar los objetos de la lista pelicula
        String[] opcion = new String[peliculaAlquilada.size()];
        //For para recorrer el arreglo 
        for (int i = 0; i < peliculaAlquilada.size(); i++) {
            opcion[i] = peliculaAlquilada.get(i).toString();
        }
        //JOptionPane para mostrar la lista de peliculas
        int seleccion = JOptionPane.showOptionDialog(
                null,
                "Peliculas disponibles",
                "Peliculas",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                opcion,
                opcion[0]);

        if (seleccion >= 0) {
            Alquiler peliculaSeleccionada = peliculaAlquilada.get(seleccion);
            JOptionPane.showMessageDialog(
                    null,
                    "Titulo: " + peliculaSeleccionada.toString());
            peliculaAlquilada.add(seleccion, (Alquiler) peliculaAlquilada);
        }
    }

    public void alquilarPelicula() {
        //PeliculaServices.cargarPeliculas();
        PeliculaServices.mostrarPeliculas(PeliculaServices.listaPeliculas);
        peliculaAlquilada();
    }

    public void peliculasDisponibles() {
        //mostrarPeliculas(listaPeliculas);
    }
}
