package edu.noel.martinez.calculadoraV2.act2.process;

public class Logaritmo extends Operacion {
    @Override
    public int realizarOperacion(int base, int operando) {
        int resultado = 0;
        int potencia = 1;
        while (potencia <= operando) {
            potencia = new Multiplicacion().realizarOperacion(potencia, base);
            resultado = new Suma().realizarOperacion(resultado, 1);
        }
        return new Resta().realizarOperacion(resultado, 1);
    }
}