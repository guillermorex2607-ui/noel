package Correccion.process;

public class Strings {

    public static boolean esPalindromo(String texto) {

        texto = texto.replace(" ", "").toLowerCase();
        String invertido = "";

        for (int i = texto.length() - 1; i >= 0; i--) {
            invertido += texto.charAt(i);
        }

        return texto.equals(invertido);
    }

    public static int contarVocales(String texto) {

        int contador = 0;
        texto = texto.toLowerCase();

        for (int i = 0; i < texto.length(); i++) {

            char c = texto.charAt(i);

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contador++;
            }
        }

        return contador;
    }

    public static String invertir(String texto) {

        String resultado = "";

        for (int i = texto.length() - 1; i >= 0; i--) {
            resultado += texto.charAt(i);
        }

        return resultado;
    }

    public static int primeraOcurrencia(String texto, char c) {

        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == c) {
                return i;
            }
        }

        return -1;
    }
}