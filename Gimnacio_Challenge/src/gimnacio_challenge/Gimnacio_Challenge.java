
package gimnacio_challenge;


import Servicios.ServicioCliente;
import Servicios.ServicioRutina;
import java.util.Scanner;


public class Gimnacio_Challenge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        ServicioCliente sc = new ServicioCliente();
        ServicioRutina sr = new ServicioRutina();
        int opcion;

        do {
            
            
        System.out.println("***************");
        System.out.println("------MENÚ-----");
        System.out.println("Elija una opcion:");
        System.out.println("-----------------");
        System.out.println("1-Registar cliente");
        System.out.println("2-Listar clientes");
        System.out.println("3-Actualizar cliente");
        System.out.println("4-Eliminar cliente");
        System.out.println("5-Crear rutina");
        System.out.println("6-Listar Rutinas");
        System.out.println("7-Actualizar rutina");
        System.out.println("8-Eliminar rutina");
        System.out.println("9-Salir");
        opcion = read.nextInt();
        
            switch (opcion) {

                case 1:
                    sc.registrarCliente();
                    break;
                case 2:
                    sc.obtenerClientes();
                    break;
                case 3:
                    sc.actualizarCliente();
                    break;
                case 4:
                    sc.eliminarCliente();
                    break;
                case 5:
                    sr.crearRutina();
                    break;
                case 6:
                    sr.obtenerRutinas();
                    break;
                case 7:
                    sr.actualizarRutina();
                    break;
                case 8:
                    sr.eliminarRutina();
                    break;
                case 9:
                    System.out.println("See you space cowboy..");
                    break;

            }

        } while (opcion != 9);

    }

}
