/*
Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la
cantidad actual de café que hay en la cafetera). Implemente, al menos, los siguientes
métodos:
 Constructor predeterminado o vacío
 Constructor con la capacidad máxima y la cantidad actual

 Métodos getters y setters.
 Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
máxima.
 Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
 Método vaciarCafetera(): pone la cantidad de café actual en cero.
 Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.
 */
package CafeteraServices;

import Entity.Cafetera;
import java.util.Scanner;

public class CafeteraServices {
    
    Scanner read = new Scanner(System.in);
  
    public void llenarCafetera(Cafetera c){
        
        if(c.getCapacidadActual() != c.getCapacidadMaxima()){
            c.setCapacidadActual(c.getCapacidadMaxima());
        }else if(c.getCapacidadActual() == c.getCapacidadMaxima()){
            System.out.println("Llenando la cafetera, espera un momento.");
            esperaSirviendo();
            System.out.println("La cafetera ya se encuentra llena.");
        }else
            System.out.println("Estas ingresando demasiado cafe.");
    }
    public void esperaSirviendo(){
        int tiempoEspera = 3000;
        try {
                Thread.sleep(tiempoEspera); // Pausa la ejecución durante el tiempo especificado
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
    }
    public void tazaCafe(){
        int altura = 5;
        int ancho = 9;
        
              // Bucle externo para recorrer las filas de la taza
        for (int i = 0; i < altura; i++) {
            // Bucle interno para recorrer las columnas de la taza
            for (int j = 0; j < ancho; j++) {
                if (i == 0 || i == altura - 1 || j == 0 || j == ancho - 1) {
                    // Imprimir asterisco en los bordes de la taza
                    System.out.print("*");
                } else {
                    // Imprimir espacio en el interior de la taza
                    System.out.print(" ");
                }
            }
            System.out.println(); // Cambiar de línea después de cada fila
            }
    }
    public void servirTaza(Cafetera c){
    
        
        System.out.println("Hola, ingresa el tamaño dela tasa de cafe que deseas: ");
        int tamañoCafe = read.nextInt();
        
        if (tamañoCafe > c.getCapacidadActual()) {
            System.out.println("El tamañado ingresado es mayor a la capacidad actual. "
                    + " Te sirvo lo que tengo disponible. Cafe restante: " + c.getCapacidadActual());
                    esperaSirviendo();
                    System.out.println("Espera te estoy preparando tu cafe.");
                    esperaSirviendo();
                    System.out.println("Listo, aqui tienes tu cafe:");
                    tazaCafe();
        }else if (tamañoCafe <= c.getCapacidadActual()) {
            c.setCapacidadActual(-tamañoCafe);
            System.out.println("Recibido, ya te sirvo tu tasa de cafe.");
            esperaSirviendo();
            System.out.println("Espera te estoy preparando tu cafe.");
            esperaSirviendo();
            tazaCafe();
            System.out.println("Que disfrutes tu taza de cafe :)");
        }
    }
    public void vaciarCafetera(Cafetera c){
        c.setCapacidadActual(0);
        System.out.println("Se ha vaciado la cafetera.");
    }
    public void agregarCafe(Cafetera c){
        //Cafetera cafe = new Cafetera();
        System.out.println("Por favor ingresa la cantidad de cafe en ml que deseas añadir:");
        c.setCapacidadMaxima(read.nextInt());
        
    }
}

