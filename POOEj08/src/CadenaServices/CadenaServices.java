/*
Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
String) y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese
una frase que puede ser una palabra o varias palabras separadas por un espacio en
blanco y a través de los métodos set, se guardará la frase y la longitud de manera
automática según la longitud de la frase ingresada. Deberá además implementar los
siguientes métodos:
a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
frase ingresada.
b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
compone la clase con otra nueva frase ingresada por el usuario.
f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
con una nueva frase ingresada por el usuario y mostrar la frase resultante.
g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar
la frase resultante.
h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 */
package CadenaServices;

import Entity.Cadena;
import java.util.Scanner;

public class CadenaServices {

    Scanner read = new Scanner(System.in);
    Cadena c = new Cadena();

    public void ingresarFrase(Cadena c) {
        Scanner read = new Scanner(System.in);
        System.out.println("Por favor ingrese una frase: ");
        c.setFrase(read.nextLine());

        c.setLongitud(c.getFrase().length());
    }

    public int mostrarVocales(String frase) {
        int contador = 0;
        frase = frase.toLowerCase();

        for (int i = 0; i < frase.length(); i++) {
            char caracter = frase.charAt(i);
            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                contador++;
            }
        }
        return contador;

    }

    public String invertirFrase(String frase) {
        StringBuilder sb = new StringBuilder(frase);
        sb.reverse();

        return sb.toString();
    }

    public int vecesRepetido(String frase) {
        int contador = 0;
        System.out.println("Ingrese una letra: ");
        String letra = read.next();

        if (letra.length() > 0) {
            char caract = letra.charAt(0);

            for (int i = 0; i < frase.length(); i++) {
                char caracter = frase.charAt(i);

                if (caracter == caract) {
                    contador++;
                }
            }
        }
        return contador;
    }

    public boolean compararLongitud(String frase) {
        Scanner read2 = new Scanner(System.in);
        System.out.println("Ingrese una nueva frase para comparar: ");
        String nuevaFrase = read2.nextLine();
        boolean igual = false;

        if (frase.length() == nuevaFrase.length()) {
            igual = true;
        }

        return igual;

    }

    public String unirFrases(String frase) {
        System.out.println("Ingresa una nueva frase para unir: ");
        Scanner read3 = new Scanner(System.in);
        String nuevaFrase = read3.nextLine();

        nuevaFrase = frase + nuevaFrase;

        return nuevaFrase;
    }

    public String remplazarCaracter(String frase) {
        Scanner read4 = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        System.out.println("Ingrese por favor un caracter para remplazarlo en la frase:");
        String nuevaFrase = read4.nextLine();

        if (nuevaFrase.length() > 0) {
            char caract = nuevaFrase.charAt(0);

            for (int i = 0; i < frase.length(); i++) {
                char caracter = frase.charAt(i);

                if (caracter == 'a' || caracter == 'A') {
                    sb.append(caract);
                } else {
                    sb.append(caracter);
                }
            }
        }
        return sb.toString();

    }

    public boolean contiene(String frase) {
        boolean b = false;
        Scanner read5 = new Scanner(System.in);
        System.out.println("Ingrese por favor un caracter para buscarlo en la frase:");
        String nuevaFrase = read5.nextLine();

        if (nuevaFrase.length() > 0) {
            char caract = nuevaFrase.charAt(0);

            for (int i = 0; i < frase.length(); i++) {
                char caracter = frase.charAt(i);
                if (caracter == caract) {
                    b = true;
                }

            }
        }
        return b;
    }
}
