/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javashop;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author adamm
 */
public class ProductTest {
    
    Basket koszyk = new Basket();
    Product product;
   
    @Test
    public void testGetName() {
        product = new Product("Banan",1);
        assertEquals("Banan", product.getName());
    }

    @Test
    public void testSetName() {
        product = new Product();
        product.setName("Banan");
        assertEquals("Banan", product.getName());
    }
    
    @Test (expected = IllegalArgumentException.class)
    public void testSetNameNull() {
        product = new Product(null,1);
        assertEquals(null, product.getName());
    }
    
    @Test (expected = IllegalArgumentException.class)
    public void testSetNameEmpty() {
        product = new Product("",1);
        assertEquals("", product.getName());
    }

    @Test
    public void testGetPrice() {
        product = new Product("Banan",1.0);
        assertTrue(Math.abs(product.getPrice()-1.0) == 0);
    }

    @Test 
    public void testSetPrice() {
        product = new Product();
        product.setPrice(1);
        assertTrue(Math.abs(product.getPrice()-1.0) == 0);
    }
    
    @Test 
    public void testSetPriceZero() {
        product = new Product();
        product.setPrice(0);
        assertTrue(Math.abs(product.getPrice()-0) == 0);
    }
    
    @Test (expected = IllegalArgumentException.class)
    public void testSetPriceMinus() {
        product = new Product();
        product.setPrice(-1);
        assertTrue(Math.abs(product.getPrice()-(-1)) == 0);
    }
    
}
