/*
Una tienda que vende teléfonos móviles quiere tener registro de cada producto que
posee en un sistema computacional. Para ello, crearemos un programa donde se pueda
almacenar cada producto con su información. Crear una entidad Movil con los atributos
marca, precio, modelo, memoriaRam, almacenamiento y codigo. El atributo código será
un arreglo numérico de dimensión 7 (siete) donde cada subíndice alojará un número
correspondiente al código. A continuación, se implementarán los siguientes métodos:
 Un constructor por defecto.
 Un constructor con todos los atributos como parámetro.
 Métodos getters y setters de cada atributo.
 Método cargarCelular(): se solicita al usuario que ingrese los datos necesarios para
instanciar un objeto Celular y poder cargarlo en nuestro programa.
 Método ingresarCodigo(): este método permitirá ingresar el código completo de siete
números de un celular. Para ello, puede utilizarse un bucle repetitivo
 */
package pooej14;

import java.util.Scanner;

public class Movil {
    
    private String marca;
    private int precio;
    private String modelo;
    private String memoriaRAM;
    private String almacenamiento;
    private int[] codigo = new int[7];
    
    public Movil() {
    }
    
    public Movil(String marca, int precio, String modelo, String memoriaRAM, String almacenamiento) {
        this.marca = marca;
        this.precio = precio;
        this.modelo = modelo;
        this.memoriaRAM = memoriaRAM;
        this.almacenamiento = almacenamiento;
    }
    
    public String getMarca() {
        return marca;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public int getPrecio() {
        return precio;
    }
    
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    public String getModelo() {
        return modelo;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public String getMemoriaRAM() {
        return memoriaRAM;
    }
    
    public void setMemoriaRAM(String memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }
    
    public String getAlmacenamiento() {
        return almacenamiento;
    }
    
    public void setAlmacenamiento(String almacenamiento) {
        this.almacenamiento = almacenamiento;
    }
    
    public int[] getCodigo() {
        return codigo;
    }
    
    public void setCodigo(int[] codigo) {
        this.codigo = codigo;
    }
    
    public void ingresarCodigo(int[] c) {
        Scanner read = new Scanner(System.in);
        
        for (int i = 0; i < c.length; i++) {
            System.out.println("Por favor ingresa el codigo del celular:");
            c[i] = read.nextInt();
            
        }
    }
    
    public void cargarCelular(Movil m) {
        Scanner read1 = new Scanner(System.in);
        System.out.println("Por favor ingresa los siguientes datos: ");
        
        System.out.println("Marca: ");
        m.setMarca(read1.next());
        
        System.out.println("Precio: ");
        m.setPrecio(read1.nextInt());
        
        System.out.println("Modelo: ");
        m.setModelo(read1.next());
        
        System.out.println("Memoria Ram: ");
        m.setMemoriaRAM(read1.next());
        
        System.out.println("Almacenamiento: ");
        m.setAlmacenamiento(read1.next());
        
        System.out.println("Ingresa los codigos de 7 digitos de cada movil: ");
        ingresarCodigo(codigo);
    }
    
}
