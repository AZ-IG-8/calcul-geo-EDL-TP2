package com.be.umons;

import com.be.umons.Produit;
import jdk.jfr.StackTrace;
import org.junit.Test;
import static org.junit.Assert.*;

public class PerimetreTest {

    @Test
    public void periEquals(){
        System.out.println("Test Perimetre Equals");
        assertEquals(Perimetre.perimetreoperation(5, 3, 2), 16);
    }

    @Test
    public void periNotEquals(){
        System.out.println("Test Perimetre Not Equals");
        assertNotEquals(Perimetre.perimetreoperation(5, 3, 2) , 10);
    }

}
