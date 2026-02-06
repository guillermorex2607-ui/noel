package edu.noel.martinez.act2.process;

public class Potencia {
    public static int realizarOperacion(int base, int exponente) {
        int resultado = 1;
        for (int i = 0; i < exponente; i++) {
            resultado = Multiplicacion.realizarOperacion(resultado, base);
        }
        return resultado;
    }
}