/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import calculadora.Calculadora;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author PC04
 */
public class TestCalculadora {
   
    
    public TestCalculadora() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void sumaTest() {
     int sum = (int) (Calculadora.suma(8,4));
      assertEquals(sum, 12);
    }
    @Test
    public void restaTest() {
     int res = (int) (Calculadora.resta(8,4));
      assertEquals(res, 4);
    }
    @Test
    public void divideTest() {
     int div = (int) (Calculadora.divide(8,4));
      assertEquals(div, 2);
    }
    @Test
    public void multiplicaTest() {
     int mult = (int) (Calculadora.multiplica(0,4));
      assertEquals(mult, 0);
    }
    
    @Test
    public void sumaTest1() {
     int sum2 = (int) (Calculadora.suma2(0));
      assertEquals(sum2, 0);
    }
    @Test
    public void restaTest1() {
     int res2 = (int) (Calculadora.resta2(4));
      assertEquals(res2, 0);
    }
    @Test
    public void divideTest1() {
     int div2 = (int) (Calculadora.divide2(1));
      assertEquals(div2, 12);
    }
    @Test
    public void multiplicaTest1() {
     int mult2 = (int) (Calculadora.multiplica2(1));
      assertEquals(mult2, 12);
    }
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
