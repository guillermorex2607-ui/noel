package edu.noel.martinez.act2.process;

public class Modulo {
    public static int realizarOperacion(int a, int b) {
        if (b == 0) throw new ArithmeticException("División por cero");
        int dividendo = Math.abs(a);
        int divisor = Math.abs(b);

        while (dividendo >= divisor) {
            dividendo = Resta.realizarOperacion(dividendo, divisor);
        }
        return dividendo;
    }
}