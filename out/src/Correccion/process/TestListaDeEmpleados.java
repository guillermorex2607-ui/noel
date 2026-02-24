package Correccion.process;

import Correccion.model.Empleado;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TestListaDeEmpleados {

    private Empleado e1;
    private Empleado e2;
    private Empleado e3;
    private List<Empleado> empleados;

    @Before
    public void setUp() {
        e1 = new Empleado("Carlos", 24, 21000, "sistemas");
        e2 = new Empleado("Daniela", 36, 32000, "ventas");
        e3 = new Empleado("Roberto", 29, 26000, "sistemas");

        empleados = Arrays.asList(e1, e2, e3);
    }

    @Test
    public void testMayorSalario() {
        assertEquals(e2, ListaEmpleado.mayorSalario(empleados));
    }

    @Test
    public void testPromedioEdad() {
        assertEquals(29.66, ListaEmpleado.promedioEdad(empleados), 0.01);
    }

    @Test
    public void testContarSistemas() {
        assertEquals(2, ListaEmpleado.contarSistemas(empleados));
    }
}