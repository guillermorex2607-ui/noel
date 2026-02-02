package edu.noel.martinez.act3.process;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestStrings {
    @Test
    public void testPalindromo() {
        assertFalse(Strings.esPalindromo("hola mundo"));
        assertTrue(Strings.esPalindromo("ana"));
    }

    @Test
    public void testVocales() {
        assertEquals(2, Strings.contarVocales("hola"));
    }

    @Test
    public void testInvertir() {
        assertEquals("aloh", Strings.invertir("hola"));
    }

    @Test
    public void testPrimeraOcurrencia() {
        assertEquals(1, Strings.primeraOcurrencia("hola", 'o'));
        assertEquals(-1, Strings.primeraOcurrencia("hola", 'r'));
    }
}