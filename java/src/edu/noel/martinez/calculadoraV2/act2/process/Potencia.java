package edu.noel.martinez.calculadoraV2.act2.process;

public class Potencia extends Operacion {
    @Override
    public int realizarOperacion(int base, int exponente) {
        int resultado = 1;
        for (int i = 0; i < exponente; i++) {
            resultado = new Multiplicacion().realizarOperacion(resultado, base);
        }
        return resultado;
    }
}