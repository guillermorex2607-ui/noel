package edu.noel.martinez.Act1.Ui;

import edu.noel.martinez.Act1.Data.Catalogo;
import edu.noel.martinez.Act1.Process.Auto;
import java.util.ArrayList;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CLI {
    public void iniciar() {
        Scanner sc = new Scanner(System.in);
        Auto[] autos = Catalogo.obtenerAutos();
        ArrayList<Auto> seleccionados = new ArrayList<>();

        System.out.println("=== Bienvenido al sistema de venta de vehículos ===");
        System.out.print("Ingrese su nombre: ");
        String cliente = sc.nextLine();

        boolean continuar = true;
        while (continuar) {
            System.out.println("\nAutos disponibles:");
            for (int i = 0; i < autos.length; i++) {
                System.out.println((i+1) + ". " + autos[i]);
            }

            System.out.print("Seleccione el número del auto que desea comprar: ");
            int opcion = sc.nextInt();
            if (opcion >= 1 && opcion <= autos.length) {
                seleccionados.add(autos[opcion-1]);
                System.out.println("Agregado: " + autos[opcion-1].getModelo());
            } else {
                System.out.println("Opción inválida.");
            }

            System.out.print("¿Desea elegir otro auto? (s/n): ");
            char resp = sc.next().toLowerCase().charAt(0);
            continuar = (resp == 's');
        }

        // Generar ticket
        double total = 0;
        System.out.println("\n=== Ticket de Venta ===");
        System.out.println("Cliente: " + cliente);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        System.out.println("Fecha: " + sdf.format(new Date()));

        System.out.println("\nAutos comprados:");
        for (Auto a : seleccionados) {
            System.out.println("- " + a.getModelo() + " $" + a.getPrecio());
            total += a.getPrecio();
        }

        System.out.println("\nTOTAL A PAGAR: $" + total);
        System.out.println("Gracias por su compra 🚗💨");
    }
}