package edu.craptocraft.examenpoopresencial.barcos;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

class BarcoPesqueroTest {
    
    @Test
    void test_methodsClass() {

        BarcoPesquero barcoPesquero = new BarcoPesquero(13, 50, 8);
        assertEquals(13, barcoPesquero.getMetrosEslora());
        assertEquals(50, barcoPesquero.getPotencia());
        assertEquals(8, barcoPesquero.getNumPescadores());
        assertEquals("SOS", barcoPesquero.mensajeSocorro("SOS"));
        assertNotNull(barcoPesquero.toString());
    }

}
