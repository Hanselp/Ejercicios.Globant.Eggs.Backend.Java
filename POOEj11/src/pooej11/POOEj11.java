/*
Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase
Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que
se puede conseguir instanciando un objeto Date con constructor vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();
 */
package pooej11;

import java.util.Date;
import java.util.Scanner;

public class POOEj11 {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese por favor el año, mes y dia que quiera:");
        int anho = read.nextInt();
        int mes = read.nextInt();
        int dia = read.nextInt();
        
        Date fecha = new Date(anho-1900, mes-1, dia);
        Date fechaActual = new Date();
        
        System.out.println("La fecha ingresada es: " + fecha + ", y la fecha actual es: " + fechaActual + ", y la diferencia de años es: " +  (fechaActual.getYear() - fecha.getYear()) );


    }
    
}
