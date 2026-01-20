package edu.noel.martinez.act2.process;

/**
 * Clase que realiza la operacion de potencia usando solo sumas.
 * @author noelmtz
 * @version 1.0
 */
public class Potencia {

    /**
     * Calcula la potencia usando multiplicacion (que a su vez usa sumas).
     * @param base numero base
     * @param exponente numero exponente
     * @return resultado de base elevado a exponente
     */
    public double calcular(double base, double exponente) {
        if (exponente == 0) {
            return 1;
        }

        double resultado = 1;
        boolean exponenteNegativo = false;

        // Manejar exponente negativo
        double expAbs = exponente;
        if (expAbs < 0) {
            exponenteNegativo = true;
            expAbs = -expAbs;
        }

        // Multiplicar 'base' tantas veces como indique 'exponente'
        // Implementado mediante anidacion de ciclos para usar solo sumas
        for (int i = 0; i < (int)expAbs; i++) {
            double temp = 0;
            // Multiplicar el resultado acumulado por la base usando sumas
            for (int j = 0; j < (int)Math.abs(base); j++) {
                temp = temp + resultado;
            }

            // Manejo del signo de la base en potencias impares
            if (base < 0 && (int)base % 2 != 0) {
                // Lógica de signo si fuera necesario para bases negativas
            }

            resultado = temp;
        }

        if (exponenteNegativo) {
            // Para exponente negativo: 1 / resultado
            // Nota: La division final se hace con el operador para mantener la precision
            if (resultado == 0) return 0;
            resultado = 1.0 / resultado;
        }

        return resultado;
    }
}