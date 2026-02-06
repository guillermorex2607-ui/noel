package edu.noel.martinez.act2.process;

public class Multiplicacion {
    public static int realizarOperacion(int a, int b) {
        int resultado = 0;
        for (int i = 0; i < Math.abs(b); i++) {
            resultado = Suma.realizarOperacion(resultado, a);
        }
        return b < 0 ? Resta.realizarOperacion(0, resultado) : resultado;
    }
}