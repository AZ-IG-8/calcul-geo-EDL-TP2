package com.be.umons;

import com.be.umons.Produit;
import jdk.jfr.StackTrace;
import org.junit.Test;
import static org.junit.Assert.*;

public class SurfaceTest {

    @Test
    public void surfEquals(){
        System.out.println("Test Surface Equals");
        assertEquals(Surface.surfaceoperation(5, 3), 15);
    }

    @Test
    public void surfNotEquals(){
        System.out.println("Test Surface Not Equals");
        assertNotEquals(Surface.surfaceoperation(5, 3), 10);
    }

}
