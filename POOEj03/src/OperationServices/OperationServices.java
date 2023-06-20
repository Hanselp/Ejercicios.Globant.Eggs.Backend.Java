/*
Crear una clase llamada Operacion que tenga como atributos privados numero1 y
numero2. A continuación, se deben crear los siguientes métodos:
a) Método constructor con todos los atributos pasados por parámetro.
b) Metodo constructor sin los atributos pasados por parámetro.
c) Métodos get y set.
d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda
en los atributos del objeto.
e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
f) Método restar(): calcular la resta de los números y devolver el resultado al main

g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si
fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error.
Si no, se hace la multiplicación y se devuelve el resultado al main
h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar
una división por cero, el método devuelve 0 y se le informa al usuario el error se le
informa al usuario. Si no, se hace la división y se devuelve el resultado al main.
 */
package OperationServices;

import Entity.Operation;
import java.util.Scanner;


public class OperationServices {
    
    public Operation makeOperation(){
        Operation o = new Operation();
        
        Scanner read = new Scanner(System.in);
        System.out.println("Por favor ingrese dos numeros: ");
        o.setNumero1(read.nextInt());
        o.setNumero2(read.nextInt());
        
        return o;
    }
    
       public int add(int n1, int n2){
            int result;
            result = n1 + n2;
            return result;
        }
       
       public int subt(int n1, int n2){
         int result;
            result = n1 - n2;
            return result;
            
        }
       
       public int multip(int n1, int n2){
             int result;
            
            if(n2 != 0){
            result = n1 * n2;
                return result;
            }else{
                System.out.println("No se puede dividir por CERO.");
                return 0;
            }  
        }
       
       public int div(int n1, int n2){
             int result;
            
            if(n1 != 0 && n2 != 0){
            result = n1 / n2;
                return result;
            }else{
                System.out.println("No se puede dividir por CERO.");
                return 0;
        }
    }   
        
}
