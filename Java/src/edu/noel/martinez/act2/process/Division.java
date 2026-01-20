package edu.noel.martinez.act2.process;

/**
 * Clase que realiza la operacion de division usando solo restas.
 * @author noelmtz
 * @version 1.0
 */
public class Division {

    /**
     * Divide dos numeros usando solo restas
     * @param a dividendo
     * @param b divisor
     * @return resultado de la division o 0 si el divisor es 0
     */
    public double calcular(double a, double b) {
        if (b == 0) {
            System.out.println("Error: no se puede dividir entre cero");
            return 0;
        }

        double resultado = 0;
        double resto = Math.abs(a);
        double divisorAbs = Math.abs(b);
        boolean negativo = false;

        // Manejar la logica de los signos
        if ((a < 0 && b > 0) || (a > 0 && b < 0)) {
            negativo = true;
        }

        // Restar el divisor del dividendo hasta que no se pueda mas
        while (resto >= divisorAbs) {
            resto = resto - divisorAbs;
            resultado = resultado + 1;
        }

        if (negativo) {
            resultado = -resultado;
        }

        return resultado;
    }
}