package edu.noel.martinez.act2.process;

/**
 * Clase que realiza la operacion de modulo usando solo restas.
 * @author noelmtz
 * @version 1.0
 */
public class Modulo {

    /**
     * Calcula el modulo (resto de la division) usando solo restas.
     * @param a dividendo
     * @param b divisor
     * @return resto de la division o 0 si el divisor es 0
     */
    public double calcular(double a, double b) {
        if (b == 0) {
            System.out.println("Error: no se puede calcular modulo con cero");
            return 0;
        }

        // Convertir a positivos para el calculo del residuo
        double dividendoAbs = (a < 0) ? -a : a;
        double divisorAbs = (b < 0) ? -b : b;

        double resto = dividendoAbs;

        // Restar el divisor del dividendo hasta que el resto sea menor que el divisor
        while (resto >= divisorAbs) {
            resto = resto - divisorAbs;
        }

        return resto;
    }
}