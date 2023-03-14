package edu.craptocraft.examenpoopresencial.barcos;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

class BarcoPortaavionesTest {
    
    @Test
    void test_methodsClass() {

        BarcoPortaaviones barcoPortaaviones = new BarcoPortaaviones(13, 30);
        assertEquals(13, barcoPortaaviones.getNumAviones());
        assertEquals(30, barcoPortaaviones.getNumMarineros());
        assertEquals("SOS", barcoPortaaviones.mensajeSocorro("SOS"));
        assertNotNull(barcoPortaaviones.toString());
    }

}
