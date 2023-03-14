package edu.craptocraft.examenpoopresencial.barcos;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

class BarcoCruceroTest {
    
    @Test
    void test_methodsClass() {

        BarcoCrucero barcoCrucero = new BarcoCrucero(13);
        barcoCrucero.contarCamasOcupadas("cama1", "cama2", "cama3");
        assertEquals(3, barcoCrucero.getContador());
        assertEquals("SOS", barcoCrucero.mensajeSocorro("SOS"));
        assertNotNull(barcoCrucero.toString());
    }

}
