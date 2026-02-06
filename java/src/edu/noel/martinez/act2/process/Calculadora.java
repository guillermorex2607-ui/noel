package edu.noel.martinez.act2.process;

// Clase principal Calculadora
public class Calculadora {
    public static int sumar(int a, int b) {
        return new Suma().realizarOperacion(a, b);
    }
    public static int restar(int a, int b) {
        return new Resta().realizarOperacion(a, b);
    }
    public static int multiplicar(int a, int b) {
        return new Multiplicacion().realizarOperacion(a, b);
    }
    public static int dividir(int a, int b) {
        return new Division().realizarOperacion(a, b);
    }
    public static int modulo(int a, int b) {
        return new Modulo().realizarOperacion(a, b);
    }
    public static int potencia(int base, int exp) {
        return new Potencia().realizarOperacion(base, exp);
    }
    public static int raiz(int indice, int operando) {
        return new Raiz().realizarOperacion(indice, operando);
    }
    public static int logaritmo(int base, int operando) {
        return new Logaritmo().realizarOperacion(base, operando);
    }
}