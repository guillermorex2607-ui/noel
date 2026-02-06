package edu.noel.martinez.act2.process;

public class Calculadora {
    public static int sumar(int a, int b) { return Suma.realizarOperacion(a, b); }
    public static int restar(int a, int b) { return Resta.realizarOperacion(a, b); }
    public static int multiplicar(int a, int b) { return Multiplicacion.realizarOperacion(a, b); }
    public static int dividir(int a, int b) { return Division.realizarOperacion(a, b); }
    public static int modulo(int a, int b) { return Modulo.realizarOperacion(a, b); }
    public static int potencia(int base, int exp) { return Potencia.realizarOperacion(base, exp); }
    public static int raiz(int indice, int operando) { return Raiz.realizarOperacion(indice, operando); }
    public static int logaritmo(int base, int operando) { return Logaritmo.realizarOperacion(base, operando); }
}
