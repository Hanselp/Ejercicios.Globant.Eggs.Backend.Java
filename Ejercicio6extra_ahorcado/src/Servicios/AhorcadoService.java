/*
Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener como atributos,
un vector con la palabra a buscar, la cantidad de letras encontradas y la cantidad de jugadas máximas 
que puede realizar el usuario. Definir los siguientes métodos con los parámetros que sean necesarios:
 Constructores, tanto el vacío como el parametrizado.
 Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima.
Con la palabra del usuario, pone la longitud de la palabra, como la longitud del vector. 
Después ingresa la palabra en el vector, letra por letra, quedando cada letra de la palabra 
en un índice del vector. Y también, guarda en cantidad de jugadas máximas, el valor que ingresó el usuario y 
encontradas en 0.
 Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota: buscar 
como se usa el vector.length.
 Método buscar(letra): este método recibe una letra dada por el usuario y busca sila letra 
ingresada es parte de la palabra o no. También informará si la letra estaba o no.
 Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre
cuantas letras han sido encontradas y cuantas le faltan. Este método además deberá devolver 
true si la letra estaba y false si la letra no estaba, ya que, cada vez que se busque una letra 
que no esté, se le restará uno a sus oportunidades.
 Método intentos(): para mostrar cuantas oportunidades le queda al jugador.
 Método juego(): el método juego se encargará de llamar todos los métodos previamente mencionados 
e informará cuando el usuario descubra toda la palabra o se quede sin intentos. Este método se llamará en el main.
Un ejemplo de salida puede ser así:
 */
package Servicios;

import Entidades.Ahorcado;
import java.util.Scanner;

public class AhorcadoService {

    /*  
     Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima.
Con la palabra del usuario, pone la longitud de la palabra, como la longitud del vector. 
Después ingresa la palabra en el vector, letra por letra, quedando cada letra de la palabra 
en un índice del vector. Y también, guarda en cantidad de jugadas máximas, el valor que ingresó el usuario y 
encontradas en 0.
    
     */
    Ahorcado juego1 = new Ahorcado();

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void crearJuego() {

        Scanner read2 = new Scanner(System.in);

        System.out.println("Ingrese una palabra:");
        String palabra = read2.next();

        String[] vectorPalabra = new String[palabra.length()];

        for (int i = 0; i < palabra.length(); i++) {

            String letra = palabra.substring(i, i + 1);

            vectorPalabra[i] = letra;

        }

        // juego1.setVectorBuscar(read2.next().toLowerCase().toCharArray());
        juego1.setVectorBuscar(vectorPalabra);

        System.out.println("Ingrese cantidad de jugadas máxima:");
        juego1.setCantJugadasMaximas(read2.nextInt());

    }

    /*
 Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota: buscar 
como se usa el vector.length.*/
    public int longitud() {

        int longitud = juego1.getVectorBuscar().length;

        // System.out.println("Longitud de la palabra es: " + longitud);
        return longitud;
    }

    /*
 Método buscar(letra): este método recibe una letra dada por el usuario y busca sila letra 
ingresada es parte de la palabra o no. También informará si la letra estaba o no.*/
    public void buscar(String letra) {

        Scanner read = new Scanner(System.in);
        boolean bandera = false;
        int encontradas = 0;

        int longitud = juego1.getVectorBuscar().length;

        int faltantes = longitud;

        int cantJugadasPermitidas = juego1.getCantJugadasMaximas();

        while (cantJugadasPermitidas > 0 && faltantes > 0) {

            System.out.println("Ingrese una letra:");
            letra = read.next();

            for (int i = 0; i < longitud; i++) {
                if (juego1.getVectorBuscar()[i].equalsIgnoreCase(letra)) {
                    bandera = true;
                }
            }

            if (bandera == true) {
                System.out.println("La letra pertenece a la palabra.");
                encontradas += 1;
                faltantes -= 1;
                System.out.println("Encontró " + encontradas + " letras, le faltan " + faltantes + ".");

            } else {
                System.out.println("La letra no pertenece a la palabra");

                cantJugadasPermitidas -= 1;
                System.out.println("Le quedan " + cantJugadasPermitidas + " intentos.");
            }
        }
    }

    /*
 Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre
cuantas letras han sido encontradas y cuantas le faltan. Este método además deberá devolver 
true si la letra estaba y false si la letra no estaba, ya que, cada vez que se busque una letra 
que no esté, se le restará uno a sus oportunidades.*/
    public boolean encontradas(String letraInput) {

        Scanner read1 = new Scanner(System.in);

        boolean bandera = false;

        String letraPalabra;
        int encontradas = 0;

        for (int i = 0; i < longitud(); i++) {

            if (juego1.getVectorBuscar()[i].equalsIgnoreCase(letraInput)) {

                bandera = true;
                encontradas += 1;
            }
        }
        return bandera;
    }

    /*
 Método juego(): el método juego se encargará de llamar todos los métodos previamente mencionados 
e informará cuando el usuario descubra toda la palabra o se quede sin intentos. Este método se llamará en el main.
     */
    public void juego() {

        crearJuego();
        System.out.println("Longitud de la palabra es: " + longitud());

        //Scanner read = new Scanner(System.in);
        int intentosFaltantes = juego1.getCantJugadasMaximas();
        int letrasFaltantes = longitud();
        String[] vectorLetrasUsadas = new String[intentosFaltantes];
        String letra;

        while (letrasFaltantes > 0 && intentosFaltantes > 0) {

            System.out.println("Ingrese una letra:");
            letra = leer.next();

            if (encontradas(letra) == true) {

                System.out.println("ENCONTRASTE UNA LETRA!");
                letrasFaltantes -= 1;

            } else {
                System.out.println("LETRA INCORRECTA");
                intentosFaltantes -= 1;
            }
            System.out.println("Te quedan " + intentosFaltantes + " intentos");
            System.out.println("Te quedan " + letrasFaltantes + " para ganar.");
        }
        if (intentosFaltantes == 0 && letrasFaltantes != 0) {
            System.out.println("PERDISTE!");
        } else {
            System.out.println("GANASTE!");
        }
    }
}
