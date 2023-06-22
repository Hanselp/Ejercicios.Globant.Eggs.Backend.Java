/*
Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad,
sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún otro
atributo, puede hacerlo. Los métodos que se implementarán son:
 Un constructor por defecto.
 Un constructor con todos los atributos como parámetro.
 Métodos getters y setters de cada atributo.
 Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
O. Si no es correcto se deberá mostrar un mensaje
 Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20,
significa que la persona está por debajo de su peso ideal y la función devuelve un -1.
Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la
persona está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado
de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.
 Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
devuelve un booleano.
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
distintas variables, para después en el main, calcular un porcentaje de esas 4 personas

cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores
 */
package pooej07;

import Entity.Persona;
import PersonaServices.PersonaServices;

public class POOEj07 {

    public static void main(String[] args) {
        
        PersonaServices ps1 = new PersonaServices();
        
        Persona p1 = new Persona();
        Persona p2 = new Persona();
        Persona p3 = new Persona();
        Persona p4 = new Persona();
        
        ps1.crearPersona(p1);
        double resImc1 = ps1.calcularIMC(p1.getPeso(), p1.getAltura());
        ps1.mayorEdad(p1);
        
        System.out.println("-----------------------------------------");
        
        ps1.crearPersona(p2);
        double resImc2 = ps1.calcularIMC(p2.getPeso(), p2.getAltura());
        ps1.mayorEdad(p2);
        
        System.out.println("-----------------------------------------");
        
        ps1.crearPersona(p3);
        double resImc3 = ps1.calcularIMC(p3.getPeso(), p3.getAltura());
        ps1.mayorEdad(p3);
        
        System.out.println("-----------------------------------------");
        
        ps1.crearPersona(p4);
        double resImc4 = ps1.calcularIMC(p4.getPeso(), p4.getAltura());
        ps1.mayorEdad(p4);
        
        System.out.println("-----------------------------------------");
        
        System.out.println("El promedio del IMC de las personas es: " + (resImc1 + resImc2 + resImc3 + resImc4) / 4 );
        System.out.println("El promedio de las edades de las personas es: " + (p1.getEdad() + p2.getEdad() + p3.getEdad() + p4.getEdad()) / 4 );
    }
    
}
