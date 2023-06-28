/*
Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
20..
 */
package pooej10;

import java.util.Arrays;

public class POOEj10 {

    public void llenarArreglo(int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 100);
        }
    }

    public void mostrarArreglo(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
            System.out.print(" ");

        }
        System.out.println("");
        System.out.println("---------------------------------------");
    }

    public void ordenarArreglo(int[] a) {
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
            System.out.print(" ");
        }
        System.out.println("");
        System.out.println("---------------------------------------");
    }

    public void agregarArreglo(int[] a, int[] b, POOEj10 m) {

        for (int i = 0; i < 20; i++) {
            if (i >= 10) {
                b[i] = a[i];
            } else if (i >= 11) {
                b[i] = 0;
            }
              
            //System.out.print(b[i]);
            //System.out.print(" ");
        }
        m.mostrarArreglo(b);
        System.out.println("");
    }

    public static void main(String[] args) {
        POOEj10 m = new POOEj10();

        int[] a = new int[50];
        int[] b = new int[20];

        m.llenarArreglo(a);
        m.mostrarArreglo(a);
        m.ordenarArreglo(a);
        m.agregarArreglo(a, b, m);

    }

}
