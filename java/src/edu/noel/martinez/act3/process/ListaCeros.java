package edu.noel.martinez.act3.process;

import java.util.List;
import java.util.ArrayList;

public class ListaCeros {
    // Mueve todos los ceros al final
    public static List<Integer> moverCerosDerecha(List<Integer> numeros) {
        List<Integer> resultado = new ArrayList<>();
        int contadorCeros = 0;
        for (int n : numeros) {
            if (n == 0) contadorCeros++;
            else resultado.add(n);
        }
        for (int i = 0; i < contadorCeros; i++) {
            resultado.add(0);
        }
        return resultado;
    }

    // Cuenta números pares
    public static int contarPares(List<Integer> numeros) {
        int count = 0;
        for (int n : numeros) {
            if (n % 2 == 0) count++;
        }
        return count;
    }
}