package edu.noel.martinez.act2.process;

public class Logaritmo {
    public int realizarOperacion(int base, int operando) {
        int resultado = 0;
        int potencia = 1;
        Multiplicacion mult = new Multiplicacion();
        Suma suma = new Suma();
        Resta resta = new Resta();

        while (potencia <= operando) {
            potencia = mult.realizarOperacion(potencia, base);
            resultado = suma.realizarOperacion(resultado, 1);
        }
        return resta.realizarOperacion(resultado, 1);
    }
}