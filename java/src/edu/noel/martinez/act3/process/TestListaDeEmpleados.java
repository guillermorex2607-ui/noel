package edu.noel.martinez.act3.process;

import edu.noel.martinez.act3.modelos.Empleado;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;


public class TestListaDeEmpleados {
    private final Empleado e1 = new Empleado("Ana", 22, 20000, "sistemas");
    private final Empleado e2 = new Empleado("Luis", 35, 30000, "ventas");
    private final Empleado e3 = new Empleado("Marta", 28, 25000, "sistemas");

    @Test
    public void testMayorSalario() {
        assertEquals(e2, ListaDeEmpleados.mayorSalario(Arrays.asList(e1,e2,e3)));
    }

    @Test
    public void testPromedioEdad() {
        assertEquals(28.33, ListaDeEmpleados.promedioEdad(Arrays.asList(e1,e2,e3)), 0.01);
    }

    @Test
    public void testContarSistemas() {
        assertEquals(2, ListaDeEmpleados.contarSistemas(Arrays.asList(e1,e2,e3)));
    }
}