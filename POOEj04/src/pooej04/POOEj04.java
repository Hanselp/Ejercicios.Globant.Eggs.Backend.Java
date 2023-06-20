/*
 Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
base y un atributo privado altura. La clase incluirá un método para crear el rectángulo
con los datos del Rectángulo dados por el usuario. También incluirá un método para
calcular la superficie del rectángulo y un método para calcular el perímetro del
rectángulo. Por último, tendremos un método que dibujará el rectángulo mediante
asteriscos usando la base y la altura. Se deberán además definir los métodos getters,
setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
package pooej04;

import Entity.Rectangle;
import RectangleServices.RectangleServices;

public class POOEj04 {

    public static void main(String[] args) {
       RectangleServices os = new RectangleServices();
       Rectangle r = os.dataRectangle();
       
        System.out.println();
        
        System.out.println("Perimeter: " + os.dataPerimeter(r.getAltura(), r.getBase()));
        
        os.dataSurface(r);
        
        os.drawRectangle(r.getAltura(), r.getBase());
        
        System.out.println();
        
        os.drawRectangle2(r);
    }
    
}
