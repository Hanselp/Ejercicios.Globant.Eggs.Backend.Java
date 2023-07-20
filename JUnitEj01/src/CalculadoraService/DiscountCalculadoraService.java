/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalculadoraService;

import Entities.DiscountCalculadora;

/**
 *
 * @author hansel
 */
public class DiscountCalculadoraService {
    
    DiscountCalculadora dc = new DiscountCalculadora();
   
    public double descuentoMinimo(double producto){
        return (producto * 10) / 100; 
    }
    public double descuentoMaximo(double producto){
        return (producto * 50) / 100; 
    }
    public double sinDescuento(double producto){
        return producto; 
    }
   
    
}
