package edu.noel.martinez.calculadoraV2.act2.process;

public class Raiz extends Operacion {
    @Override
    public int realizarOperacion(int indice, int operando) {
        int resultado = 0;
        while (new Potencia().realizarOperacion(resultado, indice) <= operando) {
            resultado = new Suma().realizarOperacion(resultado, 1);
        }
        return new Resta().realizarOperacion(resultado, 1);
    }
}