/*
Vamos a realizar una clase llamada Raices, donde representaremos los valores de una
ecuación de 2o grado. Tendremos los 3 coeficientes como atributos, llamémosles a, b y c.
Hay que insertar estos 3 valores para construir el objeto a través de un método
constructor. Luego, las operaciones que se podrán realizar son las siguientes:

 Método getDiscriminante(): devuelve el valor del discriminante (double). El
discriminante tiene la siguiente formula: (b^2)-4*a*c ***

 Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
que esto ocurra, el discriminante debe ser mayor o igual que 0. ***

 Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para
que esto ocurra, el discriminante debe ser igual que 0. ***

 Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2
posibles soluciones. ***

 Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz.
Es en el caso en que se tenga una única solución posible.***

 Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por
pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso
de no existir solución, se mostrará un mensaje.

Nota: Formula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varia el signo
delante de -b
 */
package RaicesServices;

import Entity.Raices;
import java.util.Scanner;

public class RaicesServices {

    Raices r = new Raices();

    public void solicitaDatos() {
        System.out.println("Ingresa los valores de a, b y c: ");
        Scanner read = new Scanner(System.in);

        r.setA(read.nextInt());
        r.setB(read.nextInt());
        r.setC(read.nextInt());
    }

    public double discriminante() {
        double resultado = (Math.pow(r.getB(), 2) - 4 * r.getA() * r.getC());
        return resultado;
    }

    public boolean tieneRaices() {
        boolean condicion = false;
        if (discriminante() > 0) {
            condicion = true;
        }
        return condicion;
    }

    public boolean tieneRaiz() {
        boolean condicionRaiz = false;
        if (discriminante() == 0 ) {
            condicionRaiz = true;
        }
        return condicionRaiz;
    }

    public void obtenerRaices() {
        if (tieneRaices()) {
            System.out.println("Tiene raices: " + discriminante());
        }
    }

    public void obtenerRaiz() {
        if (tieneRaiz()) {
            System.out.println("Tiene una unica solucion y es: " + discriminante());
        }
    }

    public void calcular() {
        if (tieneRaiz()) {
            obtenerRaiz();
        } else if (tieneRaices()) {
            obtenerRaices();
        } else {
            System.out.println("No tienen solucion.");
        }
    }
}
