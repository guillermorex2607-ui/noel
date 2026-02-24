package Correccion.process;

import java.util.ArrayList;
import java.util.List;

public class ListaCeros {

    public static List<Integer> moverCerosDerecha(List<Integer> numeros) {

        List<Integer> nuevaLista = new ArrayList<>();
        int cantidadCeros = 0;

        for (int i = 0; i < numeros.size(); i++) {

            if (numeros.get(i) == 0) {
                cantidadCeros++;
            } else {
                nuevaLista.add(numeros.get(i));
            }
        }

        for (int i = 0; i < cantidadCeros; i++) {
            nuevaLista.add(0);
        }

        return nuevaLista;
    }

    public static int contarPares(List<Integer> numeros) {

        int contador = 0;

        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) % 2 == 0) {
                contador++;
            }
        }

        return contador;
    }
}