package edu.noel.martinez.calculadoraV2.act2.process;

public class Modulo extends Operacion {
    @Override
    public int realizarOperacion(int a, int b) {
        if (b == 0) throw new ArithmeticException("División por cero");
        int dividendo = Math.abs(a);
        int divisor = Math.abs(b);

        while (dividendo >= divisor) {
            dividendo = new Resta().realizarOperacion(dividendo, divisor);
        }
        return dividendo;
    }
}