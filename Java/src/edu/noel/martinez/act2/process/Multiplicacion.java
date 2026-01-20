package edu.noel.martinez.act2.process;

/**
 * Clase que realiza la operacion de multiplicacion usando solo sumas.
 * @author noelmtz
 * @version 1.0
 */
public class Multiplicacion {

    /**
     * Multiplica dos numeros usando solo sumas.
     * @param a primer numero
     * @param b segundo numero
     * @return resultado de la multiplicacion
     */
    public double calcular(double a, double b) {
        double resultado = 0;
        boolean negativo = false;

        // Manejar negativos
        // Si el multiplicador es negativo, trabajamos con su absoluto y marcamos el resultado para invertirlo
        double multiplicador = b;
        if (multiplicador < 0) {
            negativo = true;
            multiplicador = -multiplicador;
        }

        // Sumar 'a' tantas veces como indique 'b'
        for (int i = 0; i < (int)multiplicador; i++) {
            resultado = resultado + a;
        }

        // Si el multiplicador original era negativo, invertimos el signo del resultado final
        if (negativo) {
            resultado = -resultado;
        }

        return resultado;
    }
}
