/*
Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero).
Las operaciones asociadas a dicha clase son:
a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
b) Agregar los métodos getters y setters correspondientes
c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
y se la sumara a saldo actual.
e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se
la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.
f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
usuario no saque más del 20%.
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
package AccountServices;

import Entity.Account;
import java.util.Scanner;

/**
 *
 * @author hanse
 */
public class AccountServices {
    
    Scanner read = new Scanner(System.in);
    
    public Account createCuenta(){
        Account a = new Account();
        
        
        System.out.println("Por favor ingrese los siguietes datos: ");
        System.out.println("Cuenta: ");
        a.setNumeroCuenta(read.nextInt());
        System.out.println("DNI: ");
        a.setDNI(read.nextLong());
        System.out.println("Saldo actual: ");
        a.setSaldo(read.nextInt());
        
        return a;
    }
    
    public void ingresoSueldo(Account a){
        
        System.out.println("Ingrese el valor del sueldo: ");
        int ingreso = read.nextInt();
        
        a.setSaldo(a.getSaldo() + ingreso);
       
    }
    public void retirarSueldo(Account a){
        System.out.println("Ingrese la cantidad que quiere retirar:");
        int retiro = read.nextInt();
        
        if(retiro>a.getSaldo()){
            System.out.println("No tiene saldo suficiente.");
            a.setSaldo(0);
        }else if(retiro<a.getSaldo() ){
            a.setSaldo(a.getSaldo() - retiro);
            System.out.println("Retiro sactisfatorio");
        }
            
    }
    public void retiroRapido(Account a){
        System.out.println("El retiro rapido solo permite un 20% del saldo actual,"
                + " ingrese el monto a retirar:");
        
        System.out.println("Puedes retirar la cantidad de: " + ((a.getSaldo()*20) / 100 ) );
        
        int retiroRapido = read.nextInt();
        //int valorPermitido = ((a.getSaldo()*20) / 100 ));
        if (retiroRapido > ((a.getSaldo()*20) / 100 )) {
            System.out.println("Ingresaste un valor mayor al permitido.");
            
        }else if(retiroRapido <= ((a.getSaldo()*20) / 100 )){
            a.setSaldo(a.getSaldo() - retiroRapido);
            System.out.println("Retiro sactisfatorio");
        }
        
    }
    public void consultarSaldo(Account a){
        System.out.println("El saldo de su cuenta es: " + a.getSaldo());
    }
    public void consultarDatosCuenta(Account a){
        System.out.println(a.toString());
    }
}
