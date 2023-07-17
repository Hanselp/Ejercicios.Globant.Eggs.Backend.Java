package PeliculaServices;

import AlquilerServices.AlquilerServices;
import static AlquilerServices.AlquilerServices.peliculaAlquilada;
import Entity.Alquiler;

import Entity.Pelicula;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class PeliculaServices {

    Pelicula p = new Pelicula();
    AlquilerServices as = new AlquilerServices();

    public static List<Pelicula> listaPeliculas = new ArrayList<>();

    public void menuPeliculas() {
        // try {
        JOptionPane.showMessageDialog(null, "Bienvenido al Alquiler de Peliculas");
        String[] opciones = {"Lista de peliculas disponibles", "Cargar una pelicula nueva", "Alquilar una pelicula", "Lista de peliculas ya Alquiladas", "Buscar peliculas por titulo o genero", "Buscar alquileres por fecha"};

        int seleccion = JOptionPane.showOptionDialog(null, "Selecciona la opcion que quieres realizar: ", "Menu",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

        switch (seleccion) {
            case 0:
                mostrarPeliculas(listaPeliculas);
                break;
            case 1:
                crearPelicula();
                break;
            case 2:
                as.alquilarPelicula();
                break;
            case 3:
                AlquilerServices.mostrarAlquiladas();
                break;
            default:
                break;
        }
        deseaContinuar();
    }

    public static void cargarPeliculas() {

        listaPeliculas.add(new Pelicula("Spiderman", "Comics", 2010, "2 Horas"));
        listaPeliculas.add(new Pelicula("Superman", "Comics", 2012, "2 Horas"));
        listaPeliculas.add(new Pelicula("La Mascara", "Comedia", 2014, "2 Horas"));
        listaPeliculas.add(new Pelicula("Mision Imposible", "Acción", 2016, "2 Horas"));
        listaPeliculas.add(new Pelicula("La Llorona", "Terror", 2017, "2 Horas"));
    }

    public void crearPelicula() {

        boolean condicion = true;
        String valorPositivo = "si";
        String valorNegativo = "no";

        while (condicion) {
            try {
                String titulo = JOptionPane.showInputDialog("Por favor ingrese el título de la película:");
                String genero = JOptionPane.showInputDialog("Por favor ingrese el género de la película:");
                int anho = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese el año de la película:"));
                String duracion = JOptionPane.showInputDialog("Por favor ingrese la duración de la película en minutos:");

                Pelicula p1 = new Pelicula(titulo, genero, anho, duracion);
                listaPeliculas.add(p1);
            } catch (NumberFormatException e) {
                condicion = false;
                JOptionPane.showMessageDialog(null, "Ingresaste un valor invalido.");
            } catch (NullPointerException e) {
                System.exit(0);
            }

            do {
                try {
                    String valorIngresado = JOptionPane.showInputDialog("¿Desea ingresar otra pelicula? Ingrese: SI ó NO");
                    if (valorIngresado.equalsIgnoreCase(valorPositivo)) {
                        condicion = true;

                    } else if (valorIngresado.equalsIgnoreCase(valorNegativo)) {
                        JOptionPane.showMessageDialog(null, "Creardor de peliculas cerrado.");
                        condicion = false;
                        break;
                    } else {
                        JOptionPane.showMessageDialog(null, "Ingresaste un valor invalido.");
                        condicion = true;
                    }
                } catch (NumberFormatException e) {
                    condicion = true;
                    JOptionPane.showMessageDialog(null, "Ingresaste un valor invalido.");
                } catch (NullPointerException e) {
                    System.exit(0);
                }

            } while (false);

        }

    }

    public static void mostrarPeliculas(List<Pelicula> listaPeliculas) {

        //Arreglo para almacenar los objetos de la lista pelicula
        String[] opciones = new String[listaPeliculas.size()];
        //For para recorrer el arreglo 
        for (int i = 0; i < listaPeliculas.size(); i++) {
            opciones[i] = listaPeliculas.get(i).getTitulo();
        }
        //JOptionPane para mostrar la lista de peliculas
        int seleccion = JOptionPane.showOptionDialog(
                null,
                "Peliculas disponibles",
                "Peliculas",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                opciones,
                opciones[0]);

        if (seleccion >= 0) {
            Pelicula peliculaSeleccionada = listaPeliculas.get(seleccion);
            JOptionPane.showMessageDialog(
                    null,
                    "Titulo: " + peliculaSeleccionada.getTitulo() + "\n"
                    + "Género: " + peliculaSeleccionada.getGenero() + "\n"
                    + "Año: " + peliculaSeleccionada.getAnho() + "\n"
                    + "Duracion: " + peliculaSeleccionada.getDuracion());
            
            copiarElemento(listaPeliculas, listaPeliculas, seleccion);
            //peliculaAlquilada.addAll(seleccion,);
            //AlquilerServices.peliculaAlquilada.add(PeliculaServices.listaPeliculas.get(seleccion));
            //peliculaAlquilada.add(seleccion, );
            
            PeliculaServices.listaPeliculas.remove(seleccion);

        }
    }

    public boolean permisoCrearPelicula() {
        boolean condicion = false;
        String valorPositivo = "si";
        String valorNegativo = "no";

        do {
            try {
                String valorIngresado = JOptionPane.showInputDialog("¿Desea ingresar otra pelicula? Ingrese: SI ó NO");
                if (valorIngresado.equalsIgnoreCase(valorPositivo)) {
                    condicion = false;

                } else if (valorIngresado.equalsIgnoreCase(valorNegativo)) {
                    JOptionPane.showMessageDialog(null, "Creardor de peliculas cerrado.");
                    condicion = true;
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "Ingresaste un valor invalido.");
                    condicion = true;
                }
            } catch (NumberFormatException e) {
                condicion = true;
                JOptionPane.showMessageDialog(null, "Ingresaste un valor invalido.");
            } catch (NullPointerException e) {
                condicion = false;
                finalizarPrograma();
            }

        } while (condicion);

        return condicion;
    }

    public void finalizarPrograma() {
        JOptionPane.showMessageDialog(null, "Programa terminado.");
        System.exit(0);
    }

    public void deseaContinuar() {

        int opcion = JOptionPane.showOptionDialog(null, "¿Deseas continuar?", "Confirmación", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Yes", "No", "Cancelar"}, "Yes");//AQUI
        switch (opcion) {
            case 0:
                menuPeliculas();
                break;
            case 1:
                finalizarPrograma();
                break;
            case 2:
                finalizarPrograma();
                break;
            default:
                break;
        }
    }
    
    public static <T> void copiarElemento(List<T> listaFuente, List<T> listaDestino, int indice) {
        if (indice >= 0 && indice < listaFuente.size()) {
            T elemento = listaFuente.get(indice);
            listaDestino.add(elemento);
        } else {
            System.out.println("El índice es inválido");
        }
    }
}

