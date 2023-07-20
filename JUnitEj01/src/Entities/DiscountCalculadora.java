/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

/**
 *
 * @author hanse
 */
public class DiscountCalculadora {

    //Atributos
    private double producto1 = 10000;
    private double producto2 = 50000;
    private double producto3= 100000;

    //Metodo Constructor sin parametros
    public DiscountCalculadora() {

    }

    //Metodo Constructor con parametros
    public DiscountCalculadora(double producto1, double producto2, double producto3) {
        this.producto1 = producto1;
        this.producto2 = producto2;
        this.producto3 = producto3;
    }

    //Getters and Setters

    public double getProducto1() {
        return producto1;
    }

    public void setProducto1(double producto1) {
        this.producto1 = producto1;
    }

    public double getProducto2() {
        return producto2;
    }

    public void setProducto2(double producto2) {
        this.producto2 = producto2;
    }

    public double getProducto3() {
        return producto3;
    }

    public void setProducto3(double producto3) {
        this.producto3 = producto3;
    }
 
     
}
