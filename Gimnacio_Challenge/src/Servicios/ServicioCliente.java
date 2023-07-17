package Servicios;

import Entidades.Cliente;
import java.util.ArrayList;
import java.util.Scanner;


public class ServicioCliente {
    
    
    ArrayList <Cliente> arregloClientes = new ArrayList<>();
      Scanner read = new Scanner(System.in).useDelimiter("\n");
       
      
    public void registrarCliente(){
      
       Cliente cliente1 = new Cliente();
       
        //está bueno poner un do/while que me pregunte si quiero poner otro cliente una vez que ingrese un cliente.
       
        System.out.println("Ingrese el id:");
        cliente1.setId(read.nextInt());
     
        
        System.out.println("Ingrese el nombre del cliente:");
        cliente1.setNombre(read.next());

        System.out.println("Ingrese edad del cliente");
        cliente1.setEdad(read.nextInt());

        System.out.println("Ingrese el peso del cliente");
        cliente1.setPeso(read.nextDouble());

        System.out.println("Ingrese la altura del cliente:");
        cliente1.setAltura(read.nextDouble());

        System.out.println("Ingrese el objetivo del cliente:");
        cliente1.setObjetivo(read.next());
        
        

        arregloClientes.add(cliente1);

    }

    public void obtenerClientes() {

        System.out.println(arregloClientes);

    }

    public void actualizarCliente() {

        System.out.println("Ingrese el id del cliente a actualizar:");
        int id2 = read.nextInt();

       

        //este "for" te recorre el arreglo elemento por elemento en lugar de los indices
        for (Cliente arregloCliente : arregloClientes) {

            if (arregloCliente.getId() == id2) {

                System.out.println("Ingrese el nombre del cliente:");
                arregloCliente.setNombre(read.next());

                System.out.println("Ingrese edad del cliente");
                arregloCliente.setEdad(read.nextInt());

                System.out.println("Ingrese el peso del cliente");
                arregloCliente.setPeso(read.nextDouble());

                System.out.println("Ingrese la altura del cliente:");
                arregloCliente.setAltura(read.nextDouble());

                System.out.println("Ingrese el objetivo del cliente:");
                arregloCliente.setObjetivo(read.next());

            }
        }

    }

    public void eliminarCliente() {

        System.out.println("Ingrese el id del cliente a actualizar:");
        int id2 = read.nextInt();

        for (Cliente arregloCliente : arregloClientes) {

            if (arregloCliente.getId() == id2) {

                arregloClientes.remove(arregloClientes.indexOf(arregloCliente));
            }

        }
    }

}