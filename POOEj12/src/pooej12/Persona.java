/*
Implemente la clase Persona. Una persona tiene un nombre y una fecha de nacimiento
(Tipo Date), constructor vacío, constructor parametrizado, get y set. Y los siguientes
métodos:
 Agregar un método de creación del objeto que respete la siguiente firma:
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al
usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la
fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
 Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener
en cuenta que para conocer la edad de la persona también se debe conocer la fecha
actual.
 Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
edad y retorna true en caso de que el receptor tenga menor edad que la persona que
se recibe como parámetro, o false en caso contrario.
 Metodo mostrarPersona(): este método muestra la persona creada en el método
anterior.
 */
package pooej12;

import java.util.Date;
import java.util.Scanner;

public class Persona {

    private String nombre;
    private int anho;
    private int mes;
    private int dia;
    private Date fechaDeNacimiento;

    public Persona() {
    }

    public Persona(String nombre, int anho, int mes, int dia) {
        this.nombre = nombre;
        this.anho = anho;
        this.mes = mes;
        this.dia = dia;
        this.fechaDeNacimiento = new Date(anho - 1900, mes - 1, dia);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnho() {
        return anho;
    }

    public void setAnho(int anho) {
        this.anho = anho;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(Date fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public void crearPersona(Persona p) {
        Scanner read = new Scanner(System.in);

        System.out.println("Por favor ingresa el nombre y la fecha de nacimiento(Año, mes, dia): ");
        p.setNombre(read.next());
        p.setAnho(read.nextInt());
        p.setMes(read.nextInt());
        p.setDia(read.nextInt());

        p.setFechaDeNacimiento(new Date(p.getAnho() - 1900, p.getMes() - 1, p.getDia()));
    }

    public int calcularEdad(Persona p) {
        int edad;
        int añoActual;
        Date f = new Date();
        añoActual = f.getYear() + 1900;
        edad = añoActual - p.getAnho();

        return edad;
    }

    public boolean menorQue(Persona p, int edad) {
        boolean mayor = false;
        if (p.calcularEdad(p) > edad) {
            mayor = true;
            System.out.println(mayor);
            return mayor;

        } else {
            System.out.println(mayor);
            return mayor;
        }

    }

    public void mostrarPersona(Persona p) {
        System.out.println("Los datos de la persona son: " + p.getNombre() + " " + p.getFechaDeNacimiento());
    }
}
