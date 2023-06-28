/*
Realizar una clase llamada Matemática que tenga como atributos dos números reales con
los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un
constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el
Math.random para generar los dos números y se guardaran en el objeto con su
respectivos set. Deberá además implementar los siguientes métodos:

a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase
elevado al menor número. Previamente se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
package pooej09;

public class POOEj09 {

   
    private int num1;
    private int num2;
   
    public POOEj09(){
   
    }
   
    public POOEj09(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }
   
    //Getters
   
    public int getNum1(){
        return num1;
    }
    public int getNum2(){
        return num2;
    }
   
    //Setters
   
    public void setNum1(int num1){
        this.num1 = num1;
    }
   
    public void setNum2(int num2){
        this.num2 = num2;
    }

       
       
    public void crearNumeros(){
       
        this.setNum1((int) (Math.random() * 10));
        this.setNum2((int) (Math.random() * 10));
    }
   
    public boolean devolverMayor(int num1, int num2){
        boolean num = false;
        if(num1>num2){
            num = true;
            System.out.println("El num1 es el mayor y el numero es: " + num1);
            return num;
        }else if(num1 == num2){
            System.out.println("Los numeros son iguales.");
            num = true;
            return num;
        }else{
            System.out.println("El num2 es el mayor, y el numero es: " + num2);
            return num;
        }
    }
   
     public boolean calcularPotencia(int num1, int num2){
        boolean num = false;
        if(num1>num2){
            int potencia = (int) (Math.pow(num1,num2));
            System.out.println("La potencia es: " + potencia);
            return num;
        }else if(num1 == num2){
            System.out.println("Los numeros son iguales. no hay calculos.");
            num = true;
            return num;
        }else{
            System.out.println("El num2 es el mayor, no hay calculo. ");
            return num;
        }
       
    }
   
    public boolean calcularRaiz(int num1, int num2){
        boolean num = false;
        if(num1<num2){
            int potencia = (int) (Math.sqrt(num2));
            System.out.println("La potencia es: " + potencia);
            return num;
        }else if(num1 == num2){
            System.out.println("Los numeros son iguales. no hay calculos.");
            num = true;
            return num;
        }else{
            System.out.println("El num1 es el mayor, no hay calculo. ");
            return num;
        }
    }
   
    public static void main(String[] args) {
       
        POOEj09 m = new POOEj09();
        m.crearNumeros();
        System.out.println("Los numeros son: " + m.getNum1() + " y " + m.getNum2());
        m.devolverMayor(m.getNum1(), m.getNum2());
        m.calcularPotencia(m.getNum1(), m.getNum2());
        m.calcularRaiz(m.getNum1(), m.getNum2());
       
    }
}
    
    

