/*
 */
package POOEj02;

import CircumferenceServices.CircumferenceServices;
import Entity.Circumference;

public class PooEj02 {
    public static void main(String[] args) {
        
        //Instancia de CircumferenceServices
        CircumferenceServices cs = new CircumferenceServices();
        
        //Instancia de Circumference
        Circumference c = cs.makeCircumference();
        Circumference c1 = cs.makeCircumference();
        
        System.out.println(cs.metodoArea(c.getRadio()));
        System.out.println("-----------------------------");
        System.out.println(cs.metodoArea(c1.getRadio()));
        System.out.println("-----------------------------");
        System.out.println(cs.metodoPerimetro(c.getRadio()));
        System.out.println("-----------------------------");
        System.out.println(cs.metodoPerimetro(c1.getRadio()));
        
    }
}
