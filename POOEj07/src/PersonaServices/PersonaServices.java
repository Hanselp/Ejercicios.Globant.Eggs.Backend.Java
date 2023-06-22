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
package PersonaServices;

import Entity.Persona;
import java.util.Scanner;


public class PersonaServices {
    
    public void crearPersona(Persona p){
        
        
        Scanner read = new Scanner(System.in);
        System.out.println("Por favor ingresa los siguientes datos:");
        
        System.out.println("Nombre:");
        p.setNombre(read.next());
        
        System.out.println("Edad:");
        p.setEdad(read.nextInt());
        
        System.out.println("Sexo ('H' hombre, 'M' mujer, 'O' otro): ");
        String sex = read.next();
        if (sex.equalsIgnoreCase("H") || sex.equalsIgnoreCase("M") || sex.equalsIgnoreCase("O") ) {
            p.setSexo(sex);
        }else{
            System.out.println("Ingresa un valor valido.");
        }
            
        System.out.println("Peso en Kg:");
        p.setPeso(read.nextInt());
        
        System.out.println("Altura en Cm:");
        p.setAltura(read.nextDouble());
    }
    public double calcularIMC(double p, double a){
        
        
        double imc = (p / (a * 2));
      
        if (imc < 20) {
            System.out.println("Estas por debajo del peso ideal. Tu IMC es: " + imc );
            return imc;
        }else if (imc >= 20 && imc <= 25) {
            System.out.println("Estas en el rango de peso ideal. Tu IMC es: " + imc);
            return imc;
        }else if (imc > 25) {
            System.out.println("Estas en sobre peso, cuida tu salud. Tu IMC es: " + imc);
            return imc;
        }else{
            System.out.println("Ingresa un valor valido.");
        }
            return 0;
    }
    public boolean mayorEdad(Persona p){
        boolean mayorEdad = false;
        
        if (p.getEdad()>=18) {
            mayorEdad=true;
            System.out.println("Es mayor de edad");
        }else{
            System.out.println("Es menor de edad.");
        }
        return mayorEdad;
    }
}
