package edu.noel.martinez.calculadoraV2.act2.process;

public class Calculadora {

    public int operar(Operacion op, int a, int b) {
        return op.realizarOperacion(a, b);
    }
}