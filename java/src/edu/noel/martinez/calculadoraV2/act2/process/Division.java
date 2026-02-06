package edu.noel.martinez.calculadoraV2.act2.process;

public class Division extends Operacion {
    @Override
    public int realizarOperacion(int a, int b) {
        if (b == 0) throw new ArithmeticException("División por cero");
        int cociente = 0;
        int dividendo = Math.abs(a);
        int divisor = Math.abs(b);

        while (dividendo >= divisor) {
            dividendo = new Resta().realizarOperacion(dividendo, divisor);
            cociente = new Suma().realizarOperacion(cociente, 1);
        }

        if ((a < 0 && b > 0) || (a > 0 && b < 0)) {
            cociente = new Resta().realizarOperacion(0, cociente);
        }
        return cociente;
    }
}