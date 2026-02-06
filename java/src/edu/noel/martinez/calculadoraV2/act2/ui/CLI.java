package edu.noel.martinez.calculadoraV2.act2.ui;

import java.util.Scanner;
import edu.noel.martinez.calculadoraV2.act2.process.*;

public class CLI {
    public void iniciar() {
        Scanner sc = new Scanner(System.in);
        Calculadora calc = new Calculadora();
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

            Operacion op = switch (opcion) {
                case 1 -> new Suma();
                case 2 -> new Resta();
                case 3 -> new Multiplicacion();
                case 4 -> new Division();
                case 5 -> new Modulo();
                case 6 -> new Potencia();
                case 7 -> new Raiz();
                case 8 -> new Logaritmo();
                default -> null;
            };

            if (op != null) {
                int resultado = calc.operar(op, a, b);
                System.out.println("Resultado: " + resultado);
            } else {
                System.out.println("Opción inválida");
            }

        } while (opcion != 0);

        System.out.println("¡Hasta luego!");
        sc.close();
    }
}