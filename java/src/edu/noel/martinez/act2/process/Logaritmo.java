package edu.noel.martinez.act2.process;

public class Logaritmo {
    public static int realizarOperacion(int base, int operando) {
        int resultado = 0;
        int potencia = 1;
        while (potencia <= operando) {
            potencia = Multiplicacion.realizarOperacion(potencia, base);
            resultado = Suma.realizarOperacion(resultado, 1);
        }
        return Resta.realizarOperacion(resultado, 1);
    }
}
