package edu.noel.martinez.act2.process;

public class Division {
    public static int realizarOperacion(int a, int b) {
        if (b == 0) throw new ArithmeticException("División por cero");
        int cociente = 0;
        int dividendo = Math.abs(a);
        int divisor = Math.abs(b);

        while (dividendo >= divisor) {
            dividendo = Resta.realizarOperacion(dividendo, divisor);
            cociente = Suma.realizarOperacion(cociente, 1);
        }

        if ((a < 0 && b > 0) || (a > 0 && b < 0)) {
            cociente = Resta.realizarOperacion(0, cociente);
        }
        return cociente;
    }
}