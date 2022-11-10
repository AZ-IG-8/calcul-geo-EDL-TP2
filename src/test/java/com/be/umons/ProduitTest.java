package com.be.umons;

import com.be.umons.Produit;
import jdk.jfr.StackTrace;
import org.junit.Test;
import static org.junit.Assert.*;

public class ProduitTest {

    @Test
    public void multiEquals(){
        System.out.println("Test Multiplication Equals");
        assertEquals(Produit.multiply(5, 3), 15);
    }

    @Test
    public void multiNotEquals(){
        System.out.println("Test Multiplication Not Equals");
        assertNotEquals(Produit.multiply(5,3), 10);
    }


}
