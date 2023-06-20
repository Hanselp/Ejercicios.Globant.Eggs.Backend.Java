/*
Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio2).
e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).
 */
package CircumferenceServices;

import Entity.Circumference;
import java.util.Scanner;



public class CircumferenceServices {

    
    
    
    
    public Circumference makeCircumference(){
        Scanner read = new Scanner(System.in);
        Circumference cs = new Circumference();
        
        System.out.println("Ingrese por favor el valor del radio:");
        cs.setRadio(read.nextDouble());
        
       
        return cs;
    } 
    
    public double metodoArea( double radio ){
        
        double area;
        area = (Math.PI) * (radio * radio);
        
        return area;
    }
    
    public double metodoPerimetro(double radio){
        double perimetro;
        
        perimetro = 2 * Math.PI * radio;
        
        return perimetro;
    }
}
