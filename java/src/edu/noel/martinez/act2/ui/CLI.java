package edu.noel.martinez.act2.ui;

import edu.noel.martinez.act2.process.Calculadora;

import java.util.Scanner;

public class CLI {
    public void iniciar() {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n=== CALCULADORA ===");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Módulo");
            System.out.println("6. Potencia");
            System.out.println("7. Raíz");
            System.out.println("8. Logaritmo");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            if (opcion == 0) break;

            System.out.print("Ingresa el primer número: ");
            int a = sc.nextInt();
            System.out.print("Ingresa el segundo número: ");
            int b = sc.nextInt();

            int resultado = 0;

            switch (opcion) {
                case 1: resultado = Calculadora.sumar(a, b); break;
                case 2: resultado = Calculadora.restar(a, b); break;
                case 3: resultado = Calculadora.multiplicar(a, b); break;
                case 4: resultado = Calculadora.dividir(a, b); break;
                case 5: resultado = Calculadora.modulo(a, b); break;
                case 6: resultado = Calculadora.potencia(a, b); break;
                case 7: resultado = Calculadora.raiz(a, b); break;
                case 8: resultado = Calculadora.logaritmo(a, b); break;
                default: System.out.println("Opción inválida"); continue;
            }

            System.out.println("Resultado: " + resultado);

        } while (opcion != 0);

        System.out.println("¡Hasta luego!");
        sc.close();
    }
}