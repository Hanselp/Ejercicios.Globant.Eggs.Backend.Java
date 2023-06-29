/*
Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus
atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos
usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en
los atributos del objeto. Después, a través de otro método calcular y devolver la distancia
que existe entre los dos puntos que existen en la clase Puntos. Para conocer como
calcular la distancia entre dos puntos consulte el siguiente link:
http://www.matematicatuya.com/GRAFICAecuaciones/S1a.html

 */
package pooejex02;

import java.util.Scanner;

public class Puntos {

    private double x1;
    private double y1;
    private double x2;
    private double y2;

    public Puntos() {
    }

    public Puntos(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getY1() {
        return y1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public double getY2() {
        return y2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }

    public void crearPuntos(Puntos p){
        Scanner read = new Scanner(System.in);
        System.out.println("Por favor ingrese el valor de x1,y1 y luego el valor de x2,y2::");
        p.setX1(read.nextDouble());
        p.setY1(read.nextDouble());
        p.setX2(read.nextDouble());
        p.setY2(read.nextDouble());
        System.out.println("Numeros ingresados correctamente.");
    }
    
    public void distanciaPuntos(Puntos p){
        
        double distancia = Math.sqrt((Math.pow((p.getX2() - p.getX1()), 2) + Math.pow((p.getY2() - p.getY1()),2)));
        System.out.println("La distancia entre las coordenadas ingresadas es: " + distancia);
    }
}
