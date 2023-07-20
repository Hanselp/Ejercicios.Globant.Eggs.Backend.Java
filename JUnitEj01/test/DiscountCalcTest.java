/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import CalculadoraService.DiscountCalculadoraService;
import Entities.DiscountCalculadora;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hansel
 */
public class DiscountCalcTest {
    
    DiscountCalculadoraService dcs;
    DiscountCalculadora dc;
    
    public DiscountCalcTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        dcs = new DiscountCalculadoraService();
        dc = new DiscountCalculadora();
    }
    
    @After
    public void tearDown() {
    }

    @Test
   public void deberiaCalcularDescuentoMinimo(){
       assertEquals(1000, dcs.descuentoMinimo(dc.getProducto1()), 0);
       assertEquals(5000, dcs.descuentoMinimo(dc.getProducto2()), 0);
       assertEquals(10000, dcs.descuentoMinimo(dc.getProducto3()), 0);
  
   }
   
   @Test
   public void deberiaCalcularDescuentoMaximo(){
       assertEquals(5000, dcs.descuentoMaximo(dc.getProducto1()), 0);
       assertEquals(25000, dcs.descuentoMaximo(dc.getProducto2()), 0);
       assertEquals(50000, dcs.descuentoMaximo(dc.getProducto3()), 0);
   }
   
   @Test
   public void deberiaEstarSinDescuento(){
       assertEquals(10000, dcs.sinDescuento(dc.getProducto1()), 0);
       assertEquals(50000, dcs.sinDescuento(dc.getProducto2()), 0);
       assertEquals(100000, dcs.sinDescuento(dc.getProducto3()), 0);
   }
}
