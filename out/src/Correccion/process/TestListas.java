package Correccion.process;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class TestListas {

    @Test
    public void testMoverCeros() {
        assertEquals(
                Arrays.asList(2,1,4,2,0,0),
                ListaCeros.moverCerosDerecha(Arrays.asList(0,2,1,4,0,2))
        );
    }

    @Test
    public void testContarPares() {
        assertEquals(
                2,
                ListaCeros.contarPares(Arrays.asList(3,4,5,7,6))
        );
    }
}