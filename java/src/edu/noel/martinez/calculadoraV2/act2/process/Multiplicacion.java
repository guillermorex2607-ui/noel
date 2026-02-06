package edu.noel.martinez.calculadoraV2.act2.process;

public class Multiplicacion extends Operacion {
    @Override
    public int realizarOperacion(int a, int b) {
        int resultado = 0;
        for (int i = 0; i < Math.abs(b); i++) {
            resultado = new Suma().realizarOperacion(resultado, a);
        }
        return b < 0 ? new Resta().realizarOperacion(0, resultado) : resultado;
    }
}