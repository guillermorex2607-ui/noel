package edu.noel.martinez.act3.process;

public class Strings {
    public static boolean esPalindromo(String texto) {
        String limpio = texto.replaceAll("\\s+", "").toLowerCase();
        int i = 0, j = limpio.length() - 1;
        while (i < j) {
            if (limpio.charAt(i) != limpio.charAt(j)) return false;
            i++; j--;
        }
        return true;
    }

    public static int contarVocales(String texto) {
        int count = 0;
        for (char c : texto.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(c) != -1) count++;
        }
        return count;
    }

    public static String invertir(String texto) {
        char[] chars = texto.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = chars.length - 1; i >= 0; i--) {
            sb.append(chars[i]);
        }
        return sb.toString();
    }

    public static int primeraOcurrencia(String texto, char c) {
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == c) return i;
        }
        return -1;
    }
}