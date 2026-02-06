package edu.noel.martinez.act2.process;

public class Raiz {
    public static int realizarOperacion(int indice, int operando) {
        int resultado = 0;
        while (Potencia.realizarOperacion(resultado, indice) <= operando) {
            resultado = Suma.realizarOperacion(resultado, 1);
        }
        return Resta.realizarOperacion(resultado, 1);
    }
}