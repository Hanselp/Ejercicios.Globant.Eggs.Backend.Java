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
package RectangleServices;

import Entity.Rectangle;
import java.util.Scanner;

public class RectangleServices {
    
    
    public Rectangle dataRectangle(){
        Rectangle r = new Rectangle();
        
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese por favor la alutura y luego la base:");
        r.setAltura(read.nextInt());
        r.setBase(read.nextInt());
        
        return r;
    }
    
    public int dataSurface(int a, int b){
        return b*a;
    }
    public int dataPerimeter(int a, int b){
        return (b+a)*2;
    }
    public void drawRectangle(int a, int b){
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
